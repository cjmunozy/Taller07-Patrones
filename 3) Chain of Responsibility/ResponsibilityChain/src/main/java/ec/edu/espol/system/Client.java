/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.system;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author crisj
 */
public class Client {
    private String name;
    private String lastName;
    private List<Claim> claims;

    public Client(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        this.claims = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Claim> getClaims() {
        return claims;
    }

    public void setClaims(List<Claim> claims) {
        this.claims = claims;
    }

}
