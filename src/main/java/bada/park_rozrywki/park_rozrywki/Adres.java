package bada.park_rozrywki.park_rozrywki;


public class Adres {
    private Integer idAdresu;
    private String kraj;
    private String miasto;
    private String ulica;
    private String nrObiektu;
    private String kodPocztowy;

    // Konstruktor
    public Adres(Integer idAdresu, String kraj, String miasto, String ulica, String nrObiektu, String kodPocztowy) {
        this.idAdresu = idAdresu;
        this.kraj = kraj;
        this.miasto = miasto;
        this.ulica = ulica;
        this.nrObiektu = nrObiektu;
        this.kodPocztowy = kodPocztowy;
    }

    // Gettery i Settery
    public Integer getIdAdresu() {
        return idAdresu;
    }

    public void setIdAdresu(Integer idAdresu) {
        this.idAdresu = idAdresu;
    }

    public String getKraj() {
        return kraj;
    }

    public void setKraj(String kraj) {
        this.kraj = kraj;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getNrObiektu() {
        return nrObiektu;
    }

    public void setNrObiektu(String nrObiektu) {
        this.nrObiektu = nrObiektu;
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }

    public void setKodPocztowy(String kodPocztowy) {
        this.kodPocztowy = kodPocztowy;
    }
}
