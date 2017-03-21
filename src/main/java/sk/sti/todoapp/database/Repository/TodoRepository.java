package sk.sti.todoapp.database.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sk.sti.todoapp.database.Todo;
import org.springframework.data.repository.CrudRepository;

/**
 * @Author filip.stiglic.
 */

public interface TodoRepository extends JpaRepository<Todo,Long> {

}

