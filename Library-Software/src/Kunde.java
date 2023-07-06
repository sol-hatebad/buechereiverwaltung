public class Kunde extends Person {
    //Attribute
    protected int kundenNummer;
    //Konstruktoren
    public Kunde(Person person, int kundenNummer){
        this.vorname = person.GetVorname();
        this.nachname = person.GetNachname();
        this.kundenNummer = kundenNummer;
    }
    //Methoden
    //GET
    public int GetKundennummer() { return this.kundenNummer; }
}