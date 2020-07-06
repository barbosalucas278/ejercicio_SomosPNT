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
public class Bebidas extends Articulo {
    private double litros;

    public Bebidas(double litros, String nombre, int precio) {
        super(nombre, precio);
        this.litros = litros;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    @Override
    public String toString() {
        String nombre = this.getNombre();
        int precio = this.getPrecio();
        return "Nombre: "+nombre+" /// Litros: "+litros+" /// Precio: $"+precio;
    }


    
}
