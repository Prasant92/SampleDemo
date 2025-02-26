package Arrays;

import java.util.Scanner;

public class MultiplyLeftRightArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        multiply(arr);
        sc.close();
    }

    public static int multiply(int[] arr) {
        int res = 0;
        int n = arr.length/2;
        int i = 0;
        int l_arr = 0, r_arr = 0;
        while(i<arr.length) {
            if(i<n) {
                l_arr = l_arr + arr[i];
            } else {
                r_arr = r_arr + arr[i];
            }
            i++;
        }
        res = l_arr * r_arr;
        return res;
    }
}
