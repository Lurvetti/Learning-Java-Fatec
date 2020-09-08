public class ContaApp {
    public static void main(String[] args){
        Conta minha_conta = new Conta();
        
        minha_conta.abrirConta();
        minha_conta.consultarSaldo();
        minha_conta.creditarConta(50);
        minha_conta.debitarConta(20);
        minha_conta.encerrarConta();
        minha_conta.consultarSaldo();
        
    }
}
