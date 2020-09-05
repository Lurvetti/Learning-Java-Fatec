public class Retangulo {

    // atributos
    double base;
    double altura;
    String cor;

    // métodos
    public double calcularArea(){
        return base * altura;
    }

    public double calcularPerimetro(){
        return 2 * (base + altura);
    }

    public void imprimirDados(){
        System.out.println();
        System.out.println(base);
        System.out.println(altura);
        System.out.println(cor);
        System.out.println("Area: " + calcularArea());
        System.out.println("Perimetro: " + calcularPerimetro());
    }
}