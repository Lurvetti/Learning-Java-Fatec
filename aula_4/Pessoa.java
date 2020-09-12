public class Pessoa {
    // atributos
    private String nome;
    private String  cpf;
    private double altura;
    private double peso;


    // Setter - altera valor
    public void setNome(String nome){
        this.nome = nome;
    }
    // Getter - consulta valor
    public String getNome(){
        return this.nome;
    }

    public void setCPF(String cpf){
        this.cpf = cpf;
    }
    public String getCPF(){
        return this.cpf;
    }


    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getAltura(){
        return this.altura;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }
    public double getPeso(){
        return this.peso;
    }
}
