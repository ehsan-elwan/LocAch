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
    
    private final int number;
    private final String address;
    private final String batiment;
    private final int etage;
    private final int cp;
    private final float surface;
    private final int nbpiece;
    

    public Bien(int number, String address, String batiment, int etage, int cp, float surface, int nbpiece){
        this.address=address;
        this.batiment=batiment;
        this.cp=cp;
        this.etage=etage;
        this.nbpiece=nbpiece;
        this.number=number;
        this.surface=surface;
}

    public int getNumber() {
        return number;
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
    
}


