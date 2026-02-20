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

void main () {

    String[] studenten = new String[10];
    for(int i = 0; i< studenten.length; i++){
        IO.println(studenten[i]);
    }
}