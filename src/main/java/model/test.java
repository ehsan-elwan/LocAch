/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Ehsan
 */
public class test {

    public static void main(String[] args) {
        DAO dao = new DAO(new DataSourceFactory());
        Locataire lo;
        lo = dao.getLocByID(1);
        System.out.println(lo.getPrenom());
        
        
    }
}
