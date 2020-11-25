package guru.springframework.sfgdi._02_primary_profile.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("EN")
@Service("i18nGreetingService")
public class I18nEnGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World En (English)";
    }
}
