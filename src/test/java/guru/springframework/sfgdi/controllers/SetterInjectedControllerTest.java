package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi._01_types_of_di.controllers.SetterInjectedController;
import guru.springframework.sfgdi._01_types_of_di.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    private SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new ConstructorGreetingService());
    }

    @Test
    void setGreetingService() {
        System.out.println(controller.getGreeting());
    }
}