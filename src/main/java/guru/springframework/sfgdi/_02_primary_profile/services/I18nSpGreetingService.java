package guru.springframework.sfgdi._02_primary_profile.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"SP", "default"})
@Service("i18nGreetingService")
public class I18nSpGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hola Mundo ES (Spanish)";
    }
}
