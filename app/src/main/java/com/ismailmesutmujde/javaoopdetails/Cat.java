package com.ismailmesutmujde.javaoopdetails;

public class Cat {
    String  name;
    String eyeColor;
    String furColor;

    public static String typeName = "felis";


    public Cat() {

    }

    public Cat(String name, String eyeColor, String furColor) {
        this.name = name;
        this.eyeColor = eyeColor;
        this.furColor = furColor;
    }

    public static void speakCatStatic() {

    }
    public void speakCat() {
        System.out.println("My name is : " + this.name + ", My type is : "+ typeName);
    }
}
