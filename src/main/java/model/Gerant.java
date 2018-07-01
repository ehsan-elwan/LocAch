/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author Ehsan
 */
public class Gerant {

    private final String nom;
    private final String prenom;
    private final int cp;
    private final String adresse;
    private final String commune;
    private final Date ne;
    private final String neA;

    public Gerant(String nom, String prenom, int cp, String adresse, String commune, Date ne, String neA) {
        this.nom = nom;
        this.prenom = prenom;
        this.cp = cp;
        this.adresse = adresse;
        this.commune = commune;
        this.ne = ne;
        this.neA = neA;
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
