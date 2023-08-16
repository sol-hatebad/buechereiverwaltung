public class EBook extends Buch {
    //Attribute
    protected int groesse;

    public EBook(String titel, String autor) {
        super(titel, autor);
    }
    //Konstruktoren

    //Methoden
    //Get
    public int GetGroesse() { return this.groesse; }

    //Set
    public void SetGroesse(int groesse) {
        this.groesse = groesse;
    }
}