package org.pursuit;

public class Parent {
    private String eyeColor;
    private String hairColor;

    Parent(String eyeColor, String hairColor){
        this.eyeColor=eyeColor;
        this.hairColor=hairColor;
    }

    public String getEyeColor(){
        return eyeColor;
    }

    public String getHairColor(){
        return hairColor;
    }
}
