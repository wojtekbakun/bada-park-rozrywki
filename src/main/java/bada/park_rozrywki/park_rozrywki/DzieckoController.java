package bada.park_rozrywki.park_rozrywki;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DzieckoController {
    @Autowired
    private DzieckoRepository dzieckoRepository;

    @GetMapping("/dzieci")
    public String getDzieci(Model model) {
        model.addAttribute("dzieci", dzieckoRepository.findAll());
        return "dzieci";
    }
}