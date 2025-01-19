package bada.park_rozrywki.park_rozrywki;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class BiletController {

    private final BiletRepository biletRepository;

    public BiletController(BiletRepository biletRepository) {
        this.biletRepository = biletRepository;
    }

    @GetMapping("/bilety_user")
    public String getUserTickets(Model model) {
        // Get the logged-in user's username
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        //String username = authentication.getName();
        String username = "Zielinski";
        // Fetch tickets for the logged-in user
        List<Bilet> userTickets = biletRepository.findByUsername(username);

        // Add the tickets to the model
        model.addAttribute("userTickets", userTickets);

        return "user/bilety_user";
    }

    @PostMapping("/bilety_user")
    public String addBilet(@ModelAttribute Bilet bilet, Model model) {
        // Zapisz nowy bilet
        biletRepository.save(bilet);

        // Pobierz zaktualizowaną listę biletów
        return "redirect:/bilety_user"; // Przekierowanie na GET, gdzie załaduje zaktualizowane dane
    }
}
