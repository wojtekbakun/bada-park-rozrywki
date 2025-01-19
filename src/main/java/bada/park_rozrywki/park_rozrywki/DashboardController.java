package bada.park_rozrywki.park_rozrywki;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class DashboardController {

    @RequestMapping("/logout")
    public String logout(HttpServletRequest request, HttpServletResponse response) {
        request.getSession().invalidate(); // Unieważnij sesję
        return "redirect:/index"; // Przekierowanie po wylogowaniu
    }

    @RequestMapping("/main")
    public String defaultAfterLogin(HttpServletRequest request) {
        if (request.isUserInRole("ADMIN")) {
            return "redirect:/main_admin";
        } else if (request.isUserInRole("USER")) {
            return "redirect:/main_user";
        } else {
            return "redirect:/index";
        }
    }

    @Autowired
    private KlientRepository klientRepository;

    @Autowired
    private BiletRepository biletRepository;

    @Autowired
    private PracownikRepository pracownikRepository;

    @Autowired
    private AtrakcjeRepository atrakcjeRepository;


    @Autowired
    private ObiektUslugowyRepository obiektUslugowyRepository;

    @Autowired
    private StrefaRepository strefaRepository;


    @Autowired
    private WlascicielRepository wlascicielRepository;



    @GetMapping("/main_admin")
    public String showAdminPage(Model model) {
        // Pobranie danych z bazy
        List<Klient> klienci = klientRepository.findAll();
        List<Bilet> bilety = biletRepository.findAll();
        List<Pracownik> pracownicy = pracownikRepository.findAll();
        List<Atrakcje> atrakcje = atrakcjeRepository.findAll();
        List<ObiektUslugowy> obiekty = obiektUslugowyRepository.findAll();
        List<Strefa> strefy = strefaRepository.findAll();
        List<Wlasciciel> wlasciciele = wlascicielRepository.findAll();


        // Przekazanie danych do widoku
        model.addAttribute("klienci", klienci);
        model.addAttribute("bilety", bilety);
        model.addAttribute("pracownicy", pracownicy);
        model.addAttribute("atrakcje", atrakcje);
        model.addAttribute("strefy", strefy);
        model.addAttribute("obiekty", obiekty);
        model.addAttribute("wlasciciele", wlasciciele);


        return "admin/main_admin"; // nazwa pliku HTML bez rozszerzenia
    }

    @RequestMapping(value = {"/main_user"})
    public String getUserData(Model model) {
        model.addAttribute("klient", klientRepository.findUserById(1)); // Przykladowy ID użytkownika
        return "user/main_user";
    }

    @PostMapping("/user/update")
    public String updateUser(@RequestParam Integer idKlienta,
                             @RequestParam String imie,
                             @RequestParam String nazwisko,
                             @RequestParam(required = false) String czasWejscia,
                             @RequestParam(required = false) String czasWyjscia,
                             @RequestParam Integer liczbaBiletow,
                             @RequestParam Integer wiek) {
        klientRepository.updateUser(idKlienta, imie, nazwisko, czasWejscia, czasWyjscia, liczbaBiletow, wiek);
        return "redirect:/index";
    }

    @RequestMapping("/bilety")
    public String ticketView(HttpServletRequest request) {
        if (request.isUserInRole("ADMIN")) {
            return "redirect:/bilety_admin";
        } else if (request.isUserInRole("USER")) {
            return "redirect:/bilety_user";
        } else {
            return "redirect:/index";
        }
    }

    @RequestMapping(value = {"/bilety_admin"})
    public String showAdminTickets(Model model) {
        return "admin/bilety_admin";
    }

    @RequestMapping(value = {"/bilety_user"})
    public String showUserTickers(Model model) {
        return "user/bilety_user";
    }
}
