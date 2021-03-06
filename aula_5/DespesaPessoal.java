import java.util.ArrayList;
import java.time.LocalDate;

public class DespesaPessoal{
    //  Atributos
    private String cpf;
    public ArrayList<Despesa> despesas = new ArrayList<Despesa>();

    //  Construtor
    DespesaPessoal(String cpf){
        this.cpf = cpf;
    }
    
    //  Total geral de despesas
    public double getTotal(){
        double total = 0;
        for(Despesa desp: despesas){
            total += desp.getValor();
        }
        return total;
    }

    // ------------------------------------------------------------
    // IMPLEMENTAR DEPOIS!!!
    public double getTotal(int mes, int ano){
        double total = 0;
        for (Despesa desp: despesas){
            if (desp.getData().getMonthValue() == mes && 
            desp.getData().getYear() == ano )
                total += desp.getValor();
        }
        return total;
    }

    public double getTotal(LocalDate data){
    double total = 0;
        for (Despesa desp: despesas){
            if (desp.getData().equals(data))
                total += desp.getValor();
        }
        return total;
    }

    public void imprime(){
        String space = "             ";
        System.out.println("----------------------");
        System.out.println("CPF: " + this.getCpf());
        System.out.println("----------------------");

        for(Despesa desp: despesas){
            System.out.println(
                (desp.getDescDespesa()+space).substring(0, 30) + "\t" + 
                desp.getData() + "\t\t"+
                desp.getValor()
            );
        }
        System.out.println("----------------------");
        System.out.println(space + "\t\t\t\t" + this.getTotal());
    }

    public void imprime(int mes, int ano){

    }
    public void imprime(LocalDate data){

    }
    // -----------------------------------------------------------



    // getset
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    //  toString()
    @Override
    public String toString(){
        return "Despesa Pessoal [CPF: " + cpf + "| Despesas: " + despesas + "]";
    }

    



}
