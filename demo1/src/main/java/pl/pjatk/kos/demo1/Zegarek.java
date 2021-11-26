package pl.pjatk.kos.demo1;

public class Zegarek {
    private String nazwa;
    private int cena;

    Zegarek(String nazwa, int cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }

    Zegarek() {
        nazwa = "Rolex";
        cena = 9999;
    }



    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public int getCena() {
        return cena;
    }
}
