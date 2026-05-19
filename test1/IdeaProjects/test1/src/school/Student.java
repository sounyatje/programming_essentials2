package school;
/*Een Student is een Persoon en heeft verder nog een studentennummer en specialisatie (bv. TI, MCT, ...)*/
public class Student extends Persoon {
    private String studentenNummer;
    private String specialisatie;

    public Student (String voorNaam, String achterNaam, String studentenNummer, String specialisatie){
        super(studentenNummer, specialisatie);
        this.studentenNummer = studentenNummer;
        this.specialisatie = specialisatie;
    }

    public String getstudentenNummer (){ return this.studentenNummer; }
    public void setstudentenNummer(String studentenNummer){ this.studentenNummer = studentenNummer;}

    public String getspecialisatie (){ return this.specialisatie; }
    public void setspecialisatie(String specialisatie){ this.specialisatie = specialisatie;}

    @Override
    public String toString() {
        return super.toString() + "studenten nummer: " + studentenNummer + ", specialisatie: " + specialisatie;
    }

}