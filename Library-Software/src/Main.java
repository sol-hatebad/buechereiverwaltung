import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Zunächst starten wir die Datenbank
        Datenbank datenbank = new Datenbank();
        System.out.println("Geben Sie Ihren Namen ein");
        System.out.print("Vorname: ");
        String vorname = scanner.nextLine();
        System.out.print("Nachname: ");
        String nachname = scanner.nextLine();
        Person person = new Person(vorname, nachname);
        System.out.println("Sind Sie Kunde, Bibliothekar oder Besucher? ");
        String art = scanner.nextLine();

        datenbank.registrieren(person,art);

        }

}