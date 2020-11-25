package guru.springframework.sfgdi._04_bean_factory;

import guru.springframework.sfgdi._04_bean_factory.repository.GreetingRepository;
import guru.springframework.sfgdi._04_bean_factory.service.EnGreetingService;
import guru.springframework.sfgdi._04_bean_factory.service.SpGreetingService;
import guru.springframework.sfgdi._04_bean_factory.service.GeGreetingService;
import guru.springframework.sfgdi._04_bean_factory.service.GreetingService2;

public class GreetingServiceFactory {
    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService2 createGreetingService(String lang) {
        GreetingService2 result;
        lang = lang.toUpperCase();
        switch (lang) {
            case "EN":
                result = new EnGreetingService(greetingRepository);
                break;
            case "SP":
                result = new SpGreetingService(greetingRepository);
                break;
            case "GE":
                result = new GeGreetingService(greetingRepository);
                break;
            default:
                throw new RuntimeException(String.format("Service %s not found", lang));
        }

        return result;
    }
}
