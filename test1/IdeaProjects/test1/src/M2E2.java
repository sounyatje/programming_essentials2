/*E2: test strings

Maak twee Strings aan, in de eerste plaats je “the quick brown fox” en in de tweede “Jumps over the lazy dog”.
Voeg beide strings samen tot een nieuwe string.

Vervang in de vorige String het woord “fox” door “cat”.
Zoek hiervoor op welke functie je kan gebruiken.*/

public class M2E2 {
    public static void main(String[] args) {
String tekst1 = "the quick brown fox";
String tekst2 = "Jumps over the lazy dog";
        String tekstSamen = tekst1 + tekst2;
        String alternatief = tekst1.concat(tekst2);
        tekstSamen = tekstSamen.replace("fox", "cat");
        System.out.println(tekstSamen);
    }
}