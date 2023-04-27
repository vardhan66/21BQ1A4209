
//To perform mergesort
import java.util.*;

class mergesort {
    public static int swapcount = 0;

    public static void main(String[] args) {
        int[] a = new int[20];// integer array of length 20
        // creating an object to scanner class
        Scanner s = new Scanner(System.in);
        int n;// n is for size of the array
        System.out.println("enter n value");// Prompt
        n = s.nextInt();// reading integer input
        System.out.println("enter the array elements");
        for (int i = 0; i < n; i++)// using for loop to append the elements in an array
            a[i] = s.nextInt();
        mergeSort(a, 0, n - 1);// mergeSort(array,low,high)
        System.out.println("elements after sorting are");
        // to display sorted elements
        for (int i = 0; i < n; i++)
            System.out.println(a[i]);
        System.out.println("The swapzz are:" + (swapcount));
    }

    static void mergeSort(int a[], int first, int last) {
        int mid;
        if (first < last) {
            mid = (first + last) / 2;
            // dividing the list using recursive calls
            mergeSort(a, first, mid);
            mergeSort(a, mid + 1, last);
            merge(a, first, mid, last);

        }
    }

    static void merge(int a[], int first, int mid, int last) {
        int[] b = new int[20];// creating a temporary array
        int i = first;
        int j = mid + 1;
        int k = first;
        while (i <= mid && j <= last) {// checking the condition to merge
            if (a[i] <= a[j]) {
                b[k] = a[i];
                i++;

            } else {
                b[k] = a[j];
                j++;

            }
            k++;
        }
        while (i <= mid)// incrementing the index value of the temporary array
            b[k++] = a[i++];
        while (j <= last)
            b[k++] = a[j++];// incrementing the index value of the temporary array
        for (i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                swapcount++;
            }
        }
        for (i = first; i <= last; i++)
            a[i] = b[i];// assigning temporary array elements to originl array

    }

}
