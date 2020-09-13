public class AlunoApp {
    public static void main(String[] args){
        Aluno al01 = new Aluno();
        al01.setNome("Lucas");
        al01.setMatricula("9999a77");
        al01.setNotas(7d, 7d);
        //al01.setNotaReavaliacao(10d);

        Aluno al02 = new Aluno("Gabes", "8456sas1", 8d, 1d, 6.5d);

        System.out.println(al01);
        al01.printarNotas();
        System.out.println("Média com duas notas: " + al01.calcularMedia());
       // System.out.println("Média com reavaliação: " + al01.calcularMediaFinal());
        
        
        System.out.println(al02);
        al02.printarNotas();
        System.out.println("Média com duas notas: " + al02.calcularMedia());
        System.out.println("Média com reavaliação: " + al02.calcularMediaFinal());
    }
}
