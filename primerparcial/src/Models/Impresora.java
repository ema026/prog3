package Models;

public class Impresora extends ProductoInformatico implements Oferta{
    private Integer impresionesXMinuto;

    public Impresora(Integer stock, double precio, String nombre, String fabricante, Integer impresionesXMinuto) {
        super(stock, precio, nombre, fabricante);
        this.impresionesXMinuto = impresionesXMinuto;
    }

    public Impresora() {
    }

    public Integer getImpresionesXMinuto() {
        return impresionesXMinuto;
    }

    public void setImpresionesXMinuto(Integer impresionesXMinuto) {
        this.impresionesXMinuto = impresionesXMinuto;
    }

    @Override
    public String toString() {
        return "\n Impresora{" +
                "impresionesXMinuto=" + impresionesXMinuto +
                 super.toString();
    }
    @Override
    public double oferta(double porcentaje) {

        this.setPrecio(this.getPrecio() * ((100- porcentaje)/100));
        return this.getPrecio();

    }
}
