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
}
