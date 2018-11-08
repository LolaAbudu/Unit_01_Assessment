package org.pursuit;

public class Child extends Parent{
    private int age;


    Child(String eyeColor, String hairColor, int age){
        super(eyeColor, hairColor);
        this.age=age;
    }

    public int getAge() {
        return age;
    }
}
