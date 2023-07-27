package com.example.registerproject;

import java.io.Serializable;

public class User implements Serializable {
    private String firstName;
    private  String lastName;
    private String email;
    private String degreeProgram;

    private String finishedBachelor = null;
    private String finishedEngineer = null;
    private String finishedDoctor = null;
    private String finishedSwimming = null;



    public User(String firstName, String lastName, String email, String degreeProgram){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.degreeProgram = degreeProgram;
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

    public void addBachelors(){
        finishedBachelor = "-Kandin tutkinto";

    }

    public void addEngineer(){
        finishedEngineer = "-Diplomi-insinöörin tutkinto";

    }

    public void addDoctor(){
        finishedDoctor = "-Tekniikan tohtorin tutkinto";
    }

    public void addSwimming(){
        finishedSwimming = "-Uimamaisteri";
    }

    public String getFinishedBachelor() {
        return finishedBachelor;
    }

    public String getFinishedEngineer() {
        return finishedEngineer;
    }

    public String getFinishedDoctor() {
        return finishedDoctor;
    }

    public String getFinishedSwimming() {
        return finishedSwimming;
    }

    public void setFinishedBachelor(String finishedBachelor) {
        this.finishedBachelor = finishedBachelor;
    }

    public void setFinishedEngineer(String finishedEngineer) {
        this.finishedEngineer = finishedEngineer;
    }

    public void setFinishedSwimming(String finishedSwimming) {
        this.finishedSwimming = finishedSwimming;
    }

    public void setFinishedDoctor(String finishedDoctor) {
        this.finishedDoctor = finishedDoctor;
    }
}
