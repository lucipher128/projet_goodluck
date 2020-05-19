package com.company;


public class patient {
// PRIVATES

    private String name ;
    private String lastName;
    private int age ;
    private String disease;
    private int consultation_num;
    private dossier_medical dossier;

// CONSTRUCTORS

    public patient(String name , String lastName , int age , int consultation_num){
        this.age = age ;
        this.name = name ;
        this.lastName = lastName;
        this.consultation_num = consultation_num;
        if (consultation_num == 0){
            this.dossier = new dossier_medical();
        }else{
           this.dossier.setPoids();                 //set poids
           this.dossier.setTaille();                //set taille
           this.dossier.setAlergies();              //set Alergies
           this.dossier.setAntecedents();           //set Antecedents
        }
    }
//getters
    public dossier_medical getDossier() {
        return dossier;
    }
    public int getAge() {
        return age;
    }
    public int getConsultation_num() {
        return consultation_num;
    }
    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }
    public String getDisease() {
        return disease;
    }
//setters
    public void setAge(int age) {
        this.age = age;
    }
    public void setConsultation_num(int consultation_num) {
        this.consultation_num = consultation_num;
    }
    public void setDisease(String disease) {
        this.disease = disease;
    }
    public void setDossier(dossier_medical dossier) {
        this.dossier = dossier;
    }

    public void consultation(int consultation_num, String name , String lastName, int age  , dossier_medical dossier_medical){
        float taille = 0f;
        float poids = 0f;
        float densite_os = 0f;
        float indice_corporel = 0f;

        /* make the user set those values */
        dossier_medical.consultations[consultation_num] = new fiche_medicale(taille,poids, indice_corporel,densite_os);
        this.consultation_num++;
    }
}
