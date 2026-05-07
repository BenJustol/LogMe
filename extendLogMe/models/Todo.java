package models;
import java.util.ArrayList;
import java.util.Comparator;

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

    /**
     * Method to addEntry into a ArrayList of Task, takes in String
     * */
    @Override
    public void addEntry(String entry)
    {
        Task task = new Task(entry, 0);
        listOfTasks.add(task);
        sort();
    }

    @Override
    public boolean deleteEntry(int index) throws IllegalArgumentException
    {
        if(index < 0 || index >= listOfTasks.size())
            throw new IllegalArgumentException("Invalid index");
        listOfTasks.remove(index);
        return true;
    }

    @Override
    public String getEntry(int index) throws IllegalArgumentException
    {
        if(index < 0 || index >= listOfTasks.size())
            throw new IllegalArgumentException("Invalid index");
        return listOfTasks.get(index).toString();
    }

    public void updatePriority(int taskId, int newPriority) throws IllegalArgumentException
    {
       for(Task datum : listOfTasks)
       {
           if(datum.getId() == taskId)
           {
               datum.setPriority(newPriority);
               sort();
               return;
           }
       }
       throw new IllegalArgumentException("TaskID: " + taskId + " DNE");
    }

    public void sort()
    {
        listOfTasks.sort(Comparator.comparing(Task::isCompleted).thenComparingInt(Task::getPriority));
    }
}
