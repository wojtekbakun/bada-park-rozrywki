package bada.park_rozrywki.park_rozrywki;


import java.util.Date;

public class ObiektUslugowy {
    private Integer idObiektu;
    private String nazwa;
    private String kategoria;
    private Date dataNajmu;
    private Double czynsz;
    private Integer idStrefy;
    private Integer idWlasciciela;

    // Konstruktor
    public ObiektUslugowy(Integer idObiektu, String nazwa, String kategoria, Date dataNajmu, Double czynsz, Integer idStrefy, Integer idWlasciciela) {
        this.idObiektu = idObiektu;
        this.nazwa = nazwa;
        this.kategoria = kategoria;
        this.dataNajmu = dataNajmu;
        this.czynsz = czynsz;
        this.idStrefy = idStrefy;
        this.idWlasciciela = idWlasciciela;
    }

    // Gettery i Settery
    public Integer getIdObiektu() {
        return idObiektu;
    }

    public void setIdObiektu(Integer idObiektu) {
        this.idObiektu = idObiektu;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getKategoria() {
        return kategoria;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }

    public Date getDataNajmu() {
        return dataNajmu;
    }

    public void setDataNajmu(Date dataNajmu) {
        this.dataNajmu = dataNajmu;
    }

    public Double getCzynsz() {
        return czynsz;
    }

    public void setCzynsz(Double czynsz) {
        this.czynsz = czynsz;
    }

    public Integer getIdStrefy() {
        return idStrefy;
    }

    public void setIdStrefy(Integer idStrefy) {
        this.idStrefy = idStrefy;
    }

    public Integer getIdWlasciciela() {
        return idWlasciciela;
    }

    public void setIdWlasciciela(Integer idWlasciciela) {
        this.idWlasciciela = idWlasciciela;
    }
}