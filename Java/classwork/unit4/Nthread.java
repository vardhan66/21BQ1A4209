//Creating a Thread using Runnnable
class NewThread implements Runnable {
    Thread t;

    NewThread() {
        // Create a new, second thread
        t = new Thread(this, "Demo Thread");
        System.out.println("Child thread: " + t);
        t.start(); // Start the thread
    }

    // This is the entry point for the second thread.
    public void run() {
        try {// try block
            for (int i = 11; i <= 20; i++) {
                System.out.println("Child Thread: " + i);
                Thread.sleep(3000);// sleep method
            }
            // catch block to catch the Interrrupted Exception
        } catch (InterruptedException e) {
            System.out.println("Child interrupted.");
        }

        System.out.println("Exiting child thread.");
    }
}// end of classs

class ThreadDemo {
    public static void main(String args[]) {// Main thread
        new NewThread(); // create a new thread
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Main Thread: " + i);
                Thread.sleep(4000);
            }
            // catch block to catch the Interrrupted Exception
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Main thread exiting.");
    }// end of main method
}// end of class