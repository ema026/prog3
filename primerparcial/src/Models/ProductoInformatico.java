package Models;

public abstract class  ProductoInformatico extends Producto{
    private String fabricante;

    public ProductoInformatico(Integer stock, double precio, String nombre, String fabricante) {
        super(stock, precio, nombre);
        this.fabricante = fabricante;
    }

    public ProductoInformatico() {
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return
                ", fabricante='" + fabricante + '\'' +
                 super.toString();
    }
}
