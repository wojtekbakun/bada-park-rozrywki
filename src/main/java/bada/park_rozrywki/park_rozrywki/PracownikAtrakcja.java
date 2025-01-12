package bada.park_rozrywki.park_rozrywki;

public class PracownikAtrakcja {
    private Integer idPracownika;
    private Integer idAtrakcji;

    // Konstruktor
    public PracownikAtrakcja(Integer idPracownika, Integer idAtrakcji) {
        this.idPracownika = idPracownika;
        this.idAtrakcji = idAtrakcji;
    }

    // Gettery i Settery
    public Integer getIdPracownika() {
        return idPracownika;
    }

    public void setIdPracownika(Integer idPracownika) {
        this.idPracownika = idPracownika;
    }

    public Integer getIdAtrakcji() {
        return idAtrakcji;
    }

    public void setIdAtrakcji(Integer idAtrakcji) {
        this.idAtrakcji = idAtrakcji;
    }
}