/*M3E1: Een eenvoudige klasse

Maak een klasse Cirkel die als gegevens de straal van de cirkel en de kleur bevat.
Zorg voor een aantal constructoren zodat je een Cirkel kan aanmaken zonder parameters,
met slechts één argument (straal, kleur) of met beide parameters (straal en kleur).
Tenzij anders ingegeven is de straal 0 en de kleur wit. Maak (uiteraard) ook getters en setters.
Zorg tenslotte voor de volgende extra methoden:

print() om de cirkel (straal en kleur) af te printen.
geefOmtrek() : 2 * pi * r , met r als straal
geefOppervlakte() : pi * r * r

Voor de waarde van pi kan je Math.PI gebruiken.*/


    public class Cirkel {
        private float straal;  // field: de straal van de cirkel
        private String kleur;  // field: de kleur van de cirkel
       // Ze zijn private omdat niemand van buiten ze rechtstreeks mag aanraken.

        public Cirkel() {
            this.straal = 0;   // standaardwaarde: straal is 0
            this.kleur = "wit";  // standaardwaarde: kleur is wit
        }
        // Dit is de constructor zonder parameters — als je een cirkel aanmaakt zonder iets mee te geven,
        // krijgt hij automatisch straal 0 en kleur wit.



        public Cirkel(float straal) {   //constructor
            this.straal = straal;
            this.kleur = "wit";
        }

        public Cirkel(float straal, String kleur) {   //constructor
            this.straal = straal;
            this.kleur = kleur;
        }

        public float getStraal() {  //getter straal
            return this.straal;
        }
        public void setStraal(float straal) {  // setter straal
            this.straal = straal;
        }

        public String getKleur() {   //getter kleur
            return this.kleur;
        }
        public void setKleur(String kleur) {  //setter kleur
            this.kleur = kleur;
        }

        public double geefOmtrek(){
            return 2 * Math.PI * this.straal;
        }

        public double geefOppervlakte (){
            return Math.PI * this.straal * this.straal;
        }
        public void print() {
            System.out.println("Straal: " + this.straal);
            System.out.println("Kleur: " + this.kleur);
        }
    }
