/*M1: Een iets minder eenvoudige klasse"

Maak een klasse Adres. Een object van de klasse kan de adresgegevens van een persoon bijhouden.
Een adres bevat minstens de volgende gegevens:

straatnaam
huisnummer (enkel cijfers)
bus
postcode (exact 4 cijfers)
woonplaats

Denk zelf na over de meest geschikte types om bv. tekst of getallen bij te houden.
Zorg er voor dat je zeker een constructor hebt waar je alles aan kan meegeven.
Zorg ook voor getters en setters.
Voeg ook nog een functie toe waarmee je alle gegevens in de console kan afdrukken.
Als uitdaging voorzie je ook nog een controle bij het invoeren van een postcode,
dit moet uit exact 4 cijfers bestaan en anders vervang je de invoer door 9999.
 */

public class M3M1 {
    private String straatNaam;
    private int huisNummer;
    private String bus;
    private int postCode;
    private String woonPlaats;

    public M3M1(String straatNaam, int huisNummer, String bus, int postCode, String woonPlaats) {
        this.straatNaam = straatNaam;
        this.woonPlaats = woonPlaats;
        this.huisNummer = huisNummer;
        this.bus = bus;
        this.postCode = postCode;

    }

    public String getstraatNaam() {  //getter straal
        return this.straatNaam;
    }

    public void setstraatNaam(String straatNaam) {  // setter straal
        this.straatNaam = straatNaam;
    }

    public String getwoonPlaats(String woonPlaats) {  //getter straal
        return this.woonPlaats;
    }

    public void setwoonPlaats(String woonPlaats) {  // setter straal
        this.woonPlaats = woonPlaats;
    }

    public int gethuisNummer(int huisNummer) {  //getter straal
        return this.huisNummer;
    }

    public void sethuisNummer(int huisNummer) {  // setter straal
        this.huisNummer = huisNummer;
    }

    public String getbus() {  //getter straal
        return this.bus;
    }

    public void setbus(String bus) {  // setter straal
        this.bus = bus;
    }

    public int getpostCode() {  //getter straal
        return this.postCode;
    }

    public void setpostCode(int postCode) {  // setter straal
        this.postCode = postCode;
    }

    @Override
    public String toString() {
        return "Straatnaam: " + straatNaam +
                ", Huisnummer: " + huisNummer +
                ", Bus: " + bus +
                ", Postcode: " + postCode +
                ", Woonplaats: " + woonPlaats;
    }
}




