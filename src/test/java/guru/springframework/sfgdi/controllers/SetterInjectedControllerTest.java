package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingsServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {
    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingsService(new GreetingsServiceImpl());
    }

    @Test
    void getGreetings() {
        System.out.println(this.toString());
        System.out.println(controller.getGreetings());
    }
}