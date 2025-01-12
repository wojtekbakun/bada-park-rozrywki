package bada.park_rozrywki.park_rozrywki;

public class Wlasciciel {
    private Integer idWlasciciela;
    private String imie;
    private String nazwisko;
    private String nazwaFirmy;

    // Konstruktor
    public Wlasciciel(Integer idWlasciciela, String imie, String nazwisko, String nazwaFirmy) {
        this.idWlasciciela = idWlasciciela;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nazwaFirmy = nazwaFirmy;
    }

    // Gettery i Settery
    public Integer getIdWlasciciela() {
        return idWlasciciela;
    }

    public void setIdWlasciciela(Integer idWlasciciela) {
        this.idWlasciciela = idWlasciciela;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getNazwaFirmy() {
        return nazwaFirmy;
    }

    public void setNazwaFirmy(String nazwaFirmy) {
        this.nazwaFirmy = nazwaFirmy;
    }
}
