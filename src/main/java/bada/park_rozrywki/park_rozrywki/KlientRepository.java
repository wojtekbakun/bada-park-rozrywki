package bada.park_rozrywki.park_rozrywki;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class KlientRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Klient> findAll() {
        String sql = "SELECT * FROM \"Klienci\"";
        return jdbcTemplate.query(sql, (rs, rowNum) -> new Klient(
                rs.getInt("id_klienta"),
                rs.getString("imie"),
                rs.getString("nazwisko"),
                rs.getTimestamp("czas_wejscia"),
                rs.getTimestamp("czas_wyjscia"),
                rs.getInt("liczba_biletow"),
                rs.getInt("wiek")
        ));
    }

    public List<Klient> findUserById(Integer id) {
        String sql = "SELECT * FROM \"Klienci\" WHERE \"id_klienta\" = ?";
        return jdbcTemplate.query(sql, new Object[]{id}, (rs, rowNum) -> new Klient(
                rs.getInt("id_klienta"),
                rs.getString("imie"),
                rs.getString("nazwisko"),
                rs.getTimestamp("czas_wejscia"),
                rs.getTimestamp("czas_wyjscia"),
                rs.getInt("liczba_biletow"),
                rs.getInt("wiek")
        ));
    }

    public void updateUser(Integer idKlienta, String imie, String nazwisko, String czasWejscia, String czasWyjscia, Integer liczbaBiletow, Integer wiek) {
        System.out.println("Dane otrzymane w żądaniu:");
        System.out.println("ID Klienta: " + idKlienta);
        System.out.println("Imię: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Czas wejścia: " + czasWejscia);
        System.out.println("Czas wyjścia: " + czasWyjscia);
        System.out.println("Liczba biletów: " + liczbaBiletow);
        System.out.println("Wiek: " + wiek);

        String sql = "UPDATE \"Klienci\" " +
                "SET \"id_klienta\" = 1, " +
                "\"imie\" = ?, " +
                "\"nazwisko\" = ?, " +
                "\"czas_wejscia\" = TO_DATE('2025-01-20', 'YYYY-MM-DD'), " +
                "\"czas_wyjscia\" = TO_DATE('2025-01-20', 'YYYY-MM-DD'), " +
                "\"liczba_biletow\" = ?, " +
                "\"wiek\" = ? " +
                "WHERE \"id_klienta\" = 1";

        jdbcTemplate.update(sql, imie, nazwisko,  liczbaBiletow, wiek);
    }

}
