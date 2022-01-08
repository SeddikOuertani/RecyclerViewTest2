package com.example.recyclerviewtest2;

public class Person {
    private String name;
    private String number;

    public Person (){
        name = "default_name";
        number = "11111111";
    }

    public Person (String name, String number){
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
