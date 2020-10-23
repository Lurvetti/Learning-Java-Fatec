public class FuncionarioNovo extends PessoaNova{
    private float salario;

    // Construtor
    public FuncionarioNovo(float salario, String nome, Data nascimento){
        super(nome, nascimento);
        this.salario = salario;
    }

    // GETSETTERS
    public float getSalario(){return this.salario;}
    public void setCodigo(float salario){this.salario = salario;}

    // toString()
    @Override
    public String toString(){
        return "Funcionario [ Salário - " + salario + ", " + super.toString() + "]";
    }

    // Calcular Imposto
    public float calculaImposto(){
        return salario * .03f;
    }
}
