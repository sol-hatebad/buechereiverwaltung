import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Buch extends Bestand {
    //Attribute
    protected String autor;
    static ArrayList<String> bAutor = new ArrayList<>();
    static ArrayList<String> bTitel = new ArrayList<>();
    static ArrayList<Boolean> bStatus = new ArrayList<>();
    //Konstruktoren
    public Buch (String titel,String autor){
        super(titel);
        this.autor=autor;
        this.titel=titel;
        bTitel.add(titel);
        bAutor.add(autor);
        bStatus.add(true);
    }


    //Methoden
    //Get
    public String GetAutor()
    {
        return this.autor;
    }

    //Set
    public void SetAutor(String autor)
    {
        this.autor = autor;
    }
    public static void BuchHinzufügen(){
        Scanner newTitel = new Scanner(System.in);
        Scanner newAutor = new Scanner(System.in);
        System.out.println("Titel des Buches: ");
        String tempTitel = newTitel.nextLine();
        System.out.println("Autor des Buches:");
        String tempAutor = newAutor.nextLine();
        Buch neuesBuch = new Buch(tempTitel,tempAutor);
    }
    public static void Ausleihen(){
        int number;
        Scanner input = new Scanner(System.in);
        Scanner option = new Scanner(System.in);

        Buch.InfoBuch();
        System.out.println("Welches Buch möchten Sie ausleihen?");
        number = input.nextInt();
        System.out.print(bTitel.get(number) + " - ");
        System.out.print(bAutor.get(number));

        System.out.println("Möchten sie dieses Buch ausleihen?(y/n)");
        String yn = option.next();
        if (Objects.equals(yn, "y")){
            bStatus.set(number, false);
        }
        Buch.InfoBuch();


    }

    //Info ausgeben
    public static void InfoBuch(){
        System.out.println("Es sind Folgende Bücher im System erfasst:");
        for (int i =0; i < bTitel.size(); i++){
            System.out.print("\n");
            System.out.println(i + " " + bTitel.get(i));
            System.out.println("  " + bAutor.get(i));

            if (bStatus.get(i) == true){
                System.out.println("  Buch verfügbar!");
            }
            else{
                System.out.println("  Buch aktuell verliehen!");
            }
        }
        System.out.println("Das System erfasst " + bTitel.size() + " Bücher.");
    }
}