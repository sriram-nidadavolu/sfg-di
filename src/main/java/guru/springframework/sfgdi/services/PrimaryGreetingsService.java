package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingsService implements GreetingsService {
    @Override
    public String sayGreeting() {
        return "Hello World! - From the Primary Bean";
    }
}
