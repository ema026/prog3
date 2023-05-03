package Models;

public class Silla extends Producto implements Oferta{
    private boolean ruedas;

    public Silla(Integer stock, double precio, String nombre, boolean ruedas) {
        super(stock, precio, nombre);
        this.ruedas = ruedas;
    }

    public Silla() {
    }

    public boolean isRuedas() {
        return ruedas;
    }

    public void setRuedas(boolean ruedas) {
        this.ruedas = ruedas;
    }

    @Override
    public String toString() {
        String rueda="";
        if(ruedas) {rueda = "Si";} else{ rueda ="NO";}
        return "\n Silla{" +
                "ruedas=" + rueda +
                 super.toString();
    }

    @Override
    public double oferta(double porcentaje) {

        this.setPrecio(this.getPrecio() * ((100- porcentaje)/100));
        return this.getPrecio();

    }
}
