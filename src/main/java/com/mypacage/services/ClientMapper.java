package com.mypacage.services;

import com.mypacage.person.FindPersonInfo;
import com.mypacage.person.IdentityCard;
import com.mypacage.person.PersonInfo;
import com.mypacage.person.PersonName;
import com.mypacage.сlient.ClientInfo;
import com.mypacage.сlient.Dul;

public class ClientMapper {

    public PersonInfo getPerson(ClientInfo clientInfo) {
        Dul dul = clientInfo.getClientFindInfo().getDul();
        int partyId = clientInfo.getClientFindInfo().getPartyId();

        PersonName personName = new PersonName(dul.getLastName(), dul.getFirstName(), dul.getSecondName());
        IdentityCard identityCard = new IdentityCard(dul.getDocumentType(), dul.getSeries(), dul.getNumber());

        return (new PersonInfo(new FindPersonInfo(personName, identityCard, partyId)));
    }
}
