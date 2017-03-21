package sk.sti.todoapp.database;

public interface Persistent {

    long getId();

    Class<? extends Persistent> getRealClass();

    boolean isPersisted();
}
