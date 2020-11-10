package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES", "default"})
@Service("i18nGreetingService")
public class I18nEsGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hola Mundo ES (Spanish)";
    }
}
