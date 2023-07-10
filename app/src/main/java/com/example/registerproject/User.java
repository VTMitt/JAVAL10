package com.example.registerproject;

public class User {
    private String firstName;
    private  String lastName;
    private String email;
    private String degreeProgram;

    private int image = 0;


    public User(String firstName, String lastName, String email, String degreeProgram){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.degreeProgram = degreeProgram;
    }

    public int getImage() {
        return image;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getDegreeProgram() {
        return degreeProgram;
    }

    public void addImage(int image){
        this.image = image;

    }
}
