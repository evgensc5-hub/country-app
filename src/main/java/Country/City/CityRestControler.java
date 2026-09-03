package Country.City;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityRestControler {
    @GetMapping("/")
    public String showlanguage() {
        return "Alege țara:_______/RM <br>" +
                "Выберите страну:_________/RU <br>" +
                "Choose a country:________/EN <br>" +
                "Choisissez un pays :_____/FR <br>" +
                "Wählen Sie ein Land aus:_/DE ";
    }

    @GetMapping("/RM")
    public String showrm() {
        return "orașul: Chișinău";
    }

    @GetMapping("/RU")
    public String showru() {
        return "город: Москва";
    }

    @GetMapping("/EN")
    public String showen() {
        return "Cities: London";
    }

    @GetMapping("/FR")
    public String showfr() {
        return "Villes: Paris";
    }

    @GetMapping("/DE")
    public String showde() {
        return "Städte: Berlin";
    }
}
