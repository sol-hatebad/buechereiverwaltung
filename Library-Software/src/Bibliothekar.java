public class Bibliothekar extends Person {
    //Attribute
    private int id;
    static int mId = 0;


    //Konstruktoren
    public Bibliothekar(Person person, int id) {
        mId++;
        this.vorname = person.GetVorname();
        this.nachname = person.GetNachname();
        this.id = mId;
    }
//Methoden

    public int GetMitarbeiterId() { return this.id; }

    public void lendObjekt() {

    }

    public void editDatenbank() {

    }

    public void sendMahnung() {

    }
}