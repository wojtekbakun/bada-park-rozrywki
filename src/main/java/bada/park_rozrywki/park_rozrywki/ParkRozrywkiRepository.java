package bada.park_rozrywki.park_rozrywki;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ParkRozrywkiRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<ParkRozrywki> findAll() {
        String sql = "SELECT * FROM \"Parki_rozrywki\"";
        return jdbcTemplate.query(sql, (rs, rowNum) -> new ParkRozrywki(
                rs.getInt("id_parku"),
                rs.getString("nazwa"),
                rs.getString("adres"),
                rs.getDate("data_zalozenia"),
                rs.getInt("id_adresu"),
                rs.getInt("id_wlasciciela")
        ));
    }
}
