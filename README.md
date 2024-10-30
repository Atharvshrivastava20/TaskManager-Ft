# **Task Manager Simulation**

## **Overview**

The **Task Manager Simulation** is a Java-based project designed to help users manage their daily tasks by adding, processing, and viewing task history. The simulation uses data structures such as arrays, linked lists, stacks, and queues to efficiently organize tasks based on priority.

---

## **Features**

- **Add New Tasks**: Input tasks with unique IDs, names, and priority levels.
- **Priority-Based Processing**: Processes high-priority tasks first, followed by other tasks in the order they were added.
- **Task History**: Stores completed tasks, displaying the most recent tasks first.
- **Data Management**: Uses arrays, linked lists, queues, and stacks for efficient task handling.

---

## **Project Structure**

- **Task Class**: Defines each task with an ID, name, and priority level.
- **Task Manager**:
  - **Array**: Stores the initial list of tasks.
  - **Queue**: Manages pending tasks in FIFO order.
  - **Stack**: Holds completed tasks in LIFO order.
  - **Linked List**: Handles high-priority tasks (priority 1).

---

## **Requirements**

- **Java Development Kit (JDK)** 1.8 or higher
- **IDE** (e.g., IntelliJ IDEA, Eclipse, or any Java-compatible text editor)

---

## **Installation**

1. **Clone the repository**:
    ```bash
    git clone https://github.com/your-username/task-manager-simulation.git
    ```
2. **Navigate to the project directory** and compile:
    ```bash
    cd task-manager-simulation
    javac TaskManagerSimulation.java
    ```
3. **Run the application**:
    ```bash
    java TaskManagerSimulation
    ```

---

## **Contributing**

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch-name`).
3. Make and commit your changes.
4. Push to the branch and create a Pull Request.

---

## **License & Disclaimer**

This project is licensed under the MIT License. **This code is intended solely for educational use within this project and should not be used for other assignments or academic submissions without permission.**

---

## **Contact**

For any questions or inquiries, please reach out to [your-email@example.com](mailto:your-email@example.com).
