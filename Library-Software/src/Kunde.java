public class Kunde extends Person {
    //Attribute
    protected int kundenNummer;
    private int nextId =1;
    //Konstruktoren
    public Kunde(Person person){
        this.vorname = person.GetVorname();
        this.nachname = person.GetNachname();
        this.kundenNummer = nextId;
        nextId++;
    }
    //Methoden
    //GET
    public int GetKundennummer() { return this.kundenNummer; }
}