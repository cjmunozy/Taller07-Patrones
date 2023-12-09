/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class ViaAutomotriz implements Distribuible{
    
    private ArrayList<Articulo> articulos;
    
    public ViaAutomotriz(ArrayList<Articulo> a){
        articulos=a;
    }

    @Override
    public void distribuir() {
       //Logic
    }
    
    public void setArticulos(ArrayList<Articulo> a){
        articulos=a;
    }
}
