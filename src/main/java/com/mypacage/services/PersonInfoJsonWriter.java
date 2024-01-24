package com.mypacage.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mypacage.person.PersonInfo;
import java.io.File;
import java.io.IOException;

public class PersonInfoJsonWriter {
     private ObjectMapper mapper = new ObjectMapper();
     public void createPerson(PersonInfo personInfo) {
        try {
            mapper.writeValue(new File("PersonInfo.json"),personInfo);
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}