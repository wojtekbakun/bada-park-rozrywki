package bada.park_rozrywki.park_rozrywki;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PracownikRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Pracownik> findAll() {
        String sql = "SELECT * FROM \"Pracownicy\"";
        return jdbcTemplate.query(sql, (rs, rowNum) -> new Pracownik(
                rs.getString("adres"),
                rs.getInt("id_pracownika"),
                rs.getString("imie"),
                rs.getString("nazwisko"),
                rs.getString("pesel"),
                rs.getObject("id_managera") != null ? rs.getInt("id_managera") : null,
                rs.getDate("data_zatrudnienia"),
                rs.getDouble("wynagrodzenie"),
                rs.getString("nr_telefonu"),
                rs.getInt("FK_id_pracownika"),
                rs.getInt("id_stanowiska")
        ));
    }

    public void save(Pracownik pracownik) {
        String sql = "INSERT INTO \"Pracownicy\" (adres, id_pracownika, imie, nazwisko, pesel, id_managera, data_zatrudnienia, wynagrodzenie, nr_telefonu, FK_id_pracownika, id_stanowiska) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, pracownik.getAdres(), pracownik.getIdPracownika(), pracownik.getImie(), pracownik.getNazwisko(),
                pracownik.getPesel(), pracownik.getIdManagera(), pracownik.getDataZatrudnienia(), pracownik.getWynagrodzenie(),
                pracownik.getNrTelefonu(), pracownik.getFkIdPracownika(), pracownik.getIdStanowiska());
    }
}
