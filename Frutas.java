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
public class Frutas extends Articulo {
    private String unidadDeVenta;

    public Frutas(String unidadDeVenta, String nombre, int precio) {
        super(nombre, precio);
        this.unidadDeVenta = unidadDeVenta;
    }

    public String getUnidadDeVenta() {
        return unidadDeVenta;
    }

    public void setUnidadDeVenta(String unidadDeVenta) {
        this.unidadDeVenta = unidadDeVenta;
    }

    @Override
    public String toString() {
                String nombre = this.getNombre();
        int precio = this.getPrecio();
        return "Nombre: "+nombre+" /// Precio: $"+precio+" /// Unidad de venta: "+unidadDeVenta;
        
    }

    
}
