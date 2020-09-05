public class TestaRetangulo {
    public static void main(String[] args) {
        Retangulo ret01 = new Retangulo();
        Retangulo ret02 = new Retangulo();
        
        ret01.altura = 5;
        ret01.base = 10;
        ret01.cor = "Vermelho";

        ret02.altura = 20;
        ret02.base = 30;
        ret02.cor = "Amarelo";
        
        ret01.imprimirDados();
        ret02.imprimirDados();
    }
}
