package com.mypacage.сlient;

public class ClientFindInfo extends Dul{
    private int partyId;

    public ClientFindInfo(int partyId) {
        this.partyId = partyId;
    }

    public ClientFindInfo(int documentType, String firstName, String lastName, String secondName, int number, int series, int partyId) {
        super(documentType, firstName, lastName, secondName, number, series);
        this.partyId = partyId;
    }
}
