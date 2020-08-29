import java.util.Scanner;

public class review {
    public static void main(String args[]){
        
        Scanner meuScanner = new Scanner(System.in);
        System.out.println("Digite o seu nome:");

        String name = meuScanner.nextLine();
        System.out.println("Seu nome é: " + name);

        System.out.println("Digite a primeira nota: ");
        float nota1 = meuScanner.nextInt();
        System.out.println("Digite a segunda nota: ");
        float nota2 = meuScanner.nextInt();
        System.out.println("Media: " + (nota1+nota2)/2);

        meuScanner.close();
    }
}