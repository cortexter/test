package sk.sti.todoapp.database.Dao;

import sk.sti.todoapp.database.Todo;

import java.util.List;

/**
 * @Author filip.stiglic.
 */
public interface ITodoService {

    List<Todo> findAll();
    Todo findOne(long id);
    void saveTodo(Todo book);
    void delete(long id);

}
