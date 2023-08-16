import java.util.Objects;

public class Datenbank {
    //Attribute
    public Kunde[] kunden = new Kunde[1];
    public Bibliothekar[] bibliothekare = new Bibliothekar[1];


    //Methoden
    public void registrieren(Person person, String art) {

        int kNr = 1;
        int bNr = 1;
        if(Objects.equals(art, "Kunde")) {
            kunden[0] = new Kunde(person);
        }
        else if(Objects.equals(art, "Bibliothekar")) {
            bibliothekare[0] = new Bibliothekar(person, bNr);
        bNr++;}
        else {
            System.out.println("Error!");
        }
    }

    public void readObjekt(){

    }

}