import java.util.Scanner;

public class Animal{
    String nome, classe, familia;
    int idade;
    boolean estado;
    short caloria, forca;

    Scanner meuScanner = new Scanner(System.in);    

    public void nascer(){
        System.out.println("Digite o nome do animal: ");
        nome = meuScanner.nextLine();
        System.out.println("Digite a classe do animal: ");
        classe = meuScanner.nextLine();
        System.out.println("Digite a familia do animal: ");
        familia = meuScanner.nextLine();

        forca = 10; caloria = 10; idade = 0; estado = true;
    }    

    public void morrer(){
        forca = 0; estado = false;
    }

    public void comer(){
        if (estado == true && caloria < 100){
            caloria += 10;
            forca -= 2;
        }   
    }
    public void correr(){
        if (estado == true && caloria >0){
            caloria -= 5;
            forca -= 5;
        }
    }
    public void dormir(){
        if (estado == true){
            caloria -= 2;
            forca += 10;
        }
    }

    public void status(){
        System.out.println("\n\nSTATUS");
        System.out.println("Nome - " + nome);
        System.out.println("Classe - " + classe);
        System.out.println("Familia - " + familia);
        System.out.println("estado - " + estado);
        System.out.println("forca - " + forca);
        System.out.println("caloria - " + caloria);
    }

}
