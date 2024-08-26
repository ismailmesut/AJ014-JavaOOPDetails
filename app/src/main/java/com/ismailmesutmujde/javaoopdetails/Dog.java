package com.ismailmesutmujde.javaoopdetails;

public class Dog extends Animal implements Education {

    public Dog() {
        super();
    }

    public Dog(String name, String eyeColor, String furColor) {
        super(name, eyeColor, furColor);
    }

    @Override
    public boolean getEducation() {
        System.out.println("Dogs get education.");
        return true;
    }

    @Override
    public boolean getEducationBody() {
        System.out.println("Dogs are very trainable.");
        return true;
    }
}
