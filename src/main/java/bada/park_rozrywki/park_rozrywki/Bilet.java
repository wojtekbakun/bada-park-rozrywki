package bada.park_rozrywki.park_rozrywki;


import java.time.LocalDate;
import java.util.Date;

public class Bilet {

    private String rodzajBiletu;
    private Date dataZakupu;
    private long dlugoscBiletu; // Zmienione na LocalDate
    private Double cena;
    private Integer idPracownika;
    private Integer idKlienta;

    public Bilet() {
    }


    // Konstruktor
    public Bilet( String rodzajBiletu, Date dataZakupu,  Double cena, Integer idPracownika, Integer idKlienta ,long  dlugoscBiletu) {
        this.rodzajBiletu = rodzajBiletu;
        this.dataZakupu = dataZakupu;
        this.cena = cena;
        this.idPracownika = idPracownika;
        this.idKlienta = idKlienta;
        this.dlugoscBiletu = dlugoscBiletu;
    }

    // Gettery i Settery


    public String getRodzajBiletu() {
        return rodzajBiletu;
    }

    public void setRodzajBiletu(String rodzajBiletu) {
        this.rodzajBiletu = rodzajBiletu;
    }

    public Date getDataZakupu() {
        return dataZakupu;
    }

    public void setDataZakupu(Date dataZakupu) {
        this.dataZakupu = dataZakupu;
    }

    public long getDlugoscBiletu() {
        return dlugoscBiletu;
    }

    public void setDlugoscBiletu(long  dlugoscBiletu) {
        this.dlugoscBiletu = dlugoscBiletu;
    }

    public Double getCena() {
        return cena;
    }

    public void setCena(Double cena) {
        this.cena = cena;
    }

    public Integer getIdPracownika() {
        return idPracownika;
    }

    public void setIdPracownika(Integer idPracownika) {
        this.idPracownika = idPracownika;
    }

    public Integer getIdKlienta() {
        return idKlienta;
    }

    public void setIdKlienta(Integer idKlienta) {
        this.idKlienta = idKlienta;
    }
}
