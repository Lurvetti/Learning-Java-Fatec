public class PessoaApp {
    public static void main(String[] args){
        Pessoa p01 = new Pessoa();

        p01.setNome("Lucas");
        p01.setCPF("3689336548");
        p01.setAltura(1.88);
        p01.setPeso(80);

        System.out.println("Nome - " + p01.getNome());
        System.out.println("CPF - " + p01.getCPF());
        System.out.println("Altura - " + p01.getAltura());
        System.out.println("Peso - " + p01.getPeso());

    }
}
