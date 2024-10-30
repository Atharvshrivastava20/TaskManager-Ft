public class Task {
    int id;
    String name;
    int priority;


    public Task(int id, String name, int priority) { // Constructors
        this.id = id;
        this.name = name;
        this.priority = priority;
    }


    public void printTaskDetails() {        //printing task details
        System.out.println("ID: " + id + ", Name: " + name + ", Priority: " + priority);
    }

}
