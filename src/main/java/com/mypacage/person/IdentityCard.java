package com.mypacage.person;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IdentityCard {
    @JsonProperty("IdType")
    private int idType;

    @JsonProperty("IdSeries")
    private int idSeries;

    @JsonProperty("IdNum")
    private int idNum;

    public IdentityCard() {
    }

    public IdentityCard(int idType, int idSeries, int idNum) {
        this.idType = idType;
        this.idSeries = idSeries;
        this.idNum = idNum;
    }

    public int getIdType() {
        return idType;
    }

    public int getIdSeries() {
        return idSeries;
    }

    public int getIdNum() {
        return idNum;
    }
    @Override
    public String toString() {
        return String.format("{IdType:%s,IdSeries:%s,IdNum:%s}", idType, idSeries, idNum);
    }
}
