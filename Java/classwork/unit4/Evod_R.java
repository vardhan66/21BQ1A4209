//Even Thread 
class Even implements Runnable {
    public void run() {// run method start
        try {
            for (int i = 0; i <= 10; i++) {
                if (i % 2 == 0) {
                    System.out.println("Even:" + i);
                    Thread.sleep(1000);
                }
            }
        } catch (InterruptedException e) {
            System.out.println("Odd interupted");
        } finally {
            System.out.println(" ");
        }
    }// end of run method
}// end of even thread
 // Odd thread

class odd implements Runnable {
    public void run() {// run method start
        try {// try block
            for (int i = 0; i <= 10; i++) {
                if (i % 2 != 0) {
                    System.out.println("odd:" + i);
                    Thread.sleep(1000);
                }
            }
        } catch (InterruptedException e) {
            System.out.println("Odd interupted");
        }

        finally {
            System.out.println(" ");
        }
    }// end of run method
}// end of class

class Test1 {
    public static void main(String[] args) {// main method
        // Object creation
        Runnable n = new Even();
        Runnable m = new odd();
        // passing target to the thread class constructor
        Thread t = new Thread(n);
        Thread t1 = new Thread(m);
        // invoking start methods
        t1.start();
        t.start();
        try {
            System.out.println("Joining.........");
            t.join();
            t1.join();
        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted");
        } finally {
            System.out.println("Thread alive ? \n" + t.isAlive());
            System.out.println("Thread alive ? \n" + t1.isAlive());
        }
    }
}