package ir.nemspace;

public class Card {
    String id;
    String password;
    String cvv2;
    String registry_date;

    public Card(String id,String password,String cvv2,String registry_date){
        this.id = id;
        this.password = password;
        this.cvv2 = cvv2;
        this.registry_date = registry_date;
    }
}
