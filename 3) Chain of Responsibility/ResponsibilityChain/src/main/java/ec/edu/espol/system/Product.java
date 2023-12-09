/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.system;

import ec.edu.espol.system.Warrant;

/**
 *
 * @author crisj
 */
public class Product {
    private String name;
    private String description;
    private double price;
    private Warrant warrant;

    public Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Warrant getWarrant() {
        return warrant;
    }

    public void setWarrant(Warrant warrant) {
        this.warrant = warrant;
    }
    
}
