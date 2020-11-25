package guru.springframework.sfgdi._01_types_of_di.services;

import guru.springframework.sfgdi._02_primary_profile.services.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello world - Constructor";
    }
}
