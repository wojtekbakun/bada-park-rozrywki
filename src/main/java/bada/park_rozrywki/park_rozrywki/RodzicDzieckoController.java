package bada.park_rozrywki.park_rozrywki;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RodzicDzieckoController {
    @Autowired
    private RodzicDzieckoRepository rodzicDzieckoRepository;

    @GetMapping("/rodzice_dzieci")
    public String getRodziceDzieci(Model model) {
        model.addAttribute("rodziceDzieci", rodzicDzieckoRepository.findAll());
        return "rodzice_dzieci";
    }
}
