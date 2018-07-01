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
public class Contract {
    private Locataire loc;
    private Bien bien;
    private Date debut;
    private Date fin;
    private float loyee;
    private int valueIndice;
    private boolean etatDesLieux;
    private boolean diagnosticTechnique;
    private boolean extraitsReglementCopropriete;
    private boolean listeLoyersReference;
    private boolean modalitésServices;
    private boolean acteCautionSolidaire;
    private int remisesCles;
    private String faitA;
    private boolean habitationExclusivement;

    public Locataire getLoc() {
        return loc;
    }

    public Bien getBien() {
        return bien;
    }

    public Date getDebut() {
        return debut;
    }

    public Date getFin() {
        return fin;
    }

    public float getLoyee() {
        return loyee;
    }

    public int getValueIndice() {
        return valueIndice;
    }

    public boolean isEtatDesLieux() {
        return etatDesLieux;
    }

    public boolean isDiagnosticTechnique() {
        return diagnosticTechnique;
    }

    public boolean isExtraitsReglementCopropriete() {
        return extraitsReglementCopropriete;
    }

    public boolean isListeLoyersReference() {
        return listeLoyersReference;
    }

    public boolean isModalitésServices() {
        return modalitésServices;
    }

    public boolean isActeCautionSolidaire() {
        return acteCautionSolidaire;
    }

    public int getRemisesCles() {
        return remisesCles;
    }

    public String getFaitA() {
        return faitA;
    }

    public boolean isHabitationExclusivement() {
        return habitationExclusivement;
    }
}
