package models;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * TO-DO class implements DailyLog. TO-DO uses a Task object as its data type. The task object contains a tasks
 * description and priority. Each object created of the task will be sorted in the highest priority, allowing user
 * to seek the highest priority task. TO-DO uses a List in order for a user to select a task on their judgment, rather
 * than by priority.
 * */
public class TODO implements DailyLog{

    public TODO()
    {

    }

    @Override
    public void addEntry(String entry) {

    }

    @Override
    public boolean deleteEntry(int index) {
        return false;
    }

    @Override
    public String getEntry(int index) {
        return "";
    }
}
