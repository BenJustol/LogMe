package models;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 * TO-DO class implements DailyLog. TO-DO uses a Task object as its data type. The task object contains a tasks
 * description and priority. Each object created of the task will be sorted in the highest priority, allowing user
 * to seek the highest priority task. TO-DO uses a List in order for a user to select a task on their judgment, rather
 * than by priority.
 * */
public class Todo implements DailyLog{
    private final ArrayList<Task> listOfTasks;

    public Todo()
    {
        listOfTasks = new ArrayList<>();
    }


    @Override
    public void addEntry(String entry)
    {
        Task task = new Task(entry, 0);
    }

    @Override
    public boolean deleteEntry(int index)
    {
        return listOfTasks.remove(listOfTasks.get(index));
    }

    @Override
    public String getEntry(int index) throws IllegalArgumentException
    {
        return listOfTasks.get(index).toString();
    }

    public void updatePriority(int taskId, int newPriority)
    {
        for(Task datum : listOfTasks)
        {
            if(datum.getId() == taskId)
            {
                datum.setPriority(newPriority) ;
            }
        }
        sort();
    }

    public void sort()
    {
        listOfTasks.sort(Comparator.comparing(Task::isCompleted).thenComparingInt(Task::getPriority));
    }

}
