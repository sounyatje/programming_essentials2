/*M1: Sterrenpiramide, opnieuw. Oprechte excuses

Maak een variabele hoogte, hiervoor gebruik je een klein geheel getal.
We gaan aan de hand van hoogte een sterrenpiramide bouwen. Per laag van de piramide komt er een ster bij.
Dus bijvoorbeeld als hoogte gelijk is aan 4 zal de afgedrukte piramide er zo uit zien:

        *
        **
        ***
        ****
 */

public class M1 {
    public static void main(String[] args) {
        int hoogte = 4;
        for(int aantalSterren = 1; aantalSterren <= hoogte; aantalSterren++){
            var rij = "";
            var ster = "*";
            for(int i = 0; i < aantalSterren; i++) {
             rij = rij + ster;
            }
            System.out.println(rij);
        }

    }
}
