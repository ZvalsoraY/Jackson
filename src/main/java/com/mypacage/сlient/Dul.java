package com.mypacage.сlient;

import java.io.Serializable;

public class Dul implements Serializable {
    private int documentType;
    private String firstName;
    private String lastName;
    private String secondName;
    private int number;
    private int series;
    public Dul() {
    }

    public Dul(int documentType, String firstName, String lastName, String secondName, int number, int series) {
        this.documentType = documentType;
        this.firstName = firstName;
        this.lastName = lastName;
        this.secondName = secondName;
        this.number = number;
        this.series = series;
    }
}
