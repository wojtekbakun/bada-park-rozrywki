package bada.park_rozrywki.park_rozrywki;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ObiektUslugowyRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<ObiektUslugowy> findAll() {
        String sql = "SELECT * FROM \"Obiekty_uslugowe\"";
        return jdbcTemplate.query(sql, (rs, rowNum) -> new ObiektUslugowy(
                rs.getInt("id_obiektu"),
                rs.getString("nazwa"),
                rs.getString("kategoria"),
                rs.getDate("data_najmu"),
                rs.getDouble("czynsz"),
                rs.getInt("id_strefy"),
                rs.getObject("id_wlasciciela") != null ? rs.getInt("id_wlasciciela") : null
        ));
    }
}
