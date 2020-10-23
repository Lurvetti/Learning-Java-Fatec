public class teste {
    public static void main(String[] args){
        
        // Fornecedor
        Fornecedor f01 = new Fornecedor("Pedro", "(11) 9999-0987");
        
        // FornecedorPessoa
        FornecedorPessoa fp01 = new FornecedorPessoa("Maria", "(11) 88888-1117", "1212", "22222");

        //FornecedorPessoa fe01 = new FornecedorEmpresa("XPTO", "(11) 5005-7849", "99999999", "021540");
        
        System.out.println(f01);
        System.out.println(fp01);
        //System.out.println(fe01);
    }
}
