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
public abstract class Articulo implements Comparable<Articulo> {
    private String nombre;
    private int precio;
    final int MAYOR = 1;
    final int MENOR = -1;
    final int IGUAL = 0;
    
    public Articulo(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " /// Precio: $" + precio;
    }
    
    public int compareTo(Articulo art){
        if(this.getPrecio() < art.getPrecio() ){
            return MENOR;
        }else if(this.getPrecio() > art.getPrecio()){
            return MAYOR;
        }else{
            return IGUAL;
        }
    }
    
}
