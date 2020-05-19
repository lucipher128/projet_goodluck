package com.company;

public class comptabilite {
    //
    private float caisses;
    private float depenses;
    private float gains;
    private float loss;
    private boolean isok;
    private float perc_inc;
    private float prec_dec;


    //METHODS

// setters

    public void setCaisses(float caisses) {
        this.caisses = caisses;
    }
    public void setDepenses(float depenses) {
        this.depenses = depenses;
    }
    public void setGain(float gains) {
        this.gains = gains;
    }

// getters

    public float getLoss() {
        return loss;
    }
    public float getPerc_inc() {
        return perc_inc;
    }
    public float getPrec_dec() {
        return prec_dec;
    }
    public boolean isIsok() {
        return isok;
    }
    //les vrais methodes

    public void evalLoss(){

    }
    public void evalGains(){

    }
    public void evalPers_inc(){

    }
    public void evalPerc_dec(){

    }
}
