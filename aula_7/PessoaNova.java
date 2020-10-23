public class PessoaNova {
    private String nome;
    private Data nascimento;
    

    public void imprimeDados(){
        System.out.println(this.toString());
    }


    public PessoaNova(){
        
    }

    public PessoaNova (String nome, Data nascimento){
        this.nome = nome;
        this.nascimento = nascimento;
    }

    @Override
    public String toString(){
        return "Pessoa [Nome - " + nome + " Nascimento - " + nascimento + "]";
    }

    public String getNome(){return this.nome;}
    public Data getNascimento(){return this.nascimento;}
    public void setNome(String nome){this.nome = nome;}
    public void setNascimento(Data nascimento){this.nascimento = nascimento;}


}
