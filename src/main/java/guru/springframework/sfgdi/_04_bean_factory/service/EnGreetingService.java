package guru.springframework.sfgdi._04_bean_factory.service;

import guru.springframework.sfgdi._04_bean_factory.repository.GreetingRepository;

public class EnGreetingService implements GreetingService2 {
    private final GreetingRepository greetingRepository;

    public EnGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getEnglishGreeting();
    }
}
