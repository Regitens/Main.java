package com.bazhan;

public abstract class Person {
    public Person() {

    }

    public abstract String getDescription();
    private String name;

    public Person (String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
