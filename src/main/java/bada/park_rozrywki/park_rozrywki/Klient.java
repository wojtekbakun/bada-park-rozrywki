package bada.park_rozrywki.park_rozrywki;


import java.util.Date;

public class Klient {
    private Integer idKlienta;
    private String imie;
    private String nazwisko;
    private Date czasWejscia;
    private Date czasWyjscia;
    private Integer liczbaBiletow;
    private Integer wiek;

    // Konstruktor
    public Klient(Integer idKlienta, String imie, String nazwisko, Date czasWejscia, Date czasWyjscia, Integer liczbaBiletow, Integer wiek) {
        this.idKlienta = idKlienta;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.czasWejscia = czasWejscia;
        this.czasWyjscia = czasWyjscia;
        this.liczbaBiletow = liczbaBiletow;
        this.wiek = wiek;
    }

    // Gettery i Settery
    public Integer getIdKlienta() {
        return idKlienta;
    }

    public void setIdKlienta(Integer idKlienta) {
        this.idKlienta = idKlienta;
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

    public Date getCzasWejscia() {
        return czasWejscia;
    }

    public void setCzasWejscia(Date czasWejscia) {
        this.czasWejscia = czasWejscia;
    }

    public Date getCzasWyjscia() {
        return czasWyjscia;
    }

    public void setCzasWyjscia(Date czasWyjscia) {
        this.czasWyjscia = czasWyjscia;
    }

    public Integer getLiczbaBiletow() {
        return liczbaBiletow;
    }

    public void setLiczbaBiletow(Integer liczbaBiletow) {
        this.liczbaBiletow = liczbaBiletow;
    }

    public Integer getWiek() {
        return wiek;
    }

    public void setWiek(Integer wiek) {
        this.wiek = wiek;
    }
}
