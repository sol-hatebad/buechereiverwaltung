public class Bibliothekar extends Person {
    //Attribute
    private int id;


    //Konstruktoren
    public Bibliothekar(Person person, int id) {
        this.vorname = person.GetVorname();
        this.nachname = person.GetNachname();
        this.id = id;
    }
//Methoden
// public 'Datentyp' 'Methodenname' (Rückgabewerte Datentyp + attribut)

    public void lendObjekt() {

    }

    public void editDatenbank() {

    }

    public void sendMahnung() {

    }
}