import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int aktion = 0;
        Buch buch = new Buch("IT", "Stephen King");
        buch = new Buch("Das Lied der Finsternis","Peter V. Brett");
        buch = new Buch("Totengräbersohn 1","Sam Feuerbach");
        buch = new Buch("Totengräbersohn 2","Sam Feuerbach");
        buch = new Buch("Totengräbersohn 3","Sam Feuerbach");
        buch = new Buch("Totengräbersohn 4","Sam Feuerbach");
        while (aktion != 4){

            aktion = abfrage();
            if (aktion == 1){
                Buch.BuchHinzufügen();
            } else if (aktion == 2) {
                Buch.Ausleihen();
            } else if (aktion == 3) {
                Buch.InfoBuch();
            }
        }
    }

    public static int abfrage(){
        Scanner auswahl = new Scanner(System.in);

        System.out.println( "Was möchten Sie machen?\n1. ein Buch hinzufügen\n2. ein Buch ausleihen\n3. Informationen über den Bestand ansehen\n4.Programm beenden " +
                "Wählen SIe mit der Zahl die jeweilige Aktion aus");
        int aktion = auswahl.nextInt();
        return aktion;

    }

    public static void personInput() {
        Datenbank datenbank = new Datenbank();

            Scanner scanner = new Scanner(System.in);
            System.out.println("Geben Sie Ihren Namen ein");
            System.out.print("Vorname: ");
            String vorname = scanner.nextLine();
            System.out.print("Nachname: ");
            String nachname = scanner.nextLine();

        Person person = new Person(vorname, nachname);
              System.out.println( "Sind Sie Kunde(1), Bibliothekar(2) oder Besucher(3)?" +
                                "\nBitte geben sie die entsprechende Zahl ein: ");
                String art = scanner.nextLine();
                if (Objects.equals(art, "1")) {
                    art = "Kunde";
                    System.out.println("Sie sind als Kunde eingetragen");

                } else if (Objects.equals(art, "2")) {
                    art = "Bibliothekar";

                    System.out.println("Sie sind als Bibliothekar eingetragen");
                } else if (Objects.equals(art, "3")) {
                    art = "Besucher";
                    System.out.println("Sie sind als Besucher eingetragen");
                } else {
                    art="" ;
                    System.out.println("keine gültige eingabe!");
                }

        datenbank.registrieren(person, art);

    }
}
