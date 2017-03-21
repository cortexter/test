package sk.sti.todoapp.database;

import java.util.Date;

public interface IEntityChange {

    Date getDateInsert();

    Date getDateUpdate();

}