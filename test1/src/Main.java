/*void main() {
IO.println("Hello World");
String ingegeven = IO.readln("geef iets in: ");
int getal = Integer.parseInt(ingegeven);
IO.println("het is ingegeven " + getal*5);
}*/

/*public static void main (String[] args){
    System.out.println("heeyy");
}*/

/*int functie (int a, int b){
    //IO.println(a+b);
    return a+b;
}

void main () {
    //functie (3,7);
    IO.println(functie(3,7));
}*/

/*void main(){
    //int a = 5;
    //float b = 5;
    //IO.println(b/2);
    //float b = 5/2;  // int delen door int je plaatst dat in een float dus je bent die komma al kwijt vooraleer je het in een float plaatst.
    //IO.println(b);
    float c = 5f/2; //je maakt de 5 een float ervan
    IO.println(c);

}*/

/*void main (){
    boolean test = true;
    char t = 'R';
    //IO.println(t+1);
    IO.println((char)(t+1));
}*/

/*void main(){
    for (int i = 0; i<26; i++) {
        char t = (char) ('a' + i);
        IO.println(t);
    }

    int a = 5;
    while(a<8){
        a++;
        IO.println("uitvoer: " + a);
    }

    do{
        a--;
        IO.println("uitvoer: " + a);
    } while(a>3);

    switch (a) {
        case1:
        IO.println();
        break;
        case2:
        IO.println();
        break;
        case3:
        IO.println("gelukt");
        break;
        default: IO.println("iets anders");
    }
}*/

/*void main () {

    String[] lijst = new String[10];
    lijst [2] = "Ruben";
    for(int i = 0; i< lijst.length; i++){
        IO.println(lijst[i]);
    }
}*/

// in java geen methodes zoals javascript push, pop, etc maar collections
// classe = object?
// classe heeft functionaliteiten, functies, gegevens. bij primitieve datatype heb je dat niet. gwn gegevens als geheugen
// classe ex. Date datum = new Date ()
/*void main () {
    int a; // primitieve datatype
    Integer b; // object
    String c;
}*/

/*void main (){
    Date d = new Date ();
    System.out.println(d);
    LocalDate d2 = LocalDate.now();
}*/

/*import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Geef de straal:");
        float straal = scanner.nextFloat();

        System.out.println("Geef de kleur:");
        String kleur = scanner.next();

        Cirkel c = new Cirkel(straal, kleur);
        c.print();

        System.out.println("Omtrek: " + c.geefOmtrek());
        System.out.println("Oppervlakte: " + c.geefOppervlakte());
    }
}*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Geef straat naam:");
        String straatNaam = scanner.next();

        System.out.println("Geef de huis nummer:");
        int huisNummer = scanner.nextInt();

        System.out.println("Geef de bus:");
        String bus = scanner.next();

        System.out.println("Geef post code:");
        int postCode = scanner.nextInt();

        System.out.println("Geef de woonplaats:");
        String woonplaats= scanner.next();

        M3M1 a = new M3M1 (straatNaam, huisNummer, bus, postCode, woonplaats);
        a.print();
    }
}



// bij het examen ga je de juiste tijdsclasse moeten gebruiken! vergelijkingen ervoor of erna..
