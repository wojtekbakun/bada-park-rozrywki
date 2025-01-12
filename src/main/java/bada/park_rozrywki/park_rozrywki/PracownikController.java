package bada.park_rozrywki.park_rozrywki;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Date;

@Controller
public class PracownikController {
    @Autowired
    private PracownikRepository pracownikRepository;

    @GetMapping("/pracownicy")
    public String getPracownicy(Model model) {
        model.addAttribute("pracownicy", pracownikRepository.findAll());
        return "pracownicy";
    }

    @PostMapping("/pracownicy/save")
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
}
