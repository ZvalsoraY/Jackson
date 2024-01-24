package com.mypacage.services;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.mypacage.сlient.ClientInfo;
import java.io.File;
import java.io.IOException;

public class ClientInfoXmlReader {
    private XmlMapper xmlMapper = new XmlMapper();
    private File clientInfoXML = new File("ClientInfo.xml");

    public ClientInfo readClientInfo ()
    {
        try{
            return xmlMapper.readValue(clientInfoXML, ClientInfo.class);
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
