package Models;

public class Escritorio extends Producto{
    private double largo;
    private double ancho;

    public Escritorio(Integer stock, double precio, String nombre, double largo, double ancho) {
        super(stock, precio, nombre);
        this.largo = largo;
        this.ancho = ancho;
    }

    public Escritorio() {
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return "\n Escritorio{" +
                "largo=" + largo +
                ", ancho=" + ancho +
                 super.toString();
    }
}
