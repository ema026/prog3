package Models;

public abstract class Producto {
    private Integer stock;
    private double precio;
    private String nombre;

    public Producto(Integer stock, double precio, String nombre) {
        this.stock = stock;
        this.precio = precio;
        this.nombre = nombre;
    }

    public Producto() {
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return
                ", stock=" + stock +
                ", precio=" + precio +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
