package bada.park_rozrywki.park_rozrywki;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StrefaController {
    @Autowired
    private StrefaRepository strefaRepository;

    @GetMapping("/strefy")
    public String getStrefy(Model model) {
        model.addAttribute("strefy", strefaRepository.findAll());
        return "strefy";
    }
}