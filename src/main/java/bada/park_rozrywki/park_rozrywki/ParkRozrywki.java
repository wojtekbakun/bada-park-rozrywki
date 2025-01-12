package bada.park_rozrywki.park_rozrywki;

import java.sql.Date;

public class ParkRozrywki {
    private Integer idParku;
    private String nazwa;
    private String adres;
    private Date dataZalozenia;
    private Integer idAdresu;
    private Integer idWlasciciela;

    // Konstruktor
    public ParkRozrywki(Integer idParku, String nazwa, String adres, Date dataZalozenia, Integer idAdresu, Integer idWlasciciela) {
        this.idParku = idParku;
        this.nazwa = nazwa;
        this.adres = adres;
        this.dataZalozenia = dataZalozenia;
        this.idAdresu = idAdresu;
        this.idWlasciciela = idWlasciciela;
    }

    // Gettery i Settery
    public Integer getIdParku() {
        return idParku;
    }

    public void setIdParku(Integer idParku) {
        this.idParku = idParku;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public Date getDataZalozenia() {
        return dataZalozenia;
    }

    public void setDataZalozenia(Date dataZalozenia) {
        this.dataZalozenia = dataZalozenia;
    }

    public Integer getIdAdresu() {
        return idAdresu;
    }

    public void setIdAdresu(Integer idAdresu) {
        this.idAdresu = idAdresu;
    }

    public Integer getIdWlasciciela() {
        return idWlasciciela;
    }

    public void setIdWlasciciela(Integer idWlasciciela) {
        this.idWlasciciela = idWlasciciela;
    }
}

