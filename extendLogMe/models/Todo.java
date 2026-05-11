package models;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * TO-DO class implements DailyLog. TO-DO uses a Task object as its data type. The task object contains a tasks
 * description and priority. Each object created of the task will be sorted in the highest priority, allowing user
 * to seek the highest priority task. TO-DO uses a List in order for a user to select a task on their judgment, rather
 * than by priority.
 * */
public class Todo implements DailyLog{
    private final List<Task> listOfTasks;

    /**
     * Default constructor that initializes a new list of task
     *
     * @post listOfTasks = #listOfTasks
     * */
    public Todo()
    {
        listOfTasks = new ArrayList<>();
    }

    /**
     * Adds a new Task into a ArrayList of Task, takes in String as param.
     * Defaults the priority to 0 AND sorts the task after added to the list
     *
     *
     * @pre entry != null
     *
     * @post listOfTask = new Task(entry, 0) AND listOfTask.sort()
     * */
    @Override
    public void addTask(String description)
    {
        listOfTasks.add(new Task(description));
        sort();
    }

    /**
     * Deletes a task from the ArrayList at the specified index in the list
     *
     * @param index position of task to be deleted in the list
     *
     * @return a boolean value if successful removal of a task in a list
     *
     * @throws IllegalArgumentException if index < 0 OR index >= listOfTask.size()
     *
     * @post result == true AND listOfTasks.size() == old(listOfTask.size()) - 1
     * */
    @Override
    public boolean deleteTask(Task task)
    {
        return listOfTasks.remove(task);
    }

    /**
     * Method to return a task private data as a String
     *
     * @param index of a task to delete in the list of Task
     *
     * @return String representation of a task data by calling the task toString function
     *
     * @pre index >= 0 AND index != null
     *
     * @post listOfTasks = #listOfTasks AND validateEntry(index) == true, return String representation of task
     * */
    @Override
    public List<Task> getAllTask()
    {
        return new ArrayList<>(listOfTasks);
    }

    /**
     * Method to updatePriority of a task based on its taskId
     *
     * @param taskId to find the value of a task in the list
     *
     * @param newPriority the value to update old(tasks.priority)
     *
     * @pre taskID >= 0 AND taskID != null. newPriority >= 0 AND newPriorty != null
     *
     * @post listOfTask = #listOfTask AND IFF taskId ! throw IllegalArguement Exception,
     * old(datum.priority) = new(datum.priority). Sort() task in order
     * */
    public void updatePriority(int taskId, int newPriority) throws IllegalArgumentException
    {
       for(Task task : listOfTasks)
       {
           if(task.getId() == taskId)
           {
               task.setPriority(newPriority);
               sort();
               return;
           }
       }
       throw new IllegalArgumentException("TaskID: " + taskId + " DNE");
    }

    /**
     * Sorts the listOfTask by completion AND priority
     *
     * @post listOfTasks becomes sors
     * */
    private void sort()
    {
        listOfTasks.sort(Comparator.comparing(Task::isCompleted).thenComparingInt(Task::getPriority));
    }

    @Override
    public String toString()
    {
        StringBuilder outString = new StringBuilder();
        for(Task task : listOfTasks)
        {
            outString.append(task.getDescription()).append(" ").append(task.getPriority()).append("\n");
        }
        return outString.toString();
    }
}
