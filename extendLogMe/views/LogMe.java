import models.Task;

public class LogMe {
    public static void main(String[] args)
    {
        System.out.println("Hello, Welcome to LogMe");

        Task task = new Task("Dishes", 1);
        System.out.println(task.toString());
    }
}
