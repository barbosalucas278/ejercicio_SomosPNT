/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package somospnt;

/**
 *
 * @author lucas
 */
public class Perfumeria extends Articulo {
    private int contenido;

    public Perfumeria(int contenido, String nombre, int precio) {
        super(nombre, precio);
        this.contenido = contenido;
    }

    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        String nombre = this.getNombre();
        int precio = this.getPrecio();
        return "Nombre: "+nombre+" /// Contenido: "+contenido+"ml /// Precio: $"+precio;
    }

}
