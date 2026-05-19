package school;

public class Bediende extends Persoon {
private Lokaal lokaal;

public Bediende (String voorNaam, String achterNaam, Lokaal lokaal){
super(voorNaam, achterNaam);
this.lokaal = lokaal;
}
protected void setLokaal (Lokaal lokaal, Bediende bediende){
    bediende.lokaal = lokaal;
    }

}