package bada.park_rozrywki.park_rozrywki;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class WlascicielRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Wlasciciel> findAll() {
        String sql = "SELECT * FROM \"Wlasciciele\"";
        return jdbcTemplate.query(sql, (rs, rowNum) -> new Wlasciciel(
                rs.getInt("id_wlasciciela"),
                rs.getString("imie"),
                rs.getString("nazwisko"),
                rs.getString("nazwa_firmy")
        ));
    }
}
