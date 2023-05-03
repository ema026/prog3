import Models.*;

public class Main {
    public static void main(String[] args) {
        //instanciamos los productos
        Notebook notebok1 = new Notebook(10, 50000, "notebook", "Lenovo", 8);
        Impresora impresora1 = new Impresora(10, 20000, "impresora", "HP", 10);
        Escritorio escritorio1 = new Escritorio(10, 10000, "escritorio", 120, 40);
        Silla silla1 = new Silla(10, 1500, "silla", true);

        //Instanciamos la empresa y agregamos a la lista de productos
        Empresa empresa = new Empresa();
        empresa.agregarProducto(notebok1);
        empresa.agregarProducto(impresora1);
        empresa.agregarProducto(escritorio1);
        empresa.agregarProducto(silla1);

        //Mostramos la lista
        System.out.println(empresa.mostrarLista());

        //Mostramos la silla antes y despues de aplicar la oferta(interface)
        //System.out.println(silla1.toString());
       // System.out.println(silla1.oferta(50));
       // System.out.println(silla1.toString());

        //Mostramos la impresora antes y despues de aplicar la oferta(interface)
        //System.out.println(impresora1.toString());
        //System.out.println(impresora1.oferta(50));
        //System.out.println(impresora1.toString());

        //Por ultimo actualizamos los precios
        System.out.println(empresa.ActualizarPrecios(5, 10, 15, 20));

    }
}