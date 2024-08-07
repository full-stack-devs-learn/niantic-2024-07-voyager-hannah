package com.niantic.part_1_sakila_dtos;

public class Actor {
    private int ActorId;
    private String firstName;
    private String lastName;


    public Actor() {

    }

    public Actor( int ActorID, String firstName, String lastName)
    {
        this.ActorId = ActorID;
        this.firstName = firstName;
        this.lastName = lastName;

    }


    public int getActorId() {return ActorId;}

    public void setActorId(int ActorID) {this.ActorId = ActorID;}

    public String getFirstName() {return firstName;}

    public void setFirstName(String firstName) {this.firstName = firstName;}

    public String getLastName() {return lastName;}

    public void setLastName(String lastName) {  this.lastName = lastName;}

    public String getFullName() {return firstName + " " + lastName;}



}