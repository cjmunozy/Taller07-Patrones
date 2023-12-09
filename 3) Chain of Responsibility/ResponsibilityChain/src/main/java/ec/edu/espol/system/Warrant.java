/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.system;

import java.util.Date;

/**
 *
 * @author crisj
 */
public class Warrant {
    private Date dateLimit;
    private String conditions;

    public Warrant(Date dateLimit, String conditions) {
        this.dateLimit = dateLimit;
        this.conditions = conditions;
    }

    public Date getDateLimit() {
        return dateLimit;
    }

    public void setTimeLimit(Date dateLimit) {
        this.dateLimit = dateLimit;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }
    
}
