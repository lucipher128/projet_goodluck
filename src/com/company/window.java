package com.company;

import java.awt.*;

public class window extends Frame {

    public window(){
        setName("new frame ");
        TextField t;
        t = new TextField("write me ");
        t.setBounds(50,100,200,30);
        add(t);
        Button b = new Button("click me ");
        b.setBounds(30,30,50,15);
        add(b);
        setSize(900,350);
        setLayout(null);
        setVisible(true);
    }
}
