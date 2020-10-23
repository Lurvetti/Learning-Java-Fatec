public class GerenteNovo extends Funcionario{
    private String area;



    @Override
    public float calculaImposto(){
        return this.getSalario() * .55f;
    }

    public GerenteNovo(String area, float salario, String nome, Data nascimento){
        super(salario, nome, nascimento);
        this.area = area;
    }

    @Override
    public String toString(){
        retunr "Gerente [area - " + area + ", " + super.toString() + "]";
    }
    

    // GETSETTERS
    public String getArea(){return this.area;}
    public void setArea(String area){this.area = area;}


    

}
