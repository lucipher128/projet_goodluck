package com.company;

import java.awt.*;


public class window extends Frame {

    public window(){

        MenuBar bar = new MenuBar();
        Menu menu = new Menu("Menu");
        Menu patient = new Menu("patient");

        MenuItem comptabilite = new MenuItem("comptabilite");
        MenuItem rdv= new MenuItem("rendez-vous");
        MenuItem dossier = new MenuItem("dossier medical");
        MenuItem fiche = new MenuItem("fiche medicale");



        menu.add(comptabilite);
        menu.add(rdv);
        menu.add(patient);

        setMenuBar(bar);

        patient.add(fiche);
        patient.add(dossier);
        bar.add(menu);

        setSize(900,350);
        setLayout(null);
        setVisible(true);
    }
}
