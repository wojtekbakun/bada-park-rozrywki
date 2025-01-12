package bada.park_rozrywki.park_rozrywki;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "login"; // Zwraca login.html z katalogu /templates
    }
}
