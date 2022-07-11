package com.shashi;

public class Heart extends organ {
    private int rate;

    public Heart(String name, String medicalCondition, int rate) {
        super(name, medicalCondition);
        this.rate = rate;
    }
    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("heart rate: "+this.getRate());
    }

    public int getRate() {
        return rate;
    }



    public void setRate(int rate) {
        this.rate = rate;
    }
}
