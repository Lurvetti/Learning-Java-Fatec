public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;


    Funcionario(){

    }
    
    public String toString(){
        return "Funcionario [ nome - " +nome+ " cpf - " +cpf+ " salario - " +salario+ "]";
    }


    public String getNome(){
        return nome;
    }
    public String getCpf(){
        return cpf;
    }
    public double getSalario(){
        return salario;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public void setSalario(Double salario){
        this.salario = salario;
    }
}
