import java.util.ArrayList;
enum PortfelParameters {
    KRAKOW,
    WARSZAWA,
    INNE_MIASTO,
    JANUSZ,
    KOWALSKI,
    INNE
}

public class Portfel {
    ArrayList<BusinessCard> cards;
    public Portfel() {
        cards = new ArrayList<>();
    }
    public void add(BusinessCard card){
        this.cards.add(card);
    }
    public void print() {
        for(BusinessCard x: this.cards) {
            x.print();
        }
    }
    public void printCity(String city) {
        for(BusinessCard x: this.cards) {
            if(x.getCity() == city)
                x.print();
        }
    }
    public static void main(String[] args) {
        BankCard a = new BankCard("Janusz", "Kowalski", "3456 5678 786");
        BusinessCard b = new BusinessCard("Wojciech", "Nowak",345656787,"Warszawa");
        BusinessCard c = new BusinessCard("Stefan", "Górski",263956785,"Gdańsk");
        BankCard d = new BankCard("Grzegorz", "Nowakowski", "3456 5678 786");
        BusinessCard e = new BusinessCard("Marcin", "Sawczuk");
        Portfel tmp = new Portfel();
        tmp.add(a);
        tmp.add(b);
        tmp.add(c);
        tmp.add(d);
        tmp.add(e);
        tmp.printCity("Krakow");
        tmp.print();

    }
}
