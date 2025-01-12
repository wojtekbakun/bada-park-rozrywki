package bada.park_rozrywki.park_rozrywki;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RodzicDzieckoRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<RodzicDziecko> findAll() {
        String sql = "SELECT * FROM \"Rodzice_Dzieci\"";
        return jdbcTemplate.query(sql, (rs, rowNum) -> new RodzicDziecko(
                rs.getInt("id_rodzica"),
                rs.getInt("id_dziecka")
        ));
    }
}
