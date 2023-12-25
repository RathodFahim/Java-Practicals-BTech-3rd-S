class Counter implements Runnable {
    private int count;

    public Counter() {
        this.count = 1;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread " + Thread.currentThread().getId() + ": Count " + count);
            count++;
            try {
                // Introducing a short delay for demonstration purposes
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Practical_21_B {
    public static void main(String[] args) {
        // Creating two threads and passing the Counter object to them
        Thread thread1 = new Thread(new Counter());
        Thread thread2 = new Thread(new Counter());

        // Starting the threads
        thread1.start();
        thread2.start();
    }
}
