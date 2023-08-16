public class Kunde extends Person {
    //Attribute
    protected int kundenNummer;
<<<<<<< HEAD
    static int kNr = 100;
    //Konstruktoren
    public Kunde(Person person){
        kNr++;
        this.vorname = person.GetVorname();
        this.nachname = person.GetNachname();
        this.kundenNummer = kNr;
    }
    //Methoden
    //GET
    public int GetKundennummer() { return this.kundenNummer; }
}