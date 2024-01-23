package com.mypacage.person;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PersonName {
    @JsonProperty("LastName")
    private String lastName;

    @JsonProperty("FirstName")
    private String firstName;

    @JsonProperty("MiddleName")
    private String secondName;

    public PersonName() {
    }

    public PersonName(String lastName, String firstName, String secondName) {
       this.lastName = lastName;
       this.firstName = firstName;
       this.secondName = secondName;
    }
     public String getLastName() {
        return lastName;
     }

     public String getFirstName() {
        return firstName;
     }

     public String getSecondName() {
        return secondName;
     }
    @Override
    public String toString() {
       return String.format("{LastName:%s,FirstName:%s,MiddleName:%s}", lastName, firstName, secondName);
    }
}