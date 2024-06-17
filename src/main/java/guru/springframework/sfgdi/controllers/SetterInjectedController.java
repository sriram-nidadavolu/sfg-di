package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingsService;

public class SetterInjectedController {
    GreetingsService greetingsService;
    public void setGreetingsService(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }
    public String getGreetings(){
        return greetingsService.sayGreeting();
    }
}
