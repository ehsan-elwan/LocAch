/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.InputStream;
import java.text.ParseException;
import java.util.Properties;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Ehsan
 */
public class Gerant {

    private final String gender;
    private final String nom;
    private final String prenom;
    private final int cp;
    private final String adresse;
    private final String commune;
    private final Date ne;
    private final String neA;

    public Gerant() throws ParseException {
        Properties props = new Properties();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream is = classloader.getResourceAsStream("Config.properties");
        this.gender = props.getProperty("LOC_GENDER");
        this.nom = props.getProperty("LOC_USERLNAME");
        this.prenom = props.getProperty("LOC_USERFNAME");
        this.cp = Integer.valueOf(props.getProperty("LOC_PC"));
        this.adresse = props.getProperty("LOC_ADDRESS");
        this.commune = props.getProperty("LOC_REG");
        this.ne = formatter.parse(props.getProperty("LOC_BIRTHDATE"));
        this.neA = props.getProperty("LOC_BIRTHCITY");
    }

    public Date getNe() {
        return ne;
    }

    public String getNeA() {
        return neA;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getCp() {
        return cp;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getCommune() {
        return commune;
    }

}
