/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.claimchain;

import ec.edu.espol.system.Claim;
import ec.edu.espol.system.Product;
import ec.edu.espol.system.Warrant;

/**
 *
 * @author crisj
 */
public class Technician extends Helper{

    public Technician(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public void help(Claim claim) {
        Product product = claim.getProduct();
        Warrant warrant = product.getWarrant();
        String conditions = warrant.getConditions();
        if(conditions.contains(claim.getDescription()))
            getNext().help(claim);
        else
            System.out.println("No se puede procesar el reclamo");
    }
    
}
