/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author ehsan
 */
public class Locataire {
    
    private int locId;
    private final String fname;
    private final String lname;
    private final String email;
    private final String phone;
    private final Date bdate;
    
    public Locataire(String fname, String lname, String email, String phone, Date bdate){
        this.bdate=bdate;
        this.email=email;
        this.fname=fname;
        this.lname=lname;
        this.phone=phone;
    }

    public int getLocId() {
        return locId;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public Date getBdate() {
        return bdate;
    }
            
}
