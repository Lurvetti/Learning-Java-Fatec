public class Gerente extends Funcionario{
    private int senha;
    
    public Gerente(int senha){
        super();
        this.senha = senha;
    }

    @Override
    public String toString(){
        return "Gerente -  " + super.toString();
    }

    public boolean autentica(int senha){
        if (senha == 1234) return true;
        return false;
    }
}
