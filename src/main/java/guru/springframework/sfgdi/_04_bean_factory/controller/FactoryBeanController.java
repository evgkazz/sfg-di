package guru.springframework.sfgdi._04_bean_factory.controller;
import guru.springframework.sfgdi._04_bean_factory.service.GreetingService2;
import org.springframework.stereotype.Controller;

@Controller
public class FactoryBeanController {
    private final GreetingService2 greetingService;

    public FactoryBeanController(GreetingService2 greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {

        return greetingService.sayGreeting();
    }
}
