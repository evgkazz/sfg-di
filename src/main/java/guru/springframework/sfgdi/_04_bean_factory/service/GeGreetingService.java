package guru.springframework.sfgdi._04_bean_factory.service;

import guru.springframework.sfgdi._04_bean_factory.repository.GreetingRepository;

public class GeGreetingService implements GreetingService2 {
    private final GreetingRepository greetingRepository;

    public GeGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getGermanGreeting();
    }
}
