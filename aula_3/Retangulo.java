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
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Cor: " + cor);
        System.out.println("Area: " + calcularArea());
        System.out.println("Perimetro: " + calcularPerimetro());
    }
}