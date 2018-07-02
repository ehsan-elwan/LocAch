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
public class Contract {
    private final Locataire loc;
    private final Bien bien;
    private final Date debut;
    private final Date fin;
    private final float loyee;
    private final int valueIndice;
    private final boolean etatDesLieux;
    private final boolean diagnosticTechnique;
    private final boolean extraitsReglementCopropriete;
    private final boolean listeLoyersReference;
    private final boolean modalitésServices;
    private final boolean acteCautionSolidaire;
    private final int remisesCles;
    private final String faitA;
    private final boolean habitationExclusivement;
    private final int locID;
    private final int bienID;

    public Contract(Locataire loc, Bien bien, Date debut, Date fin, float loyee, int valueIndice, boolean etatDesLieux, boolean diagnosticTechnique, boolean extraitsReglementCopropriete, boolean listeLoyersReference, boolean modalitésServices, boolean acteCautionSolidaire, int remisesCles, String faitA, boolean habitationExclusivement, int locID, int bienID) {
        this.loc = loc;
        this.bien = bien;
        this.debut = debut;
        this.fin = fin;
        this.loyee = loyee;
        this.valueIndice = valueIndice;
        this.etatDesLieux = etatDesLieux;
        this.diagnosticTechnique = diagnosticTechnique;
        this.extraitsReglementCopropriete = extraitsReglementCopropriete;
        this.listeLoyersReference = listeLoyersReference;
        this.modalitésServices = modalitésServices;
        this.acteCautionSolidaire = acteCautionSolidaire;
        this.remisesCles = remisesCles;
        this.faitA = faitA;
        this.habitationExclusivement = habitationExclusivement;
        this.locID = locID;
        this.bienID = bienID;
    }

    public int getLocID() {
        return locID;
    }

    public int getBienID() {
        return bienID;
    }



    
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
