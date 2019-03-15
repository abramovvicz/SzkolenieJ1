package invoice.model;

public class Individual extends Client {
    String pesel;

    public Individual(int id, ClientType clientType, String shortName, String name, Adress adress) {
        super(id, clientType, shortName, name, adress);
    }

//    public Individual(AToComposition a) {
//        super(a.getId(), a.getClientType(), a.getShortName(), a.getName(), a.getAdress(), a.getNip(), a.getPesel());
//        this.pesel = pesel;
//    }


    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "Individual{" +
                super.toString() +
                "pesel='" + pesel + '\'' +
                '}';
    }


//    public int compareTo(Client o) {
//        return super.compareTo(o);
//    }


    //wstrzykiwanie zależności
}
