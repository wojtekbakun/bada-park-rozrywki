package bada.park_rozrywki.park_rozrywki;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.Map;

@Controller
@RequestMapping("/pracownicy")
public class PracownikController {

    @Autowired
    private PracownikRepository pracownikRepository;

    @GetMapping
    public String getPracownicy(Model model) {
        model.addAttribute("pracownicy", pracownikRepository.findAll());
        return "pracownicy";
    }

    @PostMapping("/save")
    public String savePracownik(@RequestParam String adres,
                                @RequestParam Integer idPracownika,
                                @RequestParam String imie,
                                @RequestParam String nazwisko,
                                @RequestParam String pesel,
                                @RequestParam(required = false) Integer idManagera,
                                @RequestParam Date dataZatrudnienia,
                                @RequestParam Double wynagrodzenie,
                                @RequestParam String nrTelefonu,
                                @RequestParam Integer fkIdPracownika,
                                @RequestParam Integer idStanowiska) {
        // Utwórz nowego pracownika
        Pracownik pracownik = new Pracownik(adres, idPracownika, imie, nazwisko, pesel, idManagera, dataZatrudnienia, wynagrodzenie, nrTelefonu, fkIdPracownika, idStanowiska);

        // Zapisz pracownika w bazie danych
        pracownikRepository.save(pracownik);

        // Przekierowanie po zapisaniu
        return "redirect:/pracownicy";
    }
    @PostMapping("/update")
    @ResponseBody
    public ResponseEntity<?> updatePracownik(@RequestBody Map<String, String> data) {
        try {
            Integer idPracownika = Integer.parseInt(data.get("idPracownika"));
            pracownikRepository.updatePracownik(
                    idPracownika,
                    data.get("adres"),
                    data.get("imie"),
                    data.get("nazwisko"),
                    data.get("pesel"),
                    data.get("idManagera") != null ? Integer.parseInt(data.get("idManagera")) : null,
                    Date.valueOf(data.get("dataZatrudnienia")),
                    Double.parseDouble(data.get("wynagrodzenie")),
                    data.get("nrTelefonu"),
                    Integer.parseInt(data.get("fkIdPracownika")),
                    Integer.parseInt(data.get("idStanowiska"))
            );
            return ResponseEntity.ok("Pracownik zaktualizowany.");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Wystąpił błąd podczas aktualizacji: " + e.getMessage());
        }
    }


    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public ResponseEntity<?> deletePracownik(@PathVariable Integer id) {
        // Usuń pracownika z bazy danych
        pracownikRepository.deleteById(id);
        return ResponseEntity.ok("Pracownik usunięty.");
    }

    @PostMapping("/add")
    @ResponseBody
    public ResponseEntity<?> addPracownik(@RequestBody Map<String, String> data) {
        try {
            Pracownik pracownik = new Pracownik(
                    data.get("adres"),
                    Integer.parseInt(data.get("idPracownika")),
                    data.get("imie"),
                    data.get("nazwisko"),
                    data.get("pesel"),
                    data.get("idManagera") != null ? Integer.parseInt(data.get("idManagera")) : null,
                    Date.valueOf(data.get("dataZatrudnienia")),
                    Double.parseDouble(data.get("wynagrodzenie")),
                    data.get("nrTelefonu"),
                    Integer.parseInt(data.get("fkIdPracownika")),
                    Integer.parseInt(data.get("idStanowiska"))
            );
            pracownikRepository.save(pracownik);
            return ResponseEntity.ok("Pracownik dodany.");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Wystąpił błąd podczas dodawania: " + e.getMessage());
        }
    }

}
