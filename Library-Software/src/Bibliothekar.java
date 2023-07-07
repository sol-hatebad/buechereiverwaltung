public class Bibliothekar extends Person {
    //Attribute
    private int id;
    private int nextId =1;


    //Konstruktoren
    public Bibliothekar(Person person) {
        this.vorname = person.GetVorname();
        this.nachname = person.GetNachname();
        this.id = nextId;
        nextId++;
    }
//Methoden
// public 'Datentyp' 'Methodenname' (Rückgabewerte Datentyp + attribut)

    public int GetId(){
        return this.id;
    }

    public void lendObjekt() {

    }

    public void editDatenbank() {

    }

    public void sendMahnung() {

    }
}