Scanner in = new Scanner(System.in);
String invoer = in.nextLine();


Maak een array aan met 10 plaatsen waar je gehele getallen kan in bijhouden.
Op deze array voer je vervolgens enkele bewerkingen uit.

Vul de array op zodat elke index de waarde 5 bevat
Pas de tweede waarde aan zodat dit nu 23 bevat
Probeer op de derde index de waarde 1.5 te plaatsen, lukt dit?
Schrijf een loop waarmee je elke waarde binnen de array kan afdrukken als “element i = waarde*/


public class M2E1 {
    public static void main(String[] args) {

        int[] getallen = new int[10];
        int i = 0;
        for (i = 0; i < getallen.length; i++) {
            getallen[i] = 5;
        }
        getallen[1] = 23;
        double kommaGetal = 1.5;
       // getallen[2] = kommaGetal;
        for(i=0; i<getallen.length; i++) {
            System.out.println("element " + i + " = " + getallen[i]);
        }

    }

}

