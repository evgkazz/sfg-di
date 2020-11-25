package guru.springframework.sfgdi._02_primary_profile.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"GE"})
@Service("i18nGreetingService")
public class I18nGeGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Primärer Grußdienst GE (German)";
    }
}
