package models;

/**
 * Task creates an object that contains a tasks description, priority, and completion. Task serves as the data type of TODO, 
 * and each task object is treated by its integer value to be its priority. The lower the integer value, the higher the priority.
 * */
public class Task {
    private static int nextId = 1;
    private final int id;
    private final String description;
    private int priority;
    private boolean completed;
    
    /**
     * Parameterized constructor to initialize Tasks private data. Task contains [description, priority, and completion].
     *
     * @pre description cannot equal to null AND description MUST be a String. priority cannot equal to null AND priority >= 0
     *
     * @param description sets this.description
     *
     *
     * @post this.description = description AND this.priority = priority AND this.completed = false
     *
     * */
    public Task(String description)
    {
        this.description = description;
        this.priority = 0;
        this.id = nextId++;
        this.completed = false;
    }

    /**
     * Gets the description of the Task object
     *
     * @return the description in a string form
     *
     * @post returns the value of this Objects description
     * */
    public String getDescription()
    {
        return description;
    }


    /**
     * Gets the priority of the Task object
     *
     * @return the priority in int value
     *
     * @post returns the value of this Objects priority
     * */
    public int getPriority()
    {
        return priority;
    }

    /**
     * Gets the boolean value of this object, to determine if this Object task is completed
     *
     * @return the value of completion in boolean form
     *
     * @post returns the value of this Objects completion
     * */
    public boolean isCompleted()
    {
        return completed;
    }

    /**
     * Marks the object as complete by assigning the value true to this object completed var
     *
     * @post completed = true AND description = #description AND priority = #priority
     * */
    public void markAsComplete()
    {
        this.completed = true;
    }

    /**
     * Function to return the unique identifier of a Task object
     *
     * @return int value of id
     *
     * @post returns unique int value of an objects id
     * */
    public int getId()
    {
        return id;
    }

    /**
     * Setter for a Task objects priority
     *
     * @param newPriority int value to set as the objects new priority val
     *
     * @pre newPriority >= 0 AND newPriority != NULL
     *
     * @post priority = newPriority AND description = #description AND completed = #completed
     * */
    public void setPriority(int newPriority)
    {
        this.priority = newPriority;
    }

    /**
     * Overrides the toString function to represent the Objects private data
     *
     * @return the String representation of the Objects data
     *
     * @post returns the String representation of the Objects data in form [description, completed, priority]
     * */
    @Override
    public String toString()
    {
        return "[" + description + ", " + completed + ", " + priority + "]";
    }
}
