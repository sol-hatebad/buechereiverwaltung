import java.util.Objects;

public class Datenbank {
    //Attribute
    private Kunde[] kunden = new Kunde[1];
    private Bibliothekar[] bibliothekare = new Bibliothekar[1];


    //Konstruktoren

//    public Objekt objekt(String autor, String titel, Objektart medium){ // public Objekt'Rückgabewert bezug auf Class Objekt' objekt'konstruktor name
//        this.autor = autor;
//        this.titel = titel;
//        this.medium = medium;
//
//        return new Objekt();
//    }

    //Methoden
    public void registrieren(Person person, String art) {
        if(Objects.equals(art, "Kunde")) {
            kunden[0] = new Kunde(person, 0);
        }
        else if(Objects.equals(art, "Bibliothekar")) {
            bibliothekare[0] = new Bibliothekar(person, 0);
        }
        else {
            System.out.println("Error!");
        }
    }
    public void readObjekt(){

    }

}