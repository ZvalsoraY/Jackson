package com.mypacage.person;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PersonInfo {
    @JsonProperty("FindPersonInfo")
    private FindPersonInfo findPersonInfo;

    public PersonInfo() {
    }

    public PersonInfo(FindPersonInfo findPersonInfo) {
        this.findPersonInfo = findPersonInfo;
    }
    public FindPersonInfo getFindPersonInfo() {
        return findPersonInfo;
    }

    @Override
    public String toString() {
        return String.format("{FindPersonInfo:%s}", findPersonInfo);
    }
}
