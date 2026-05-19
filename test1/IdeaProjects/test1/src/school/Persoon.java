package school;

public class Persoon {
    private String voorNaam;
    private String achterNaam;

    public Persoon (String voorNaam, String achterNaam){
        this.voorNaam = voorNaam;
        this.achterNaam = achterNaam;
    }

    public String getvoorNaam (){ return this.voorNaam; }
    public void setvoorNaam(String voorNaam){ this.voorNaam = voorNaam;}

    public String getachterNaam (){ return this.achterNaam; }
    public void setachterNaam(String voorNaam){ this.achterNaam = voorNaam;}

    @Override
    public String toString() {
        return "voorNaam: " + voorNaam + ", achterNaam: " + achterNaam;
    }

}