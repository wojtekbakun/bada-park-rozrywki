package bada.park_rozrywki.park_rozrywki;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RodzicRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Rodzic> findAll() {
        String sql = "SELECT * FROM \"Rodzice\"";
        return jdbcTemplate.query(sql, (rs, rowNum) -> new Rodzic(
                rs.getString("nr_telefonu"),
                rs.getObject("znizka") != null ? rs.getDouble("znizka") : null,
                rs.getInt("liczba_dzieci"),
                rs.getInt("id_klienta")
        ));
    }
}
