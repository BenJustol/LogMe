package models;

import java.util.List;

/**
 * DailyLog interface that acts as a parent for TO-DO, Journal, and Secret Journal. Each method must be implemented
 * in each subclass, failure to do so will result in faulty code. Each method are necessary methods that a DailyLog
 * should be able to do.
* */
public interface DailyLog {
    void addTask(String description);
    boolean deleteTask(int index);
    List<Task> getAllTask();
}
