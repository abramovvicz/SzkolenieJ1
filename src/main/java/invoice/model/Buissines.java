package invoice.model;

public class Buissines extends Client {
    String nip;

//    public Buissines(AToComposition a) {
//        super(a.getId(), a.getClientType(), a.getShortName(), a.getName(), a.getAdress(), a.getNip(), a.getPesel());
//        this.pesel = pesel;
//    }


    public Buissines(int id, ClientType clientType, String shortName, String name, Adress adress) {
        super(id, clientType, shortName, name, adress);


    }

    public String getNip() {
        return nip;

    }


    public void setNip(String nip) {
        this.nip = nip;
    }

    @Override
    public String toString() {
        return "Buissines{" +
                super.toString() +
                "pesel='" + nip + '\'' +
                '}';
    }


//    public int compareTo(Client o) {
//        return super.compareTo(o);
//    }


    //wstrzykiwanie zależności
}
