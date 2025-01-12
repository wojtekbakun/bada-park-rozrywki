package bada.park_rozrywki.park_rozrywki;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RodzicController {
    @Autowired
    private RodzicRepository rodzicRepository;

    @GetMapping("/rodzice")
    public String getRodzice(Model model) {
        model.addAttribute("rodzice", rodzicRepository.findAll());
        return "rodzice";
    }
}
