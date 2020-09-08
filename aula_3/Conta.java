import java.util.Scanner;

public class Conta {
    int conta_numero, conta_tipo;
    long conta_saldo;
    int agencia_numero, banco_numero;
    String agencia_nome, banco_nome;
    
    Scanner meuScanner = new Scanner(System.in);

    public void abrirConta(){
        conta_saldo = 0;
        System.out.println("\n\tABERTURA DE CONTA");
        System.out.println("\nDigite o código do tipo da conta: \n1 - corrente\n2 - poupança\n3 - conjunta");
        conta_tipo = meuScanner.nextInt();
        System.out.println("Digite o número da conta: ");
        conta_numero = meuScanner.nextInt();
        System.out.println("Digite o nome do banco: ");
        banco_nome = meuScanner.next();
        System.out.println("Digite o número do banco: ");
        banco_numero = meuScanner.nextInt();
        System.out.println("Digite o nome da agência: ");
        agencia_nome = meuScanner.next();
        System.out.println("Digite o número da agência: ");
        agencia_numero = meuScanner.nextInt();

        System.out.println("\nAbertura de conta realizada com sucesso!");
    }

    public void encerrarConta(){
        if(conta_saldo >= 0){
            conta_tipo = 4;
            System.out.println("\nO saldo da conta sendo encerrada é: " + conta_saldo);
            conta_saldo = 0;
        }else{
            System.out.println("Você não pode encerrar sua conta com saldo negativo!");
        }
    }

    public void consultarSaldo(){
        System.out.println("\t\nSTATUS\t");
        System.out.println("O saldo da conta é: " + conta_saldo);
        if (conta_tipo == 4){
            System.out.println("Conta encerrada!");
        }
    }

    public void creditarConta(int valor_deposito){
        if(conta_tipo == 4){
            System.out.println("\nConta encerrada!");
        }else{
            System.out.printf("\nO valor de %d foi depositado.", valor_deposito);
            conta_saldo += valor_deposito;
        }
    }

    public void debitarConta(int valor_debito){
        if(conta_tipo == 4){
            System.out.println("\nConta encerrada!");
        }else{
            System.out.printf("\nO valor de %d foi debitado.", valor_debito);
            conta_saldo -= valor_debito;
        }
    }
}
