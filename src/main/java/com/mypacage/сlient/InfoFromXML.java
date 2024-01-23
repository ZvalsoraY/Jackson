package com.mypacage.сlient;

import java.io.Serializable;

public class InfoFromXML implements Serializable {
    private ClientInfo clientInfo;

    public InfoFromXML() {
    }
    public ClientInfo getClientInfo() {
        return clientInfo;
    }
}
