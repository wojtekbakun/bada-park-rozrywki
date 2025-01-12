package bada.park_rozrywki.park_rozrywki;

public class Strefa {
    private Integer idStrefy;
    private Integer ograniczenieWieku;
    private String nazwa;
    private Integer idParku;
    private Integer idPracownika;
    private Integer idTypuStrefy;

    // Konstruktor
    public Strefa(Integer idStrefy, Integer ograniczenieWieku, String nazwa, Integer idParku, Integer idPracownika, Integer idTypuStrefy) {
        this.idStrefy = idStrefy;
        this.ograniczenieWieku = ograniczenieWieku;
        this.nazwa = nazwa;
        this.idParku = idParku;
        this.idPracownika = idPracownika;
        this.idTypuStrefy = idTypuStrefy;
    }

    // Gettery i Settery
    public Integer getIdStrefy() {
        return idStrefy;
    }

    public void setIdStrefy(Integer idStrefy) {
        this.idStrefy = idStrefy;
    }

    public Integer getOgraniczenieWieku() {
        return ograniczenieWieku;
    }

    public void setOgraniczenieWieku(Integer ograniczenieWieku) {
        this.ograniczenieWieku = ograniczenieWieku;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Integer getIdParku() {
        return idParku;
    }

    public void setIdParku(Integer idParku) {
        this.idParku = idParku;
    }

    public Integer getIdPracownika() {
        return idPracownika;
    }

    public void setIdPracownika(Integer idPracownika) {
        this.idPracownika = idPracownika;
    }

    public Integer getIdTypuStrefy() {
        return idTypuStrefy;
    }

    public void setIdTypuStrefy(Integer idTypuStrefy) {
        this.idTypuStrefy = idTypuStrefy;
    }
}