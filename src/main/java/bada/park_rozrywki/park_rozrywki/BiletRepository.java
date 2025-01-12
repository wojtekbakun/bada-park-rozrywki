package bada.park_rozrywki.park_rozrywki;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public class BiletRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Bilet> findAll() {
        String sql = "SELECT * FROM \"Bilety\"";
        return jdbcTemplate.query(sql, (rs, rowNum) -> new Bilet(
                rs.getString("rodzaj_biletu"),
                rs.getTimestamp("data_zakupu"),
                rs.getDouble("cena"),
                rs.getInt("id_pracownika"),
                rs.getInt("id_klienta"),
                rs.getLong("dlugosc_biletu")
        ));
    }
    public void save(Bilet bilet) {
        String sql = "INSERT INTO \"Bilety\" (\"rodzaj_biletu\", \"data_zakupu\",\"cena\", \"id_pracownika\", \"id_klienta\", \"dlugosc_biletu\") " +
                "VALUES (?, CURRENT_TIMESTAMP, ?, ?, ?, ?)";


        jdbcTemplate.update(sql,
                bilet.getRodzajBiletu(),
                bilet.getCena(),
                bilet.getIdPracownika(),
                bilet.getIdKlienta(),
        bilet.getDlugoscBiletu());
    }

    public List<Bilet> findByUsername(String username) {
        String sql = "SELECT * FROM \"Bilety\" WHERE \"id_klienta\" = (SELECT \"id_klienta\" FROM \"Klienci\" WHERE \"nazwisko\" = ?)";
        return jdbcTemplate.query(sql, new Object[]{username}, (rs, rowNum) -> new Bilet(
                rs.getString("rodzaj_biletu"),
                rs.getTimestamp("data_zakupu"),
                rs.getDouble("cena"),
                rs.getInt("id_pracownika"),
                rs.getInt("id_klienta"),
                rs.getLong("dlugosc_biletu")
        ));
    }

}
