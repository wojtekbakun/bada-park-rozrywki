package bada.park_rozrywki.park_rozrywki;


public class Dziecko {
    private Double wzrost;
    private Integer waga;
    private Integer idKlienta;

    // Konstruktor
    public Dziecko(Double wzrost, Integer waga, Integer idKlienta) {
        this.wzrost = wzrost;
        this.waga = waga;
        this.idKlienta = idKlienta;
    }

    // Gettery i Settery
    public Double getWzrost() {
        return wzrost;
    }

    public void setWzrost(Double wzrost) {
        this.wzrost = wzrost;
    }

    public Integer getWaga() {
        return waga;
    }

    public void setWaga(Integer waga) {
        this.waga = waga;
    }

    public Integer getIdKlienta() {
        return idKlienta;
    }

    public void setIdKlienta(Integer idKlienta) {
        this.idKlienta = idKlienta;
    }
}
