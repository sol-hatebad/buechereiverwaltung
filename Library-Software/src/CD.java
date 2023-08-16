public class CD extends Bestand {
    //Attribute
    protected String interpret;

    public CD(String titel) {
        super(titel);
    }
    //Konstruktoren

    //Methoden
    //Get
    public String GetInterpret()
    {
        return this.interpret;
    }

    //Set
    public void SetInterpret(String interpret)
    {
        this.interpret = interpret;
    }
}