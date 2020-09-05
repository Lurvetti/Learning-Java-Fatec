public class TestaRetangulo {
    public static void main(String[] args) {
        Retangulo ret01 = new Retangulo();
        System.out.println(ret01);

        ret01.altura = 5;
        ret01.base = 10;
        
        System.out.println(ret01.calcularArea());
    }
}
