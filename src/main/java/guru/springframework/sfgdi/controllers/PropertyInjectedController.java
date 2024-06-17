package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingsService;

public class PropertyInjectedController {
    GreetingsService greetingsService;
    public String getGreetings(){
        return greetingsService.sayGreeting();
    }
}
