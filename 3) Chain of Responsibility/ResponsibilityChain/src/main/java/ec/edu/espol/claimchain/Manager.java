/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.claimchain;

import ec.edu.espol.system.Claim;
import ec.edu.espol.system.Client;
import ec.edu.espol.system.Sale;
import java.util.List;

/**
 *
 * @author crisj
 */
public class Manager extends Helper{
    
    public Manager(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }
    
    @Override
    public void help(Claim claim) {
        Sale sale = claim.getSale();
        Client client = sale.getClient();
        List<Claim> claims = client.getClaims();
        if(claims.size() < 10)
            System.out.println("El cliente no ha realizado muchos reclamos");
        else
            System.out.println("El cliente ha realizado demasiados reclamos");
    }
    
}
