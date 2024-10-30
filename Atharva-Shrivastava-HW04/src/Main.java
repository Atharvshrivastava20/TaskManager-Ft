/**
 * File: Atharva-Shrivastava-HW04
 * By: Atharva Shrivastava
 * Date: 10/30/2024 (Last revised)
 *
 * Descryption: This is a java program that simulates a task manager using different
 * types of data structures. This Task Manager Simulation helps users manage their
 * daily tasks effectively.The system will allow users to add tasks, process tasks (based on
 * priority), and view their task history. The task manager will use an array, a linked list, a stack,
 * and a queue to manage different parts of the simulation.
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of tasks: "); //Getting number of tasks
        int numTasks = scanner.nextInt();
        TaskManager taskManager = new TaskManager(numTasks);


        taskManager.addTasks(scanner); //adding tasks from userInput


        taskManager.displayAllTasks(); //displaying tasks


        taskManager.processTasks(); //processing tasks
        taskManager.displayTaskHistory(); // task history

        scanner.close();
    }
}