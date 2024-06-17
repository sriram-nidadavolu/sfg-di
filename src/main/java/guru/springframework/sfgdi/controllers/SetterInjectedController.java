package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    GreetingsService greetingsService;
    @Autowired
    public void setGreetingsService(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }
    public String getGreetings(){
        return greetingsService.sayGreeting();
    }
}
