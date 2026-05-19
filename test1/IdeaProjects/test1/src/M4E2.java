/*E2: Niet verzuipen

We maken een klasse Zwembad om een offerte te kunnen opstellen voor de bouw van zwembaden.
Een zwembad zal bestaan uit een cirkelvormig reservoir water, een pad er rond en een omheining rond het pad.
Je kan het jezelf gemakkelijker maken door gebruik te maken van de klasse Cirkel uit de oefeningen voor Classes,
dit helpt voor de berekeningen. Om dit voor te stellen hebben we enkele gegevens nodig:

de straal van het zwembad zelf
de breedte van het pad
de prijs voor het pad, we gaan er van uit dat dit een prijs per vierkante meter is, bv. 45 €/m²
de prijs voor de omheining, we gaan er van uit dat dit een prijs is per meter, bv. 80.75 €/m

Binnen deze klasse schrijf je functies uit om het volgende te berekenen:

De prijs van het pad
De prijs van de omheining
De totale prijs hiervoor*/

public class M4E2 {
    private float prijsPad;
    private float prijsOmheining;
    private double breedte;
    private float prijsTotaal;
    private Cirkel cirkel;

    public M4E2(float prijsPad, float prijsOmheining, double breedte) {
        this.prijsPad = prijsPad;
        this.prijsOmheining = prijsOmheining;
        this.breedte = breedte;
    }

    public double getbreedte (){
        return this.breedte;
    }

    public void setbreedte( float breedte){
        this.breedte = breedte;
    }

    public float getprijsOmheining (){
        return this.prijsOmheining;
    }

    public void setprijsOmheining (float prijsOmheining){
        this.prijsOmheining = prijsOmheining;
    }

    public float getprijsPad (){
        return this.prijsPad;
    }

    public void setprijsPad(float prijsPad){
        this.prijsPad = prijsPad;
    }

    public float getprijsTotaal() {
        return berekenPrijsPad() + berekenPrijsOmheining();
    }


    public Cirkel getcirkel(){ return this.cirkel; }
    public void setcirkel(Cirkel cirkel) {
        this.cirkel = cirkel;
    }

    public float berekenPrijsPad() {
        double straal = cirkel.getStraal();
        double oppervlaktePad = Math.PI * Math.pow(straal + breedte, 2)
                - Math.PI * Math.pow(straal, 2);
        return (float)(oppervlaktePad * prijsPad);
    }

    public float berekenPrijsOmheining() {
        double straal = cirkel.getStraal();
        double omtrek = 2 * Math.PI * (straal + breedte);
        return (float)(omtrek * prijsOmheining);
    }



    @Override
    public String toString() {
        return "pad: " + berekenPrijsPad() +
                " omheining: " + berekenPrijsOmheining() +
                " totale prijs: " + getprijsTotaal();
    }
}