package Country.City;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityRestControler {

    @GetMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE)
    public String showlanguage() {
        return "<h1>Alege tara</h1>" +
                "<a href='/RM'>Republica Moldova</a><br>" +
                "<a href='/RU'>Россия</a><br>" +
                "<a href='/EN'>United Kingdom</a><br>" +
                "<a href='/FR'>France</a><br>" +
                "<a href='/DE'>Deutschland</a>";
    }

    @GetMapping(value = "/RM", produces = MediaType.TEXT_HTML_VALUE)
    public String showrm() {
        return "<h1>Oras: Chisinau</h1>" +
                "<img src='/images/Chisinau.jpg' alt='Chisinau' width='400'>" +
                "<br><br><a href='/'>Inapoi</a>";
    }

    @GetMapping(value = "/RU", produces = MediaType.TEXT_HTML_VALUE)
    public String showru() {
        return "<h1>Город: Москва</h1>" +
                "<img src='/images/Moscova.jpg' alt='Москва' width='400'>" +
                "<br><br><a href='/'>Назад</a>";
    }

    @GetMapping(value = "/EN", produces = MediaType.TEXT_HTML_VALUE)
    public String showen() {
        return "<h1>City: London</h1>" +
                "<img src='/images/London.jpg' alt='London' width='400'>" +
                "<br><br><a href='/'>Back</a>";
    }

    @GetMapping(value = "/FR", produces = MediaType.TEXT_HTML_VALUE)
    public String showfr() {
        return "<h1>Ville : Paris</h1>" +
                "<img src='/images/Paris.jpg' alt='Paris' width='400'>" +
                "<br><br><a href='/'>Retour</a>";
    }

    @GetMapping(value = "/DE", produces = MediaType.TEXT_HTML_VALUE)
    public String showde() {
        return "<h1>Stadt: Berlin</h1>" +
                "<img src='/images/Berlin.jpg' alt='Berlin' width='400'>" +
                "<br><br><a href='/'>Zurück</a>";
    }
}
