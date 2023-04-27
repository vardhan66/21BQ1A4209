import java.lang.Math;

class even implements Runnable {
    int c;

    even(int x) {
        c = x;
    }

    public void run() {
        try {
            System.out.println("Sqare is :" + c * c);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}

class odd implements Runnable {
    int a;

    odd(int y) {
        a = y;
    }

    public void run() {
        try {

            System.out.println("Cube is :" + (a * (a * a)));
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }

    class Test3 {
        public static void main(String[] args) {
            try {
                int a = (int) (1 + Math.random() * 20);
                System.out.println("Generated number" + a);
                if (a % 2 == 0) {
                    Runnable e = new even(a);
                    Thread t = new Thread(e);
                    t.start();
                } else if (a % 2 != 0) {
                    Runnable o = new odd(a);
                    Thread t1 = new Thread(o);
                    t1.start();
                }
                Thread.sleep(1000);
            } catch (InterruptedException e1) {
                System.out.println("Interrupted");
            }

        }
    }
}
