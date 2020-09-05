public class Retangulo {

    //atributos
    double base;
    double altura;
    String cor;

    //métodos
    public double calcularArea(){
        return base * altura;
    }

    public double calcularPerimetro(){
        return 2 * (base + altura);
    }
}
