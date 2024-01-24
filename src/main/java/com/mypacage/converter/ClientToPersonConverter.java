package com.mypacage.converter;

import com.mypacage.person.PersonInfo;
import com.mypacage.services.ClientMapper;
import com.mypacage.сlient.ClientInfo;

public class ClientToPersonConverter {

    private final ClientInfo clientInfo;

    public ClientToPersonConverter(ClientInfo clientInfo) {
        this.clientInfo = clientInfo;
    }
    public ClientInfo getClientInfo() {
        return clientInfo;
    }

    public PersonInfo getPersonInfo() {
        ClientMapper clientMapper = new ClientMapper();
        return clientMapper.getPerson(clientInfo);
    }
}
