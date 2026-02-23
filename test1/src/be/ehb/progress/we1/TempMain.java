import be.ehb.progress.we1.Persoon;

void main() {
    Persoon p = new Persoon();
    if(p.naam!=null && p.naam.toLowerCase() == "ruben"){
        System.out.println("ok!");
    }
}