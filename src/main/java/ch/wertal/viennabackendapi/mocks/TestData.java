package ch.wertal.viennabackendapi.mocks;

import ch.wertal.viennabackendapi.models.Client;

import java.util.ArrayList;
import java.util.List;

public class TestData {

    private  static List<Client> clientList = new ArrayList<Client>() ;
    private static  Client client = null ;

    public static List<Client> getTestClients() {
        client = new Client( "WSS-Company-AG","Patrick", "Wertal","patrick.wertal@gmail.com","m002345");
        Client client1 = new Client( "OMM-Company-AG","Martina", "Onlasser","patrick.wertal@gmail.com","m002345");
        Client client2 = new Client( "HHG-Company-AG","Helge", "Folkmann","patrick.wertal@gmail.com","m002345");
        Client client3 = new Client( "CGG-Company-AG","Martina", "Groves","patrick.wertal@gmail.com","m002345");
        Client client4 = new Client( "RSS-Company-AG","Tanja", "Schmidt","patrick.wertal@gmail.com","m002345");
        Client client5 = new Client( "FFW-Company-AG","Florina", "Wertal","patrick.wertal@gmail.com","m002345");
        Client client6 = new Client( "SBF-Company-AG","Steffi", "Folkmann","patrick.wertal@gmail.com","m002345");

        clientList.add(client) ;
        clientList.add(client1) ;
        clientList.add(client2) ;
        clientList.add(client3) ;
        clientList.add(client4) ;
        clientList.add(client5) ;
        clientList.add(client6) ;

        return  clientList ;
    }




}
