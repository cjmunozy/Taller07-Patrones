/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.claimchain;

import ec.edu.espol.system.Claim;
import ec.edu.espol.system.Product;
import ec.edu.espol.system.Storage;
import ec.edu.espol.system.Store;
import ec.edu.espol.system.Warrant;
import java.util.HashMap;

/**
 *
 * @author crisj
 */
public class InventoryChief extends Helper{

    public InventoryChief(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public void help(Claim claim) {
        Product product = claim.getProduct();
        Storage storage = getStore().getStorage();
        if(storage.hasStock(product)){
            if(product.getPrice() > 1000)
                getNext().help(claim);
            else
                System.out.println("El reclamo es válido, se debe reponer el producto");
        } else
            System.out.println("No se puede procesar el reclamo");
    }
    
}
