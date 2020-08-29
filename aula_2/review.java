import java.util.Scanner;

public class review {
    public static void main(String args[]){
        
        Scanner meuScanner = new Scanner(System.in);
        System.out.println("Digite o seu nome:");

        String name = meuScanner.nextLine();
        System.out.println("Seu nome eh: " + name);
    }
}