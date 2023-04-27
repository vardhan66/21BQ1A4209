class Q {
    int n;
    boolean val = false;

    synchronized int get() {
        while (!val)
            try {
                Thread.sleep(1000);
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interrupted" + e);
            }
        System.out.println("got:" + n);
        val = false;
        notify();
        return n;
    }

    synchronized void put(int n) {
        while (val)
            try {
                Thread.sleep(1000);
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interrupted" + e);
            }
        this.n = n;
        val = true;
        System.out.println("put:" + n);
        notify();
    }
}

class Producer implements Runnable {
    Q q;

    Producer(Q q) {
        this.q = q;
        new Thread(this, "Producer").start();
    }
+

    public void run() {
        int i = 0;
        while (true) {
            q.put(i++);
        }
    }
}

class Consumer implements Runnable {
    Q q;

    Consumer(Q q) {
        this.q = q;
        new Thread(this, "Consumer").start();
    }

    public void run() {
        while (true) {
            q.get();
        }
    }
}

public class Main {
    public static void main(String args[]) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
        System.out.println("press control c to stop");
    }
}
