package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxAndMinProductFromArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] arr1 = new int[m];
        int[] arr2 = new int[n];
        for(int i=0;i<m;i++) {
            arr1[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++) {
            arr2[i] = sc.nextInt();
        }
        findMultiplication(arr1, arr2);
        sc.close();
    }

    public static long findMultiplication(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        long res = 0;
        res = arr1[arr1.length-1] * arr2[0];
        return res;
    }
}
