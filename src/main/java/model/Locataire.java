/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;


/**
 *
 * @author Ehsan
 */
public class Locataire {

    private final String prenom;
    private final String nom;
    private final String email;
    private final String phone;
    private final Date ne;
    private final String gender;
    private final String neAVille;
    private final String neAPay;
    private final int cp;
    private final String adresse;
    private final String commune;
    private final int id;

    public Locataire(String prenom, String nom, String email, String phone,
            Date ne, String gender, String neAVille, String neAPay, int cp,
            String adresse, String commune, int id) {
        this.prenom = prenom;
        this.nom = nom;
        this.email = email;
        this.phone = phone;
        this.ne = ne;
        this.gender = gender;
        this.neAVille = neAVille;
        this.neAPay = neAPay;
        this.cp = cp;
        this.adresse = adresse;
        this.commune = commune;
        this.id=id;
    }

    public int getId() {
        return id;
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

    public Date getNe() {
        return ne;
    }

    public String getNeAVille() {
        return neAVille;
    }

    public String getNeAPay() {
        return neAPay;
    }

    public String getGender() {
        return gender;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public Date getBdate() {
        return ne;
    }

}
