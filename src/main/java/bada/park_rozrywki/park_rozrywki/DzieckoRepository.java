package bada.park_rozrywki.park_rozrywki;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DzieckoRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Dziecko> findAll() {
        String sql = "SELECT * FROM \"Dzieci\"";
        return jdbcTemplate.query(sql, (rs, rowNum) -> new Dziecko(
                rs.getDouble("wzrost"),
                rs.getInt("waga"),
                rs.getInt("id_klienta")
        ));
    }
}
