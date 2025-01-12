package bada.park_rozrywki.park_rozrywki;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AdresRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Adres> findAll() {
        String sql = "SELECT * FROM \"Adresy\"";
        return jdbcTemplate.query(sql, (rs, rowNum) -> new Adres(
                rs.getInt("id_adresu"),
                rs.getString("kraj"),
                rs.getString("miasto"),
                rs.getString("ulica"),
                rs.getString("nr_obiektu"),
                rs.getString("kod_pocztowy")
        ));
    }
}
