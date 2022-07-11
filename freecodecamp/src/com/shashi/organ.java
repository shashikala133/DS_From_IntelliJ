package com.shashi;

public class organ {
    private String name;
    private String medicalCondition;

    public organ(String name, String medicalCondition) {
        this.name = name;
        this.medicalCondition = medicalCondition;
    }
    public void getDetails(){
        System.out.println("name "+this.getName());
        System.out.println("medical condition: "+this.getMedicalCondition());
    }
    public String getName(){
        return name;
    }

    public String getMedicalCondition(){
        return medicalCondition;
    }


}
