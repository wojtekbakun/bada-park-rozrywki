package bada.park_rozrywki.park_rozrywki;

public class RodzicDziecko {
    private Integer idRodzica;
    private Integer idDziecka;

    // Konstruktor
    public RodzicDziecko(Integer idRodzica, Integer idDziecka) {
        this.idRodzica = idRodzica;
        this.idDziecka = idDziecka;
    }

    // Gettery i Settery
    public Integer getIdRodzica() {
        return idRodzica;
    }

    public void setIdRodzica(Integer idRodzica) {
        this.idRodzica = idRodzica;
    }

    public Integer getIdDziecka() {
        return idDziecka;
    }

    public void setIdDziecka(Integer idDziecka) {
        this.idDziecka = idDziecka;
    }
}

