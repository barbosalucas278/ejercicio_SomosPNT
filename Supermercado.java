/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package somospnt;
import java.util.Collections;
import java.util.ArrayList;
/**
 *
 * @author lucas
 */
public class Supermercado {
    private ArrayList<Articulo> listaDeArticulos = new ArrayList<Articulo>();

    public ArrayList<Articulo> getListaDeArticulos() {
        return listaDeArticulos;
    }
    
    public void cargarLista(){
        listaDeArticulos.add(new Bebidas(1.5,"Coca-Cola Zero",20));
        listaDeArticulos.add(new Bebidas(1.5,"Coca-Cola",18));
        listaDeArticulos.add(new Perfumeria(500, "Shampoo Sedal", 19));
        listaDeArticulos.add(new Frutas("kilo", "Frutillas", 64));
        
    }
    
    public void mostarLista(){
        for(Articulo art : listaDeArticulos){
            System.out.println(art.toString());
        }
    }
    
    public void ordenarListaPorPrecio(){
        Collections.sort(listaDeArticulos);
    }
    
    public void buscarAticuloMasCaro(){
        int lenList = listaDeArticulos.size();
        final int ULTIMO_DE_LA_LISTA = lenList -1;
        System.out.println("El producto más caro: "+listaDeArticulos.get(ULTIMO_DE_LA_LISTA).getNombre());
    }
    public void BuscarElProductoMasBarato(){
        final int PRIMERO_DE_LA_LISTA = 0;
        System.out.println("El producto más barato: "+listaDeArticulos.get(PRIMERO_DE_LA_LISTA).getNombre());
    }
    
}
