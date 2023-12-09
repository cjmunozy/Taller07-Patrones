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
public class EstrategiaDistribucion {
   private Distribuible distribucion;
   
   public EstrategiaDistribucion(Distribuible d){
       distribucion=d;
       
   }
   
   public void ejecutar(){
       distribucion.distribuir();
   }
   
   public void setEstrategia(Distribuible d){
       distribucion=d;
   }
}
