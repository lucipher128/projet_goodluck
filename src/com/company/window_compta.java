package com.company;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.*;
import  java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class window_compta extends Frame implements ActionListener {

    public window_compta(){
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

        comptabilite.addActionListener(this);
        setSize(900,350);
        setLayout(null);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent a){

    }
}
