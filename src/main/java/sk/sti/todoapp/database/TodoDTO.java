package sk.sti.todoapp.database;

import java.io.Serializable;

/**
 * @Author filip.stiglic.
 */
public class TodoDTO implements Serializable{

    private String text;

    public TodoDTO(){}

    public TodoDTO(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
