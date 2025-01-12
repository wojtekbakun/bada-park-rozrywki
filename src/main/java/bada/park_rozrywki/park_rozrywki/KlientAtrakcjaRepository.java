package bada.park_rozrywki.park_rozrywki;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class KlientAtrakcjaRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<KlientAtrakcja> findAll() {
        String sql = "SELECT * FROM \"Klient_Atrakcja\"";
        return jdbcTemplate.query(sql, (rs, rowNum) -> new KlientAtrakcja(
                rs.getInt("id_klienta"),
                rs.getInt("id_atrakcji")
        ));
    }
}
