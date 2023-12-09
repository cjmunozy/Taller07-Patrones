/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.claimchain;

import ec.edu.espol.system.Claim;
import ec.edu.espol.system.Product;
import ec.edu.espol.system.Sale;
import ec.edu.espol.system.Warrant;
import java.util.Date;

/**
 *
 * @author crisj
 */
public class Assistant extends Helper{

    public Assistant(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public void help(Claim claim) {
        Sale sale = claim.getSale();
        Product product = claim.getProduct();
        Warrant warrant = product.getWarrant();
        if(warrant.getDateLimit().after(new Date()))
            getNext().help(claim);
        else
            System.out.println("No se puede procesar el reclamo");
    }

}
