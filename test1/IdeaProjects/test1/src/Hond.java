public class Hond extends M4M1 {
    private int stamBoekNummer;

    // In Hond.java
    public Hond(String naam, double massa, int leeftijd, int stamBoekNummer) {
        super(massa, leeftijd, naam);
        this.stamBoekNummer = stamBoekNummer;
    }

    public int getstamBoekNummer (){ return this.stamBoekNummer;}

    public void setstamBoekNummer(int stamBoekNummer){ this.stamBoekNummer = stamBoekNummer;}

    @Override
    public String toString() {
        return super.toString() + ", Stamboeknummer: " + stamBoekNummer;
    }

}