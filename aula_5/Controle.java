import javax.swing.JOptionPane;
import java.time.LocalDate;

public class Controle {

    static DespesaPessoal despesas;
    static int dia, mes, ano;
    static String itemDespesa;
    static double valor;
    static String cpf;
    public static void main(String[] args){
        cpf = JOptionPane.showInputDialog("Cpf: ");
        despesas = new DespesaPessoal(cpf);
        controleDespesas();
    }

    public static void controleDespesas(){
        String opcao = "";
        do{
            opcao = JOptionPane.showInputDialog(
                "1 - Lançamneto de Despesa\n" +
                "2 - Total geral de despesas\n" +
                "3 - Total de despesas mês/ano\n" +
                "4 - Total de despesas dia/mês/ano\n" +
                "5 - Imprimir todas as despesas\n" +
                "6 - Imprimir despesas de um mês/ano\n" +
                "7 - Imprimir despesas de um dia/mês/ano\n" +
                "8 - Sair"
            );
            switch(opcao){
                case "1":
                    entradaDespesa();
                break;
                case "2":
                    JOptionPane.showMessageDialog(null,"Total de Despesas: " +  despesas.getTotal());
                break;
                case "3":
                    entradaMes();
                    entradaAno();
                    JOptionPane.showMessageDialog(null,"Total de Despesas: "+mes+"/"+ano+" = "+
                        despesas.getTotal(mes, ano));
                break;
                case "4":
                    entradaDia();
                    entradaMes();
                    entradaAno();
                    JOptionPane.showMessageDialog(null,"Total de Despesas: "+dia+"/"+mes+"/"+ano+" = "+
                        despesas.getTotal(LocalDate.of(ano, mes,dia)));
                break;
                case "5":
                    despesas.imprime();
                break;
                case "6":
                    entradaMes();
                    entradaAno();
                    despesas.imprime(mes, ano);
                break;
                case "7":
                    entradaDia();
                    entradaMes();
                    entradaAno();
                    despesas.imprime(ano, mes, dia);
                break;
            }
        }while(!opcao.equals("8"));
    }

    public static void entradaDespesa(){
        itemDespesa = JOptionPane.showInputDialog("Despesa: ");
        entradaDia();
        entradaMes();
        entradaAno();
        valor = Double.valueOf(JOptionPane.showInputDialog("Valor: "));
        despesas.despesas.add(new Despesa(LocalDate.of(ano, mes, dia), itemDespesa, valor));
    }

    public static void entradaDia(){
        dia = Integer.valueOf(JOptionPane.showInputDialog("Dia: "));
    }
    public static void entradaMes(){
        mes = Integer.valueOf(JOptionPane.showInputDialog("Mês: "));
    }
    public static void entradaAno(){
        ano = Integer.valueOf(JOptionPane.showInputDialog("Ano: "));
    }
}
