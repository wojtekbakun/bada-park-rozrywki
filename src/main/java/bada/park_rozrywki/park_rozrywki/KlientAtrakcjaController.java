package bada.park_rozrywki.park_rozrywki;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KlientAtrakcjaController {
    @Autowired
    private KlientAtrakcjaRepository klientAtrakcjaRepository;

    @GetMapping("/klient_atrakcja")
    public String getKlientAtrakcja(Model model) {
        model.addAttribute("klientAtrakcje", klientAtrakcjaRepository.findAll());
        return "klient_atrakcja";
    }
}