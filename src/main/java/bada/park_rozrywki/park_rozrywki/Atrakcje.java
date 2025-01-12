package bada.park_rozrywki.park_rozrywki;

public class Atrakcje {
    private Integer idAtrakcji;
    private String nazwa;
    private String typ;
    private Integer ograniczenieWieku;
    private String stan;
    private Integer maxLiczbaOsob;
    private Integer idStrefy;
    private Integer idTypuAtrakcji;
    private Integer idParku;

    // Konstruktor
    public Atrakcje(Integer idAtrakcji, String nazwa, String typ, Integer ograniczenieWieku, String stan, Integer maxLiczbaOsob, Integer idStrefy, Integer idTypuAtrakcji, Integer idParku) {
        this.idAtrakcji = idAtrakcji;
        this.nazwa = nazwa;
        this.typ = typ;
        this.ograniczenieWieku = ograniczenieWieku;
        this.stan = stan;
        this.maxLiczbaOsob = maxLiczbaOsob;
        this.idStrefy = idStrefy;
        this.idTypuAtrakcji = idTypuAtrakcji;
        this.idParku = idParku;
    }

    // Gettery i Settery
    public Integer getIdAtrakcji() {
        return idAtrakcji;
    }

    public void setIdAtrakcji(Integer idAtrakcji) {
        this.idAtrakcji = idAtrakcji;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public Integer getOgraniczenieWieku() {
        return ograniczenieWieku;
    }

    public void setOgraniczenieWieku(Integer ograniczenieWieku) {
        this.ograniczenieWieku = ograniczenieWieku;
    }

    public String getStan() {
        return stan;
    }

    public void setStan(String stan) {
        this.stan = stan;
    }

    public Integer getMaxLiczbaOsob() {
        return maxLiczbaOsob;
    }

    public void setMaxLiczbaOsob(Integer maxLiczbaOsob) {
        this.maxLiczbaOsob = maxLiczbaOsob;
    }

    public Integer getIdStrefy() {
        return idStrefy;
    }

    public void setIdStrefy(Integer idStrefy) {
        this.idStrefy = idStrefy;
    }

    public Integer getIdTypuAtrakcji() {
        return idTypuAtrakcji;
    }

    public void setIdTypuAtrakcji(Integer idTypuAtrakcji) {
        this.idTypuAtrakcji = idTypuAtrakcji;
    }

    public Integer getIdParku() {
        return idParku;
    }

    public void setIdParku(Integer idParku) {
        this.idParku = idParku;
    }
}
