
package school;
import java.util.Scanner;
public class Main  {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("voornaam:");
        String voorNaam = scanner.next();

        System.out.println("achternaam:");
        String achterNaam = scanner.next();

        System.out.println("studenten nummer:");
        String studentenNummer = scanner.next();

        System.out.println("specialisatie:");
        String specialisatie = scanner.next();

        System.out.println("lokaal:");
        String lokaal = scanner.next();

        Persoon P = new Persoon(voorNaam, achterNaam);
        Student S = new Student(voorNaam, achterNaam, studentenNummer, specialisatie);
        Personeelslid r = new Personeelslid (voorNaam, achterNaam, lokaal);
        System.out.println(P);
        System.out.println(S);

    }
}