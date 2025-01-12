package bada.park_rozrywki.park_rozrywki;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KlientController {
    @Autowired
    private KlientRepository klientRepository;

    @GetMapping("/klienci")
    public String getKlienci(Model model) {
        model.addAttribute("klienci", klientRepository.findAll());
        return "klienci";
    }
}
