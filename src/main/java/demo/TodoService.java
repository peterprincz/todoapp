package demo;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.Collections;
import java.util.List;

@Service
@Transactional
public class TodoService {

    @Inject
    TodoRepository todoRepository;

    @Transactional(readOnly = true)
    public Todo getRandomTodo() {
        List<Todo> all = todoRepository.findAll();
        if(all.size() == 0){
            return new Todo("", "");
        }
        Collections.shuffle(all);
        return all.get(0);
    }
}
