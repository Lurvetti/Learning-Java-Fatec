public class ContaCorrente {
    private String nome;
    private int idade;
    private char genero;
    private int numeroConta;
    private boolean contaConjunta;
    private double saldo;

    // CONSTRUTOR SEM PARÂMETROS
    ContaCorrente(){
    }

    // CONSTRUTOR COM PARÂMETROS
    ContaCorrente(  String nome, int idade,
                    char genero, int numeroConta,
                    boolean contaConjunta
                ){
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.numeroConta = numeroConta;
        this.contaConjunta = contaConjunta;
    }


    // Nome
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    // Idade
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return this.idade;
    }

    // Gênero
    public void setGenero(char genero){
        this.genero = genero;
    }
    public char getGenero(){
    return this.genero;
    }

    // Número da conta
    public void setNumeroConta(int numeroConta){
        this.numeroConta = numeroConta;
    }
    public long getNumeroConta(){
    return this.numeroConta;
    }

    // Conta conkunta
    public void setContaConjunta(boolean contaConjunta){
        this.contaConjunta = contaConjunta;
    }
    public boolean getContaConjunta(){
        return this.contaConjunta;
    }

    // Saldo
    public double getSaldo(){
        return this.saldo;
    }

    // ----MÉTODOS ----

    //verificar saldo
    public void Saldo(){
        System.out.println("--------------------------------");
        System.out.println("Nome do cliente: " + this.getNome());
        System.out.println("Idade do cliente: " + this.getIdade());
        System.out.println("Número da conta: " + this.getNumeroConta());
        if(this.getContaConjunta())
            System.out.println("Conta conjunta: Sim");
        else
            System.out.println("Conta conjunta: Não");
        System.out.println("Saldo da conta: " + this.getSaldo() + " reais");
        System.out.println("--------------------------------");
    }

    // saque de valor
    public void Saque(float valorSaque){
        if(valorSaque <= 0)
            System.out.println("Saque com valor inválido ("+valorSaque+")");
        else{
            if(valorSaque > this.saldo){
                System.out.println("Não há saldo disponível para o valor de " + valorSaque);
            }else{
                this.saldo -= valorSaque;
                System.out.println("O valor de " + valorSaque + " foi sacado.");
            }    
        }
        this.Saldo();
    }

    // depósito de valor
    public void Deposito(float valorDeposito){
        if (valorDeposito > 0){
            this.saldo += valorDeposito;
            System.out.println("O valor de " + valorDeposito + " foi depositado."); 
        }else{
            System.out.println("Depósito com valor inválido ("+valorDeposito+")");
        }
        this.Saldo();
    }

 





    




}
