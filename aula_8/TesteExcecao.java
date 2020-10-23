import javax.swing.JOptionPane;

public class TesteExcecao{
    public static void main (String[] args){
        int n1, n2;
        boolean excecao;

        do{
            excecao = false;
            try{
                n1 = Integer.valueOf(JOptionPane.showInputDialog("Entre com o 1o número"));
                n2 = Integer.valueOf(JOptionPane.showInputDialog("Entre com o 2o número"));
                JOptionPane.showMessageDialog(null, ""+n1+" / "+n2+ " = "+(n1/n2)) ;

            } catch (NumberFormatException e){  // (Exception e) qualquer tipo de ex
                e.printStackTrace(); // printa detalhes da exceção
                JOptionPane.showMessageDialog(null, "Digite somente números inteiros!!");
                excecao = true;
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, "Divisão por ZERO!!");
                excecao = true;
            } finally { // sempre é executado, com exceção ou não
                if(excecao)
                    JOptionPane.showMessageDialog(null, "Deu problema!");
                else
                    JOptionPane.showMessageDialog(null, "Fim do Programa!");
            }
        } while(excecao);
    }
}