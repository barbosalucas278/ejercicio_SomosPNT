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
public class SomosPNT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Supermercado mercado = new Supermercado();
        mercado.cargarLista();
        mercado.mostarLista();
        mercado.ordenarListaPorPrecio();
        System.out.println("==============================");
        mercado.buscarAticuloMasCaro();
        mercado.BuscarElProductoMasBarato();
        
    }
    
}
