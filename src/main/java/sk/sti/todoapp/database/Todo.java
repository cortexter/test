package sk.sti.todoapp.database;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @Author filip.stiglic.
 */
@Entity
public class Todo extends BasicEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TODO_SEQ")
    @SequenceGenerator(name = "TODO_SEQ", sequenceName = "TODO_SEQ", allocationSize = 1)
    private long id = -1;

    @Column(length = 255, nullable = false)
    @NotNull
    private String text;

    public Todo(){}

    public Todo(String text) {
        this.text = text;
        this.dateInsert = new Date();
    }

    @Override
    public long getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    @Override
    public Class<? extends Persistent> getRealClass() {
        return Todo.class;
    }

    @Override
    public String toString() {
        return "Todo{" +
            "id=" + id +
            ", text='" + text + '\'' +
            '}';
    }
}
