package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AtLeastTwoGreaterElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        findElements(arr);
        sc.close();
    }

    public static long[] findElements(long arr[]) {
        Arrays.sort(arr);
        long[] res = Arrays.copyOfRange(arr, 0, arr.length-2);
        return res;
    }
}
