package Arrays;

import java.util.Scanner;

public class PalindromeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        isPerfect(arr);
        sc.close();
    }

    public static boolean isPerfect(int[] arr) {
        boolean res = false;
        int count = 0;
        int[] rev_arr = new int[arr.length];
        for(int i = 0, j = arr.length-1; i<rev_arr.length && j>=0; i++, j--) {
            rev_arr[i] = arr[j];
        }
        for(int i: rev_arr) {
            System.out.print(i + " ");
        }
        for(int i = 0, j = 0; i<rev_arr.length && j<arr.length; i++, j++) {
            if(rev_arr[i] == arr[j]) {
                count++;
            } else {
                res = false;
                break;
            }
        }
        System.out.println("Count is " + count);
        if(count==arr.length) {
            res = true;
        }
        return res;
    }
}
