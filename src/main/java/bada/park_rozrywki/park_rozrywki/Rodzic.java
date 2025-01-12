package bada.park_rozrywki.park_rozrywki;

public class Rodzic {
    private String nrTelefonu;
    private Double znizka;
    private Integer liczbaDzieci;
    private Integer idKlienta;

    // Konstruktor
    public Rodzic(String nrTelefonu, Double znizka, Integer liczbaDzieci, Integer idKlienta) {
        this.nrTelefonu = nrTelefonu;
        this.znizka = znizka;
        this.liczbaDzieci = liczbaDzieci;
        this.idKlienta = idKlienta;
    }

    // Gettery i Settery
    public String getNrTelefonu() {
        return nrTelefonu;
    }

    public void setNrTelefonu(String nrTelefonu) {
        this.nrTelefonu = nrTelefonu;
    }

    public Double getZnizka() {
        return znizka;
    }

    public void setZnizka(Double znizka) {
        this.znizka = znizka;
    }

    public Integer getLiczbaDzieci() {
        return liczbaDzieci;
    }

    public void setLiczbaDzieci(Integer liczbaDzieci) {
        this.liczbaDzieci = liczbaDzieci;
    }

    public Integer getIdKlienta() {
        return idKlienta;
    }

    public void setIdKlienta(Integer idKlienta) {
        this.idKlienta = idKlienta;
    }
}
