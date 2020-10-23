import javax.swing.JOptionPane;

public class TesteExcecaoArray{
    public static void main (String[] args){
        String nomes[] = {"Alex", "Pedro", "Maria", "Vanessa", "Caroline"};
        
        for (int i=0; i<=5; i++){
            try{
                System.out.println("Passei "+(i+1));
                System.out.println(nomes[i] + "\n");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Indice inválido: " + i);
            }
        }
        
        System.out.println("Fim de Programa!"); // é executada mesma com a exceção - se não tivessemos usamos try-catch, não seria executada
    }
}