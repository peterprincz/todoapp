package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class InitDataLoader  implements ApplicationRunner {

    @Autowired
    private TodoRepository todoRepository;

    public void run(ApplicationArguments args) {
        todoRepository.save(new Todo( "Kivinni a szemetet", "Holnap vendégek jönnek, ki kéne vinni a szemetet"));
        todoRepository.save(new Todo( "Elmenni bevásárolni", "Valami finomat akarok ma főzni"));
        todoRepository.save(new Todo( "Kiteregetni a ruhákat", "Reggel mosást inditottam, ki kéne teregetni a ruhákat"));
        todoRepository.save(new Todo( "Megetetni a cicát", "Biztos éhes már"));
    }
}