package com.mypacage.person;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InfoFoJSON {
    @JsonProperty("PersonInfo")
    private PersonInfo personInfo;

    public InfoFoJSON() {
    }
    public InfoFoJSON(PersonInfo personInfo) {
        this.personInfo = personInfo;
    }
    public PersonInfo getPersonInfo() {
        return personInfo;
    }

    @Override
    public String toString() {
        return String.format("{PersonInfo:%s}", personInfo);
    }
}
