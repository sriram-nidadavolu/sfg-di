package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingsService;

public class ConstructorInjectedController {
    GreetingsService greetingsService;
    public ConstructorInjectedController(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String getGreetings(){
        return greetingsService.sayGreeting();
    }
}
