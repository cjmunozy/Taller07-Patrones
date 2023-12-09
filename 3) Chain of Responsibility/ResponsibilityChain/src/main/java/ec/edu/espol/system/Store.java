/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.system;

/**
 *
 * @author crisj
 */
public class Store {
    private String code;
    private String adress;
    private String manager;
    private Storage storage;

    public Store(String code, String adress) {
        this.code = code;
        this.adress = adress;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String Manager) {
        this.manager = Manager;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }
}
