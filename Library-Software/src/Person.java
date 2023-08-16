import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Person {
    //Attribute
    protected String vorname;
    protected String nachname;


    //Konstruktoren
    public Person() {

    }
    public Person(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }
    //Methoden
    //Get
    public String GetVorname()
    {
        return this.vorname;
    }

    public String GetNachname()
    {
        return this.nachname;
    }

    //Set
    public void SetVorname(String vorname)
    {
        this.vorname = vorname;
    }

    public void SetNachname(String nachname)
    {
        this.nachname = nachname;
    }


    public String searchObjekt()
    {

        return null;
    }
    public String borrowObjekt()
    {

        return null;
    }
    public String returnObjekt()
    {

        return null;
    }
    public String ShowVerlauf()
    {

        return null;
    }

}