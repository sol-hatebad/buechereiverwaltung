import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    personInput();

    personInput();

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
