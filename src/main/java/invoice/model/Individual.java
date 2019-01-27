package invoice.model;

public class Individual extends Client {
    public Individual(int id, ClientType clientType, String shortName, String name, Adress adress, String nip, String pesel) {
        super(id, clientType, shortName, name, adress, nip, pesel);
    }


    public  String getPesel(){
        
    }
}
