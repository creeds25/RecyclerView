package com.example.recyclerview.models;

public class ContactModel {
    // resource id of image which can found in drawable
    private int image;
    private String name, number;

    public ContactModel(int image, String name, String number){
        this.name=name;
        this.number=number;
        this.image=image;

    }

    public ContactModel(String name, String number){
        this.name = name;
        this.number = number;
    }

    public int getImage()
    {
        return image;
    }

    public String getName()
    {
        return name;
    }

    public String getNumber()
    {
        return number;
    }
}
