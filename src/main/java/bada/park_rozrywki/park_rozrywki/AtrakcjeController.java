package bada.park_rozrywki.park_rozrywki;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AtrakcjeController {
    @Autowired
    private AtrakcjeRepository atrakcjeRepository;

    @GetMapping("/atrakcje")
    public String getAtrakcje(Model model) {
        model.addAttribute("atrakcje", atrakcjeRepository.findAll());
        return "atrakcje";
    }

    @PostMapping("/atrakcje/save")
    public String saveAtrakcja(@RequestParam Integer idAtrakcji,
                               @RequestParam String nazwa,
                               @RequestParam String typ,
                               @RequestParam Integer ograniczenieWieku,
                               @RequestParam String stan,
                               @RequestParam Integer maxLiczbaOsob,
                               @RequestParam Integer idStrefy,
                               @RequestParam Integer idTypuAtrakcji,
                               @RequestParam Integer idParku) {
        Atrakcje atrakcja = new Atrakcje(idAtrakcji, nazwa, typ, ograniczenieWieku, stan, maxLiczbaOsob, idStrefy, idTypuAtrakcji, idParku);
        atrakcjeRepository.save(atrakcja);
        return "redirect:/atrakcje";
    }
}
