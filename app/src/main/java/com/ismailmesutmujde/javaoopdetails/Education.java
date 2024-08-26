package com.ismailmesutmujde.javaoopdetails;

public interface Education {
    public boolean getEducation();

    public default boolean getEducationBody() {
        System.out.println("We do not get education.");
        return false;
    }

}
