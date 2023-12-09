/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.claimchain;

import ec.edu.espol.system.Store;

/**
 *
 * @author crisj
 */
public abstract class Helper implements Help{
    protected String name;
    protected String lastName;
    protected Store store;
    protected Helper next;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public Helper getNext() {
        return next;
    }
    
    public void setNext(Helper helper){
        this.next = helper;
    };
    
    public boolean hasNext(){
        return next != null;
    }
}
