package Models;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Producto> listaProductos;

    public Empresa() {
        this.listaProductos = new ArrayList<>();
    }

    public void agregarProducto(Producto p){
        this.listaProductos.add(p);
    }

    public String mostrarLista(){
       String lista = "";
        for(Producto p : listaProductos){
            lista += p.toString();
        }
        return lista;
    }
    public String ActualizarPrecios(double porcentajeSilla, double porcentajeEscritorio, double porcentajeImpresora, double porcentajeNotebook){
        String devolver = "";
        for (Producto p : listaProductos){
            if(p instanceof Silla){
                devolver += "\n Precio viejo = " + p.toString();
                p.setPrecio(p.getPrecio() * ((100+ porcentajeSilla)/100));
                devolver += "\n Precio nuevo = " + p.toString();
            }
            if(p instanceof Escritorio){
                devolver += "\n Precio viejo = " + p.toString();
                p.setPrecio(p.getPrecio() * ((100+ porcentajeEscritorio)/100));
                devolver += "\n Precio nuevo = " + p.toString();
            }
            if(p instanceof Impresora){
                devolver += "\n Precio viejo = " + p.toString();
                p.setPrecio(p.getPrecio() * ((100+ porcentajeImpresora)/100));
                devolver += "\n Precio nuevo = " + p.toString();
            }
            if(p instanceof Notebook){
                devolver += "\n Precio viejo = " + p.toString();
                p.setPrecio(p.getPrecio() * ((100+ porcentajeNotebook)/100));
                devolver += "\n Precio nuevo = " + p.toString();
            }
        }
            return devolver;
    }
}
