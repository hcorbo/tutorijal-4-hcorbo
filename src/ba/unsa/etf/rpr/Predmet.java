package ba.unsa.etf.rpr;

public class Predmet {
    private String naziv;
    private int brECTS;
    private boolean obaveznost;
    private Student [] studenti;

    public Predmet(String naziv, int ECTS, boolean obaveznost) {
        this.naziv = naziv;
        this.brECTS = ECTS;
        this.obaveznost = obaveznost;
    }

    public void upisiStudentaNaPredmet(Student s){ }
    public String spisakStudenataNaPredmetu(){return null;}

    public boolean isObaveznost() {
        return obaveznost;
    }

    public void setObaveznost(boolean obaveznost) {
        this.obaveznost = obaveznost;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
}
