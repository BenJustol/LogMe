package models;

/**
 * Task creates an object that contains a tasks description, priority, and completion. Task serves as the data type of TODO, 
 * and each task object is treated by its integer value to be its priority. The lower the integer value, the higher the priority.
 * */
public class Task {
    private String description;
    private int priority;
    private boolean completed;
    
    /**
     * Parameterized constructor to initialize Tasks private data. Task contains [description, priority, and completion].
     *
     * @pre description cannot equal to null AND description MUST be a String. priority cannot equal to null AND priority >= 0
     *
     * @param description sets this.description
     *
     * @param priority sets this.priority
     *
     * @post this.description = description AND this.priority = priority AND this.completed = false
     *
     * */
    public Task(String description, int priority)
    {
        this.description = description;
        this.priority = priority;
        this.completed = false;
    }

    public String getDescription()
    {
        return description;
    }

    public int getPriority()
    {
        return priority;
    }

    public boolean isCompleted()
    {
        return completed;
    }

    public void markAsComplete()
    {
        this.completed = true;
    }

    @Override
    public String toString()
    {
        return "[" + description + ", " + completed + ", " + priority + "]";
    }
}
