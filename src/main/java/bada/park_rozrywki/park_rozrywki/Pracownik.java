package bada.park_rozrywki.park_rozrywki;


import java.util.Date;

public class Pracownik {
    private String adres;
    private Integer idPracownika;
    private String imie;
    private String nazwisko;
    private String pesel;
    private Integer idManagera;
    private Date dataZatrudnienia;
    private Double wynagrodzenie;
    private String nrTelefonu;
    private Integer fkIdPracownika;
    private Integer idStanowiska;

    // Konstruktor
    public Pracownik(String adres, Integer idPracownika, String imie, String nazwisko, String pesel, Integer idManagera,
                     Date dataZatrudnienia, Double wynagrodzenie, String nrTelefonu, Integer fkIdPracownika, Integer idStanowiska) {
        this.adres = adres;
        this.idPracownika = idPracownika;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.idManagera = idManagera;
        this.dataZatrudnienia = dataZatrudnienia;
        this.wynagrodzenie = wynagrodzenie;
        this.nrTelefonu = nrTelefonu;
        this.fkIdPracownika = fkIdPracownika;
        this.idStanowiska = idStanowiska;
    }

    // Gettery i Settery
    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public Integer getIdPracownika() {
        return idPracownika;
    }

    public void setIdPracownika(Integer idPracownika) {
        this.idPracownika = idPracownika;
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

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public Integer getIdManagera() {
        return idManagera;
    }

    public void setIdManagera(Integer idManagera) {
        this.idManagera = idManagera;
    }

    public Date getDataZatrudnienia() {
        return dataZatrudnienia;
    }

    public void setDataZatrudnienia(Date dataZatrudnienia) {
        this.dataZatrudnienia = dataZatrudnienia;
    }

    public Double getWynagrodzenie() {
        return wynagrodzenie;
    }

    public void setWynagrodzenie(Double wynagrodzenie) {
        this.wynagrodzenie = wynagrodzenie;
    }

    public String getNrTelefonu() {
        return nrTelefonu;
    }

    public void setNrTelefonu(String nrTelefonu) {
        this.nrTelefonu = nrTelefonu;
    }

    public Integer getFkIdPracownika() {
        return fkIdPracownika;
    }

    public void setFkIdPracownika(Integer fkIdPracownika) {
        this.fkIdPracownika = fkIdPracownika;
    }

    public Integer getIdStanowiska() {
        return idStanowiska;
    }

    public void setIdStanowiska(Integer idStanowiska) {
        this.idStanowiska = idStanowiska;
    }
}
