/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.system;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author crisj
 */
public class Storage {
    private Map<Product, Integer> inventory;

    public Storage() {
        inventory = new HashMap<>();
    }

    public Map<Product, Integer> getInventory() {
        return inventory;
    }

    public void setInventory(Map<Product, Integer> inventory) {
        this.inventory = inventory;
    }
    
    public boolean hasStock(Product product){
        if((int) (inventory.get(product)) != 0)
            return true;
        return false;
    }
}
