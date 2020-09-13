public class Aluno{

    private String nome;
    private String matricula;
    private double nota1;
    private double nota2;
    private double notaReavaliacao;

    // CONSTRUTORES
    Aluno(){
    }
    Aluno(String nome, String matricula, double nota1, double nota2, double notaReavaliacao){
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaReavaliacao = notaReavaliacao;
    }

    // toString()
    public String toString(){
        String message = ("\nEsse é o objeto do aluno " + this.nome);
        message += ("\nMatrícula - " + this.matricula);
        return message;
    }

    // ENCAPSULAMENTO
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public String getMatricula(){
        return this.matricula;
    }

    public void setNotas(double nota1, double nota2){
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    public double[] getNotas(){
        double notas[] = {this.nota1, this.nota2};
        return (notas);
    }

    public void setNotaReavaliacao(double notaReavaliacao){
        this.notaReavaliacao = notaReavaliacao;
    }
    public double getNotaReavaliacao(){
        return this.notaReavaliacao;
    }

    public void printarNotas(){
        System.out.println("Nota 1: " + getNotas()[0]);
        System.out.println("Nota 2: " + getNotas()[1]);
    }

    public double calcularMedia(){
        return (this.nota1 + this.nota2) / 2;
    }

    public double calcularMediaFinal(){
        if(calcularMedia() >= 6){
            return calcularMedia(); 
        }else{
            System.out.println("Nota da reavaliação: " + this.notaReavaliacao);
            return (calcularMedia() + this.notaReavaliacao) / 2;
        }
    }
}