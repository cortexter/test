package sk.sti.todoapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sk.sti.todoapp.database.Dao.ITodoService;
import sk.sti.todoapp.database.Todo;
import sk.sti.todoapp.database.TodoDTO;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    @Autowired
    ITodoService todoService;

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        Todo todo = todoService.findOne(1L);
        log.info("Todo: "+todo);


        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }

    @GetMapping("/todos")
    public List<Todo> getTodos(){
        return todoService.findAll();
    }

    @PostMapping("/todos")
    public void saveTodo(@RequestBody  TodoDTO todo){
        todoService.saveTodo(new Todo(todo.getText()));
    }


}
