package guru.springframework.sfgdi._04_bean_factory.config;

import guru.springframework.sfgdi._02_primary_profile.services.GreetingService;
import guru.springframework.sfgdi._04_bean_factory.GreetingServiceFactory;
import guru.springframework.sfgdi._04_bean_factory.repository.GreetingRepository;
import guru.springframework.sfgdi._04_bean_factory.service.GreetingService2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {
    @Bean
    public GreetingServiceFactory getGreetingServiceFactory(GreetingRepository greetingRepository) {
        return new GreetingServiceFactory(greetingRepository);
    }

    @Bean
    @Profile({"EN", "default"})
    public GreetingService2 getEnGreetingService(GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.createGreetingService("EN");
    }

    @Bean
    @Profile({"SP"})
    public GreetingService2 getSpGreetingService(GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.createGreetingService("SP");
    }

    @Bean
    @Profile({"GE"})
    public GreetingService2 getGeGreetingService(GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.createGreetingService("GE");
    }
}
