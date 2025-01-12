package bada.park_rozrywki.park_rozrywki;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StrefaRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Strefa> findAll() {
        String sql = "SELECT * FROM \"Strefy\"";
        return jdbcTemplate.query(sql, (rs, rowNum) -> new Strefa(
                rs.getInt("id_strefy"),
                rs.getObject("ograniczenie_wieku") != null ? rs.getInt("ograniczenie_wieku") : null,
                rs.getString("nazwa"),
                rs.getInt("id_parku"),
                rs.getInt("id_pracownika"),
                rs.getInt("id_typu_strefy")
        ));
    }
}