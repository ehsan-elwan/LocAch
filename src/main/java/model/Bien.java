/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ehsan
 */
public class Bien {

    private final int porte;
    private final String address;
    private final String batiment;
    private final int etage;
    private final int cp;
    private final String commune;
    private final float surface;
    private final int nbpiece;
    private final String description;
    private final int cave;
    private final int parking;
    private final int garage;
    private final int chauffage;
    private final int eauChaude;
    private final boolean antenneTV;
    private final boolean interphone;
    private final boolean gardiennage;
    private final boolean ascenseur;
    private final boolean digicode;
    private final boolean cable;
    private final String autre;

    public Bien(int porte, String address, String batiment, int etage, int cp, String commune, float surface, int nbpiece, String description, int cave, int parking, int garage, int chauffage, int eauChaude, boolean antenneTV, boolean interphone, boolean gardiennage, boolean ascenseur, boolean digicode, boolean cable, String autre) {
        this.porte = porte;
        this.address = address;
        this.batiment = batiment;
        this.etage = etage;
        this.cp = cp;
        this.commune = commune;
        this.surface = surface;
        this.nbpiece = nbpiece;
        this.description = description;
        this.cave = cave;
        this.parking = parking;
        this.garage = garage;
        this.chauffage = chauffage;
        this.eauChaude = eauChaude;
        this.antenneTV = antenneTV;
        this.interphone = interphone;
        this.gardiennage = gardiennage;
        this.ascenseur = ascenseur;
        this.digicode = digicode;
        this.cable = cable;
        this.autre = autre;
    }

    public int getPorte() {
        return porte;
    }

    public int getCave() {
        return cave;
    }

    public int getParking() {
        return parking;
    }

    public int getGarage() {
        return garage;
    }

    public int getChauffage() {
        return chauffage;
    }

    public int getEauChaude() {
        return eauChaude;
    }

    public boolean isAntenneTV() {
        return antenneTV;
    }

    public boolean isInterphone() {
        return interphone;
    }

    public boolean isGardiennage() {
        return gardiennage;
    }

    public boolean isAscenseur() {
        return ascenseur;
    }

    public boolean isDigicode() {
        return digicode;
    }

    public boolean isCable() {
        return cable;
    }

    public String getAutre() {
        return autre;
    }

    public String getDescription() {
        return description;
    }

    public int getNumber() {
        return porte;
    }

    public String getAddress() {
        return address;
    }

    public String getBatiment() {
        return batiment;
    }

    public int getEtage() {
        return etage;
    }

    public int getCp() {
        return cp;
    }

    public float getSurface() {
        return surface;
    }

    public int getNbpiece() {
        return nbpiece;
    }

    public String getCommune() {
        return commune;
    }

}
