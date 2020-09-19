import java.time.LocalDate;

public class Despesa {
    //  ATRIBUTOS
    private LocalDate data;
    private String descDespesa;
    private double valor;

    //  CONSTRUTOR
    public Despesa(LocalDate data, String descDespesa, double valor){
        super();
        this.data = data;
        this.descDespesa = descDespesa;
        this.valor = valor;
    }

    //  toString()
    @Override
    public String toString(){
        return("Despesa [ Data: " + data + "| Descrição: " + descDespesa + "| Valor: " + valor + " ]");
    }

    //  SETGET
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getDescDespesa() {
        return descDespesa;
    }
    public void setDescDespesa(String descDespesa) {
        this.descDespesa = descDespesa;
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
}
