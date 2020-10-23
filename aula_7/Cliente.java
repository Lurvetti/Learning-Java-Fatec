public class Cliente extends PessoaNova{
    private int codigo;




    
    // Construtor
    public Cliente(int codigo, String nome, Data nascimento){
        super(nome, nascimento);
        this.codigo = codigo;
    }

    // toString();
    @Override
    public String toString(){
        return "Cliente - Código" + super.toString();
    }

    // GETSETTERS
    public int getCodigo(){return this.codigo;}
    public void setCodigo(int codigo){this.codigo = codigo;}
}
