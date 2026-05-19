/*H1: meer logica
Vraag twee getallen aan de gebruiker.
Zoek de grootste gemene deler van deze twee getallen en druk deze af in je console.*/

import java.util.Scanner;

public class M1H1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geef een getal:");
        int getal1 = scanner.nextInt();

        System.out.println("Geef nog een getal:");
        int getal2 = scanner.nextInt();

        int ggd = 1;
        for (int i = 1; i <= getal1 && i <= getal2; i++) {
            if (getal1 % i == 0 && getal2 % i == 0) {
                ggd = i;
            }
        }
        System.out.println("Grootste gemene deler: " + ggd);
    }
}