import java.util.*;

class Dic1e {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a[] = new int[6];
        Random r = new Random();
        for (int i = 1; i <= 10000; i++) {
            int n = r.nextInt(7);
            int m = r.nextInt(7);
            if (m == n) {
                if (m == 0) {
                    i -= 1;
                } else {
                    a[m - 1]++;
                }

            }
        }
        for (int k = 0; k < a.length; k++) {
            System.out.println("Number of  " + (k + 1) + "," + (k + 1) + " same are : " + a[k]);
        }
    }
}