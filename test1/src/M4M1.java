/*M1: Een paar beestjes

Maak een Huisdier, huisdieren hebben een gewicht, leeftijd en naam.
 Zorg voor een constructor, getters, setters en een toString functie.

Maak vervolgens een klasse hond die hier van gaat overerven.
Honden nemen alles over van een Huisdier en voegen nog een stamboeknummer toe.
Voorzie ook hiervoor een constructor, getters, setters en een toString functie.

Maak om alles te testen enkele huisdieren en honden aan en kijk wat er gebeurt als je hun gegevens afdrukt.*/

public class M4M1{

    private double massa;
    private int leeftijd;
    private String naam;

    public M4M1(double massa, int leeftijd, String naam){
        this.massa = massa;
        this.leeftijd = leeftijd;
        this.naam = naam;

    }

public double getmassa (){ return this.massa; }

public void setmassa(double massa){ this.massa = massa;}

public int getleeftijd (){ return this.leeftijd;}

public void setleeftijd(int leeftijd){ this.leeftijd = leeftijd; }

public String getnaam (){ return this.naam;}

public void setnaam(String naam){ this.naam = naam; }


    @Override
    public String toString() {
        return "Naam: " + naam + ", Massa: " + massa + ", Leeftijd: " + leeftijd;
    }
}
