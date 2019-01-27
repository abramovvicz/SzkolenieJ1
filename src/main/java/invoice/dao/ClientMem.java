package invoice.dao;

import invoice.model.Adress;
import invoice.model.Client;
import invoice.model.ClientType;
import javafx.beans.InvalidationListener;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

import java.util.*;
import java.util.stream.Collectors;

public class ClientMem implements IClient, ObservableList<Client> {

    List<Client> listOfClients = new ArrayList<>();

    public ClientMem() {
        creatListOfClients();
    }

    private void creatListOfClients() {
        Adress adress1 = new Adress(1, "Lodz", "Ulica Nazwa1", "90-123");
        Client client1 = new Client(1, ClientType.BUSINNESS, "SDA",
                "Software Developers Academy", adress1, "12345453", "2345364");
        Adress adress2 = new Adress(2, "Warszawa", "Ulica Nazwa2", "90-123");
        Client client2 = new Client(2, ClientType.BUSINNESS, "SDA1",
                "Software Developers Academy", adress2, "12345453", "2345364");
        Adress adress3 = new Adress(3, "Gdańsk", "Ulica Nazwa3", "90-123");
        Client client3 = new Client(3, ClientType.BUSINNESS, "SDA2",
                "Software Developers Academy", adress3, "12345453", "2345364");
        Adress adress4 = new Adress(4, "Opole", "Ulica Nazwa4", "90-123");
        Client client4 = new Client(4, ClientType.BUSINNESS, "SDA3",
                "Software Developers Academy", adress4, "12345453", "2345364");
        Adress adress5 = new Adress(5, "Kraków", "Ulica Nazwa5", "90-123");
        Client client5 = new Client(5, ClientType.BUSINNESS, "SDA4",
                "Software Developers Academy", adress5, "12345453", "2345364");

        listOfClients.add(client1);
        listOfClients.add(client2);
        listOfClients.add(client3);
        listOfClients.add(client4);
        listOfClients.add(client5);

    }

    @Override
    public boolean addClient(Client client) {
        return listOfClients.add(client);
    }

    @Override
    public boolean removeClient(int id) {
        return listOfClients.remove(getClientById(id));
    }

    @Override
    public boolean editClient(int clientID, Client client) {
        Client clientTemp = getClientById(clientID);
        clientTemp.setName(client.getName());
        clientTemp.setAdress(client.getAdress());
        clientTemp.setNip(client.getNip());
        clientTemp.setClientType(client.getClientType());
        clientTemp.setDiscount(client.getDiscount());
        clientTemp.setShortName(client.getShortName());
        clientTemp.setPesel(client.getPesel());
        removeClient(clientID);
        return listOfClients.add(clientTemp);
    }

    @Override
    public List<Client> getAllClients() {
        Collections.sort(listOfClients); // ten sort używa natywnej metody zawartej w client
        return listOfClients;
    }

    @Override
    public List<Client> getClientsSortedBy(ClientSort clientSort) {

        switch (clientSort) {
            case ID:
                return listOfClients.stream().sorted(Comparator.comparingInt(Client::getId)).collect(Collectors.toList());
            case NAME:
                return listOfClients.stream().sorted((x, y) -> x.getName().compareToIgnoreCase(y.getName())).collect(Collectors.toList());
            case CITY:
                listOfClients.stream().sorted((x, y) -> x.getAdress().getCity().compareToIgnoreCase(y.getAdress().getCity())).collect(Collectors.toList());
            case CLIENTYPE:
//                return listOfClients.stream().sorted((x,y)->x.getClientType().compareTo(y.getClientType())).collect(Collectors.toList());
                return listOfClients.stream().sorted(Comparator.comparing(Client::getClientType)).collect(Collectors.toList());
        }

        return listOfClients;


    }

    @Override
    public Client getClientById(int clientId) {
        Client emptyClient = new Client(-1, null, null, null, null, null, null);
        return listOfClients.stream().filter(x -> x.getId() == clientId).findFirst().orElse(emptyClient);
    }

    //moetoda nigdy nie powinna zwracac nulla
    @Override
    public List<Client> getClientByName(String name) {
        return listOfClients.stream().filter(x -> x.getName().contains(name))
                .collect(Collectors.toList());
    }

    @Override
    public List<Client> getClientByShortName(String shortName) {
        return listOfClients.stream().filter(x -> x.getName().contains(shortName))
                .collect(Collectors.toList());
    }

    @Override
    public Client getClientByNip(String nip) {
        return listOfClients.stream()
                .filter(x -> x.getNip().equals(nip))
                .findFirst().orElseThrow(() -> new IllegalArgumentException("Nip nie istnieje"));
    }

    @Override
    public void addListener(ListChangeListener<? super Client> listener) {

    }

    @Override
    public void removeListener(ListChangeListener<? super Client> listener) {

    }

    @Override
    public boolean addAll(Client... elements) {
        return false;
    }

    @Override
    public boolean setAll(Client... elements) {
        return false;
    }

    @Override
    public boolean setAll(Collection<? extends Client> col) {
        return false;
    }

    @Override
    public boolean removeAll(Client... elements) {
        return false;
    }

    @Override
    public boolean retainAll(Client... elements) {
        return false;
    }

    @Override
    public void remove(int from, int to) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Client> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Client client) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Client> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Client> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Client get(int index) {
        return null;
    }

    @Override
    public Client set(int index, Client element) {
        return null;
    }

    @Override
    public void add(int index, Client element) {

    }

    @Override
    public Client remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Client> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Client> listIterator(int index) {
        return null;
    }

    @Override
    public List<Client> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public void addListener(InvalidationListener listener) {

    }

    @Override
    public void removeListener(InvalidationListener listener) {

    }
}
