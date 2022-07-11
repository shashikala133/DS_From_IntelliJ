package com.shashi;

public class skin extends organ{
    private String color;
    private int softness;

    public skin(String name, String medicalCondition, String color, int softness) {
        super(name, medicalCondition);
        this.color = color;
        this.softness = softness;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("skin color: "+this.getColor());
    }

    public String getColor() {
        return color;
    }



    public int getSoftness() {
        return softness;
    }


}
