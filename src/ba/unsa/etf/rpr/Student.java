package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String ime;
    private String prezime;
    private int brIndeksa;
    private Semestar semestar;


    public Student(String ime, String prezime, int brIndeksa) {
        this.ime = ime;
        this.prezime = prezime;
        this.brIndeksa = brIndeksa;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getBrIndeksa() {
        return brIndeksa;
    }

    public void setBrIndeksa(int brIndeksa) {
        this.brIndeksa = brIndeksa;
    }
}
