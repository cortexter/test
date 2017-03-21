package sk.sti.todoapp.database.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sk.sti.todoapp.database.Repository.TodoRepository;
import sk.sti.todoapp.database.Todo;

import java.util.List;

/**
 * @Author filip.stiglic.
 */


@Service
public class TodoService implements ITodoService{

    @Autowired
    TodoRepository todoRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Todo> findAll() {
        return todoRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Todo findOne(long id) {
        return todoRepository.findOne(id);
    }

    @Override
    @Transactional
    public void saveTodo(Todo todo) {
        todoRepository.save(todo);
    }

    @Override
    @Transactional
    public void delete(long id) {
        todoRepository.delete(id);
    }
}
