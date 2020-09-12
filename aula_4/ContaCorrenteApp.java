public class ContaCorrenteApp {
    public static void main(String[] args){
        ContaCorrente c01 = new ContaCorrente();

        c01.setNome("Lucas Rodrigues Schiavetti");
        c01.setIdade(30);
        c01.setGenero('M');
        c01.setContaConjunta(false);
        c01.setNumeroConta(283681);

        c01.Saldo();

        c01.Deposito(30);
        c01.Saque(15);
        c01.Deposito(-300);
        c01.Saque(-156);
        c01.Saque(3000);

        ContaCorrente c02 = new ContaCorrente("Gabes", 31,
        'M', 1909, true);

        c02.Saldo();
        c02.Deposito(1500);
        c02.Saque(250);
        
    }
}
