package invoice.dao;

import invoice.model.*;
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
        Individual client1 = new Individual(1, ClientType.INDIVIDUAL, "SDA",
                "Software Developers Academy", adress1);
        client1.setPesel("12345453");
        Adress adress2 = new Adress(2, "Warszawa", "Ulica Nazwa2", "90-123");
        Buissines client2 = new Buissines(2, ClientType.BUSINNESS, "SDA1",
                "Software Developers Academy", adress2);
        client2.setNip("233424");
        Adress adress3 = new Adress(3, "Gdańsk", "Ulica Nazwa3", "90-123");
        Buissines client3 = new Buissines(3, ClientType.BUSINNESS, "SDA2",
                "Software Developers Academy", adress3);
        client3.setNip("233424");
        Adress adress4 = new Adress(4, "Opole", "Ulica Nazwa4", "90-123");
        Individual client4 = new Individual(4, ClientType.BUSINNESS, "SDA3",
                "Software Developers Academy", adress4);
        client4.setPesel("233424");
        Adress adress5 = new Adress(5, "Kraków", "Ulica Nazwa5", "90-123");
        Individual client5 = new Individual(5, ClientType.BUSINNESS, "SDA4",
                "Software Developers Academy", adress5);
        client5.setPesel("23322332");

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
        if (clientTemp instanceof Individual && client instanceof Individual) {
            Individual individual = (Individual) client;
            ((Individual) clientTemp).setPesel(individual.getPesel());
        } else if (clientTemp instanceof Buissines && client instanceof Buissines) {
            Buissines buissines = (Buissines) client;
            ((Buissines) clientTemp).setNip(buissines.getNip());
        }

        clientTemp.setName(client.getName());
        clientTemp.setAdress(client.getAdress());
        clientTemp.setClientType(client.getClientType());
        clientTemp.setDiscount(client.getDiscount());
        clientTemp.setShortName(client.getShortName());
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
        Client emptyClient = new Client(-1, null, null, null, null);
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
                .filter(x -> x instanceof Buissines)
                .map(x -> (Buissines) x)
                .filter(x -> nip.equals(x.getNip()))
                .findFirst().orElseThrow(() -> new IllegalArgumentException("Nip nie istnieje"));
    }


    //    @Override
    public Client getClientByPesel(String nip) {
        return listOfClients.stream()
                .filter(x -> x instanceof Individual)
                .map(x -> (Individual) x)
                .filter(x -> nip.equals(x.getPesel()))
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
