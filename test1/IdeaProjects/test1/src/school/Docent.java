package school;
/*Docenten zijn personeelsleden met een specialisatie en lokaal*/

public class Docent extends Bediende {
    private String specialisation;
    private Student[] studenten;
    private int aantalStudenten;
    public Docent (String voorNaam, String achterNaam, Lokaal lokaal, String specialisatie){
super(voorNaam, achterNaam, lokaal);
this.specialisation = specialisation;
studenten = new Student [10];
aantalStudenten = 0;
    }

    public void addStudent(Student student){

        if(aantalStudenten<studenten.length){
            studenten [aantalStudenten]= student;
            aantalStudenten++;
        }else{
            System.out.println("er kunnen geen nieuwe studenen erbij.");
        }
      /*Boolean plaatsGevonden = false;
        for (int i = 0; i< studenten.length && !plaatsGevonden; i++){  //java overloopt alle cellen
            if(studenten[i] == null){ //zoekt een cell die leeg is
                studenten[i] = student; //kent een student toe
                plaatsGevonden = true;
            }
        }*/
    }
}

