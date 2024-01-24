package com.mypacage;

import com.mypacage.converter.ClientToPersonConverter;
import com.mypacage.services.ClientInfoXmlReader;
import com.mypacage.services.PersonInfoJsonWriter;


public class Main {
    public static void main(String[] args) {
        ClientInfoXmlReader clientInfoXmlReader = new ClientInfoXmlReader();
        PersonInfoJsonWriter personInfoJsonWriter = new PersonInfoJsonWriter();
        ClientToPersonConverter clientToPersonConverter = new ClientToPersonConverter(clientInfoXmlReader.readClientInfo());
        personInfoJsonWriter.createPerson(clientToPersonConverter.getPersonInfo());
    }
}