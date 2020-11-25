package guru.springframework.sfgdi._02_primary_profile.controllers;

import guru.springframework.sfgdi._02_primary_profile.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Controller for testing pirpose
 */
@Controller
public class PrimaryInjectedController {

    private final GreetingService greetingService;
    public PrimaryInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String getGreeting() {

        return greetingService.sayGreeting();
    }
}
