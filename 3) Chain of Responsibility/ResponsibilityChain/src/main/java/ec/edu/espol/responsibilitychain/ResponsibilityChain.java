/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.espol.responsibilitychain;

import ec.edu.espol.claimchain.*;
import ec.edu.espol.system.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author crisj
 */
public class ResponsibilityChain {

    public static void main(String[] args) {
        try {
            String name = "Carlos";
            String lastName = "Santana";
            Client client = new Client(name, lastName);
            Store store = new Store("AX-001", "Av. Olmedo 410");
            store.setManager("Luis Rodríguez");
            Product product = new Product("PS5", "Consola de última generación", 750.0);
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date fecha = formato.parse("8/12/2024");
            Warrant warrant = new Warrant(fecha, "Defecto de fábrica");
            Storage storage = new Storage();
            storage.getInventory().put(product, Integer.valueOf(5));
            store.setStorage(storage);
            ArrayList<Product> products = new ArrayList<>();
            products.add(product);
            Sale sale = new Sale(client, new Date(), products, 750.0);
            Claim claim = new Claim(sale, product, "Defecto de fábrica");
            Assistant assistant = new Assistant(name, lastName);
            Technician technician = new Technician(name, lastName);
            InventoryChief inventoryChief = new InventoryChief(name, lastName);
            Manager manager = new Manager(name, lastName);
            //Inicialización de la cadena de verificación del reclamo
            assistant.setNext(technician);
            technician.setNext(inventoryChief);
            inventoryChief.setNext(manager);
            assistant.help(claim);
        } catch (ParseException ex) {
            Logger.getLogger(ResponsibilityChain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
