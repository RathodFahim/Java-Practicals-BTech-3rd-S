// Practical_21_A.java

public class Practical_21_A extends Thread {
    // Declare a String variable to represent the task.
    String task;

    Practical_21_A(String task) {
        this.task = task;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(task + " : " + i);
            try {
                Thread.sleep(1000); // Pause the thread execution for 1000 milliseconds.
            } catch (InterruptedException ie) {
                System.out.println(ie.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        // Create two objects to represent two tasks.
        Practical_21_A th1 = new Practical_21_A("Cut the ticket");
        Practical_21_A th2 = new Practical_21_A("Show your seat number");

        // Start the threads using the start method.
        th1.start();
        th2.start();
    }
}
