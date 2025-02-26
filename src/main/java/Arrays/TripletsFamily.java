package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TripletsFamily {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        findTriplet(arr);
        sc.close();
    }
    public static boolean findTriplet(int[] arr) {
        boolean res = false;
        Arrays.sort(arr);
        for(int j: arr) {
            System.out.print(j+ " ");
        }
        int i = 0;
        while(i<arr.length-1) {
            int j = 0, tot = 0;
            tot = arr[i] + arr[i+1];
            while(j<arr.length) {
                if(tot == arr[j]) {
                    res = true;
                    break;
                }
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println(res);
        return res;
    }
}
