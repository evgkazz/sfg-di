package guru.springframework.sfgdi._01_types_of_di.controllers;

import guru.springframework.sfgdi._02_primary_profile.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private final GreetingService greetingService;

    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
