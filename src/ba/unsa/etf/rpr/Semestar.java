package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Semestar {
    private ArrayList<Student> studenti;
    private ArrayList<Predmet> predmeti;
    private int brSemestra;

    public void upisStudenta(Student s){
        studenti.add(s);
    }
    public void dodajPredmetNaSemestar(Predmet p){
        predmeti.add(p);
    }
    public void izbrisiPredmetIzSemestra(Predmet p){
        predmeti.remove(p);
    }

    /*private int brojSemestra;
    private int ECTS;
    private Map<Integer, Set<Predmet>> semestri;

    public void dodajPredmetNaSemestar(int brSemestra, Predmet predmet){}
    public Set<Predmet> dajPredmeteNaSemetru(int brojSemestra, Predmet predmet){return null;}
    public void izbrisiPredmetNaSemestru(int brojSemestra, Predmet predmet){}*/


}
