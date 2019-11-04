package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.List;

public class Predmet {
    private String naziv;
    private int brECTS;
    private boolean obaveznost;
    private List<Student> studenti = new ArrayList<>();

    public Predmet(String naziv, int ECTS, boolean obaveznost) {
        this.naziv = naziv;
        this.brECTS = ECTS;
        this.obaveznost = obaveznost;
    }

    public void upisiStudentaNaPredmet(Student s){
        studenti.add(s);
    }
    public List spisakStudenataNaPredmetu(){return studenti;}

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
