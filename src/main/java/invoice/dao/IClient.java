package invoice.dao;

import invoice.model.Client;

import java.util.List;

public interface IClient {

    boolean addClient(Client client);

    boolean removeClient(int id);

    boolean editClient(int ClientID, Client client);

    List<Client> getAllClients();

    List<Client> getClientsSortedBy(ClientSort clientSort);

    Client getClientById(int clientId);

    List<Client> getClientByName(String name);

    List<Client> getClientByShortName(String shortName);

    Client getClientByNip(String nip);

}
