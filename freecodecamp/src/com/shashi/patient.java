package com.shashi;

public class patient {
    private String name;
    private int age;
    private Eye righteye;
    private Eye lefteye;
    private Heart heart;
    private stomach Stomach;
    private skin Skin;

    public patient(String name, int age, Eye righteye, Eye lefteye, Heart heart, stomach stomach, skin skin) {
        this.name = name;
        this.age = age;
        this.righteye = righteye;
        this.lefteye = lefteye;
        this.heart = heart;
        this.Stomach = stomach;
        this.Skin = skin;
    }

    public String getName() {
        return name;
    }



    public int getAge() {
        return age;
    }



    public Eye getRighteye() {
        return righteye;
    }



    public Eye getLefteye() {
        return lefteye;
    }



    public Heart getHeart() {
        return heart;
    }



    public stomach getStomach() {
        return Stomach;
    }


    public skin getSkin() {
        return Skin;
    }

}
