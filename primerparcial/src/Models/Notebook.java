package Models;

public class Notebook extends ProductoInformatico{
    private Integer gbMemoria;

    public Notebook(Integer stock, double precio, String nombre, String fabricante, Integer gbMemoria) {
        super(stock, precio, nombre, fabricante);
        this.gbMemoria = gbMemoria;
    }

    public Notebook() {
    }

    public Integer getGbMemoria() {
        return gbMemoria;
    }

    public void setGbMemoria(Integer gbMemoria) {
        this.gbMemoria = gbMemoria;
    }

    @Override
    public String toString() {
        return  "\n Notebook{" +
                "gbMemoria=" + gbMemoria +
                  super.toString()  ;
    }
}
