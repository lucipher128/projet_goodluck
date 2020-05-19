package com.company;

public class fiche_medicale {
    //private values

   private float taille;
   private float indice_corporel;
   private float densité_os ;
   private float poids;

//constructor
   public fiche_medicale(float  taille , float poids,float indice_corporel, float densité_os){
        this.densité_os = densité_os;
        this.indice_corporel = indice_corporel;
        this.taille = taille;
    }

//getters
    public float getDensité_os() {
        return densité_os;
    }
    public float getIndice_corporel() {
        return indice_corporel;
    }
    public float getTaille() {
        return taille;
    }
    public float getPoids() {
        return poids;
    }
    //setters
    public void setDensité_os(float densité_os) {
        this.densité_os = densité_os;
    }
    public void setIndice_corporel(float indice_corporel) {
        this.indice_corporel = indice_corporel;
    }
    public void setPoids(float poids) {
        this.poids = poids;
    }
    public void setTaille(float taille) {
        this.taille = taille;
    }
}
