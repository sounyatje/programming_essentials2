package school;

public class Personeelslid extends Persoon {
    private String lokaal;

    public Personeelslid(String voorNaam, String achterNaam, String lokaal ){
        super(voorNaam, achterNaam);
        this.lokaal = lokaal;
    }

    public String getlokaal (){ return this.lokaal; }
    public void setlokaal(String lokaal){ this.lokaal = lokaal;}
    @Override
    public String toString() {
        return super.toString() + "lokaal: " + lokaal;
    }
}