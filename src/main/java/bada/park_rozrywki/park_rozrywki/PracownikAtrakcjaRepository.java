package bada.park_rozrywki.park_rozrywki;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PracownikAtrakcjaRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<PracownikAtrakcja> findAll() {
        String sql = "SELECT * FROM \"Pracownik_Atrakcja\"";
        return jdbcTemplate.query(sql, (rs, rowNum) -> new PracownikAtrakcja(
                rs.getInt("id_pracownika"),
                rs.getInt("id_atrakcji")
        ));
    }
}