package bada.park_rozrywki.park_rozrywki;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ObiektUslugowyController {
    @Autowired
    private ObiektUslugowyRepository obiektUslugowyRepository;

    @GetMapping("/obiekty_uslugowe")
    public String getObiektyUslugowe(Model model) {
        model.addAttribute("obiekty", obiektUslugowyRepository.findAll());
        return "obiekty_uslugowe";
    }
}
