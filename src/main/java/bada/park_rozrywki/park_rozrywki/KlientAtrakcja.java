package bada.park_rozrywki.park_rozrywki;

public class KlientAtrakcja {
    private Integer idKlienta;
    private Integer idAtrakcji;

    // Konstruktor
    public KlientAtrakcja(Integer idKlienta, Integer idAtrakcji) {
        this.idKlienta = idKlienta;
        this.idAtrakcji = idAtrakcji;
    }

    // Gettery i Settery
    public Integer getIdKlienta() {
        return idKlienta;
    }

    public void setIdKlienta(Integer idKlienta) {
        this.idKlienta = idKlienta;
    }

    public Integer getIdAtrakcji() {
        return idAtrakcji;
    }

    public void setIdAtrakcji(Integer idAtrakcji) {
        this.idAtrakcji = idAtrakcji;
    }
}
