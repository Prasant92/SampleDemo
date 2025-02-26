package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SwapKthElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> al = new ArrayList<Integer>(n);
        for(int i: arr) {
            al.add(i);
        }
        int k = sc.nextInt();
        swapKth(al, k);
        sc.close();
    }

    public static void swapKth(List<Integer> arr, int k) {
        int i = arr.get(k-1);
        int j = arr.get(arr.size()-k);
        System.out.println("Before swapping" + i + " " + j);
        i = i+j;
        j = i-j;
        i = i-j;
        System.out.println("After swapping" + i + " " + j);
        arr.set(k-1, i);
        arr.set(arr.size()-k, j);
        System.out.println(arr);
    }
}
