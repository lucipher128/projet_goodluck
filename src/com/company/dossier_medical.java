package com.company;

public class dossier_medical {

    private float poids;
    private int nombre_consultations;
    private String[] antecedents;
    private String num_secu;
    private boolean Validité_secu;
    private float   taille;
    private String[] alergies;

    public fiche_medicale[] consultations;

//constructors
    public dossier_medical( String[] antecedents, String[] alergies, String num_secu, int nombre_consultations, float poids,float taille ){
        this.poids= poids;
        this.taille = taille;
        this.antecedents = antecedents;
        this.alergies = alergies;
        this.num_secu = num_secu;
        this.nombre_consultations = nombre_consultations;
    }
    public dossier_medical(){
        this.poids= 0;
        this.taille = 0;
        this.antecedents = null;
        this.alergies = null;
        this.num_secu = null;
        this.nombre_consultations = 0;
    }
    //setters

    public void setTaille(float taille) {
        this.taille = taille;
    }
    public void setPoids(float poids) {
        this.poids = poids;
    }
    public void setAlergies(String[] alergies) {
        this.alergies = alergies;
    }
    public void setAntecedents(String[] antecedents) {
        this.antecedents = antecedents;
    }
    public void setConsultations(fiche_medicale[] consultations) {
        this.consultations = consultations;
    }
    public void setNombre_consultations(int nombre_consultations) {
        this.nombre_consultations = nombre_consultations;
    }
    public void setNum_secu(String num_secu) {
        this.num_secu = num_secu;
    }
    public void setValidité_secu(boolean validité_secu) {
        Validité_secu = validité_secu;
    }
    //getters

    public float getPoids() {
        return poids;
    }
    public float getTaille() {
        return taille;
    }
    public boolean isValidité_secu() {
        return Validité_secu;
    }
    public fiche_medicale[] getConsultations() {
        return consultations;
    }
    public int getNombre_consultations() {
        return nombre_consultations;
    }
    public String getNum_secu() {
        return num_secu;
    }
    public String[] getAlergies() {
        return alergies;
    }
    public String[] getAntecedents() {
        return antecedents;
    }
}
