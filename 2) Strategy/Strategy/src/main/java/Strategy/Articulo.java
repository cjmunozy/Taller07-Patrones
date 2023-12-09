/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

/**
 *
 * @author USUARIO
 */
public class Articulo {
    private String name="";
    private float price=0;
    
    public Articulo(String name, float price){
        this.name=name;
        this.price=price;
    }
    
    public String getName(){
        return name;}
    
    public float getPrice(){
        return price;}

    public void setName(String name) {
        this.name = name;}

    public void setPrice(float price) {
        this.price = price;}
}
