/*M1: Door de hele lijst

Maak een array aan waar je vijf verschillende gehele getallen in plaatst.
Schrijf vervolgens code uit om de gemiddelde waarde van deze getallen te berekenen.
 */

public class M2M1 {
    public static void main(String[] args) {
        int[] getallen = {1,2,3,4,5};
        int som = 0;
        int aantalGetallen=0;
        for(int i=0; i< getallen.length; i++) {
            aantalGetallen++;
            som = som + getallen[i];
        }
       double gemiddelde = (double) som /aantalGetallen;
        System.out.println(gemiddelde);
        }

    }
