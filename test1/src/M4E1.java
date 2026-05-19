/*E1: Herhaling klasse

Maak een klasse Persoon, van een persoon willen we de volgende gegevens opslaan:

    Voornaam
    Achternaam
    email
    adres (Object van klasse Adres, dat mag je uit de oefeningen van Classes overnemen)

Zorg voor een constructor waar je een persoon kan aanmaken met een voor- en achternaam.
Overschrijf ook nog de toString methode om de gegevens te kunnen afdrukken.
Om te testen of alles werkt maak je in je main klasse twee personen aan en geef je hen een adres.
Druk hun gegevens af om te controleren of correct is ingegeven.
Als uitdaging zoek je nog een manier toe om te tellen hoeveel personen er in totaal zijn aangemaakt.
Hiervoor kan je gebruik maken van static
 */

public class M4E1 {
    private String voorNaam;
    private String achterNaam;
    private String email;
    private M3M1 adres;

    private static int aantal = 0;

    public M4E1 (String voorNaam, String achterNaam){
        this.voorNaam = voorNaam;
        this.achterNaam = achterNaam;
        aantal++;
    }

    public String getvoorNaam() {
        return this.voorNaam;
    }
    public void setvoorNaam(String voorNaam) {
        this.voorNaam = voorNaam;
    }

    public String getachterNaam() {
        return this.achterNaam;
    }
    public void setachterNaam(String achterNaam) {
        this.achterNaam = achterNaam;
    }
    public String getemail() {
        return this.email;
    }
    public void setemail(String email) {
        this.email= email;
    }

    public static int getAantal() {
        return aantal;
    }

    // Getter en setter voor adres
    public M3M1 getAdres() { return this.adres; }
    public void setAdres(M3M1 adres) { this.adres = adres; }

    @Override
    public String toString() {
        return voorNaam + " " + achterNaam + " - " + email + " - " + adres;
    }
}
