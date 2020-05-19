package com.company;

public class rdv {
    private String raison ;
    private String date ;
    private String heure;
    private String[] symptomes;
    private boolean liaison_anterieure;
//constructor
    public rdv( String date, String heure, String raison){
        this.date = date;
        this.heure = heure;
        this.raison = raison;
    }

    //getters
    public String getHeure() {
        return heure;
    }
    public String getDate() {
        return date;
    }
    public String getRaison() {
        return raison;
    }
    public boolean isLiaison_anterieure() {
        return liaison_anterieure;
    }
    public String[] getSymptomes() {
        return symptomes;
    }
    public void prise_de_rdv(boolean liaison_anterieure, String raison, String date, String heure){

    }
    //setters

    public void setDate(String date) {
        this.date = date;
    }
    public void setHeure(String heure) {
        this.heure = heure;
    }
    public void setLiaison_anterieure(boolean liaison_anterieure) {
        this.liaison_anterieure = liaison_anterieure;
    }
    public void setRaison(String raison) {
        this.raison = raison;
    }

    public String annalyse_de_raison(){
        String resultat = "";

        return resultat;
    }
    public boolean isFirstConsultation(){
        boolean res = false ;
        /*make the user set that */
        if (res){
           System.out.print(" first time he comes ");
        }else{
            System.out.print("not the first time he comes ");
        }
        return  res;
    }



}
