package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxProductOfTwoNosInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        maxProduct(arr);
        sc.close();
    }

    public static int maxProduct(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length-1]*arr[arr.length-2];
    }
}
