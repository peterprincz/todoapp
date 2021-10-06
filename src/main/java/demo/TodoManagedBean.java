package demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@Scope("session")
public class TodoManagedBean implements Serializable {

    private static final Logger log = LoggerFactory.getLogger(TodoManagedBean.class);

    @Inject
    private TodoService todoService;
    private Todo todo;

    @PostConstruct
    void init() {
        todo = todoService.getRandomTodo();
    }

    public void getRandomTodo(){
        log.info("Getting random todo");
        todo = todoService.getRandomTodo();
    }

    public Todo getTodo() {
        return todo;
    }
}
