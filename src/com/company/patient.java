package com.company;

public class patient {
    // PRIVATES

    private String name ;
    private String lastName;
    private int age ;
    private String disease;
    private int consultation_num;
    private dossier_medical dossier = new dossier_medical();

    public patient(String name , String lastName , int age , int consultation_num){
        this.age = age ;
        this.name = name ;
        this.lastName = lastName;
        this.consultation_num = consultation_num;
    }

    // METHODS

    public void consultation(int consultation_num, String name , String lastName, int age  , dossier_medical dossier_medical){
        float taille , poids , densite_os, indice_corporel;
        /* make the user set those values */
       dossier_medical.consultations[consultation_num] = new fiche_medicale(taille, indice_corporel,densite_os);
       return ;
    }
}
