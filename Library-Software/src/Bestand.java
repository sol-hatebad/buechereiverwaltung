public abstract class Bestand {  //rename!!
    //Attribute
    protected String titel;
    protected int id;

    //Konstruktoren
    public Bestand(String titel){
        this.titel=titel;
    }

    //Methoden
    //Get
    public String GetTitel()
    {
        return this.titel;
    }

    //Set
    public void SetTitel(String titel)
    {
        this.titel = titel;
    }
}