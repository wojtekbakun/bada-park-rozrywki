package bada.park_rozrywki.park_rozrywki;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PracownikAtrakcjaController {
    @Autowired
    private PracownikAtrakcjaRepository pracownikAtrakcjaRepository;

    @GetMapping("/pracownik_atrakcja")
    public String getPracownikAtrakcja(Model model) {
        model.addAttribute("pracownikAtrakcje", pracownikAtrakcjaRepository.findAll());
        return "pracownik_atrakcja";
    }
}