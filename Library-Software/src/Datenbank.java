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
            /* kunden[0] = new Kunde(person, 0);
            System.out.println("Sie sind als Kunde registriert!");
            so hatte es dima gemacht*/
            Kunde kunde1 = new Kunde(person);
            System.out.println("Sie sind als Kunde registriert!");
            kunde1.GetVorname();
            kunde1.GetNachname();
            kunde1.GetKundennummer();
            System.out.print("eingetragener Vorname     : "+ kunde1.GetVorname() + "\n");
            System.out.print("eingetragener Nachname    : "+ kunde1.GetNachname() + "\n");
            System.out.print("ihre Kundennummer ist     :" + kunde1.GetKundennummer() + "\n");

        }
        else if(Objects.equals(art, "Bibliothekar")) {
            //bibliothekare[0] = new Bibliothekar(person);
            System.out.println("Registrierter Bibliothekar");
            Bibliothekar bibliothekar1 = new Bibliothekar(person);
            bibliothekar1.GetNachname();
            bibliothekar1.GetId();
            System.out.print("eingetragener Vorname     : "+ bibliothekar1.GetVorname() + "\n");
            System.out.print("eingetragener Nachname    : "+ bibliothekar1.GetNachname() + "\n");
            System.out.print("ihre Kundennummer ist     :" + bibliothekar1.GetId() + "\n");
        }
        else {
            System.out.println("Error!");
        }
    }
    public void readObjekt(){

    }

}