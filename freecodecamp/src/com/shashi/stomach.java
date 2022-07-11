package com.shashi;

public class stomach extends organ{
    private boolean isEmpty;

    public stomach(String name, String medicalCondition, boolean isEmpty) {
        super(name, medicalCondition);
        this.isEmpty = isEmpty;
    }
    public void digest(){
        System.out.println("digesting begin...");
    }

    @Override
    public void getDetails() {
        super.getDetails();
        if(this.isEmpty){
            System.out.println("need to be fed");
        }
        else{
            System.out.println("stomach is full");
        }
    }

    public boolean isEmpty() {
        return isEmpty;
    }


}
