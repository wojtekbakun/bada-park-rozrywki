package bada.park_rozrywki.park_rozrywki;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WlascicielController {
    @Autowired
    private WlascicielRepository wlascicielRepository;

    @GetMapping("/wlasciciele")
    public String getWlasciciele(Model model) {
        model.addAttribute("wlasciciele", wlascicielRepository.findAll());
        return "wlasciciele";
    }
}
