package bada.park_rozrywki.park_rozrywki;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AtrakcjeRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Atrakcje> findAll() {
        String sql = "SELECT * FROM \"Atrakcje\"";
        return jdbcTemplate.query(sql, (rs, rowNum) -> new Atrakcje(
                rs.getInt("id_atrakcji"),
                rs.getString("nazwa"),
                rs.getString("typ"),
                rs.getInt("ograniczenie_wieku"),
                rs.getString("stan"),
                rs.getInt("max_liczba_osob"),
                rs.getInt("id_strefy"),
                rs.getInt("id_typu_atrakcji"),
                rs.getInt("id_parku")
        ));
    }

    public void save(Atrakcje atrakcja) {
        String sql = "INSERT INTO \"Atrakcje\" (id_atrakcji, nazwa, typ, ograniczenie_wieku, stan, max_liczba_osob, id_strefy, id_typu_atrakcji, id_parku) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql,
                atrakcja.getIdAtrakcji(),
                atrakcja.getNazwa(),
                atrakcja.getTyp(),
                atrakcja.getOgraniczenieWieku(),
                atrakcja.getStan(),
                atrakcja.getMaxLiczbaOsob(),
                atrakcja.getIdStrefy(),
                atrakcja.getIdTypuAtrakcji(),
                atrakcja.getIdParku());
    }
}
