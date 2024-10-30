import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.*;

public class TaskManager {
    private Task[] tasksArray;
    private Queue<Task> taskQueue;
    private Stack<Task> completedTasksStack;
    private LinkedList<Task> highPriorityTasksList;

    public TaskManager(int numTasks) {
        tasksArray = new Task[numTasks];

        taskQueue = new LinkedList<>();

        completedTasksStack = new Stack<>();

        highPriorityTasksList = new LinkedList<>();
    }


    public void addTasks(Scanner scanner) {      // Method to add tasks based on user input
        for (int i = 0; i < tasksArray.length; i++) {

            System.out.println("Enter Task " + (i + 1) + " details:");
            System.out.print("ID: ");
            int id = scanner.nextInt();

            scanner.nextLine();
            System.out.print("Name: ");

            String name = scanner.nextLine();
            System.out.print("Priority (1-5): ");
            int priority = scanner.nextInt();

            Task task = new Task(id, name, priority);
            tasksArray[i] = task;


            if (priority == 1) {    // Enqueue tasks based on priority
                highPriorityTasksList.add(task);  // Priority 1 tasks go to the linked list
            } else {
                taskQueue.add(task);
            }
        }
    }


    public void processTasks() {        // Method to process tasks
        System.out.println("\nTasks are being processed...");


        while (!highPriorityTasksList.isEmpty()) {  //processing priority tasks
            Task task = highPriorityTasksList.removeFirst();
            System.out.println("Processed Task: " + task.name);
            completedTasksStack.push(task);  // Pushing to completed stack
        }


        while (!taskQueue.isEmpty()) {      //processing other tasks
            Task task = taskQueue.poll();
            System.out.println("Processed Task: " + task.name);
            completedTasksStack.push(task);  // Pushing to the completed stack
        }
    }


    public void displayTaskHistory() {      // display the task history from the completed stack
        System.out.println("\nTask History (Most Recent First):");
        while (!completedTasksStack.isEmpty()) {
            Task task = completedTasksStack.pop();
            System.out.println(task.name);
        }
    }

    public void displayAllTasks() {         //displaying tasks
        System.out.println("\nAll Tasks:");
        for (Task task : tasksArray) {
            task.printTaskDetails();
        }
    }
}
