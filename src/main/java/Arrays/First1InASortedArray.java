package Arrays;

import java.util.Scanner;

public class First1InASortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        firstIndex(arr);
        sc.close();
    }

    public static long firstIndex(int arr[]) {
        int ind = 0;
        long res = -1;
        while(ind<arr.length) {
            if(arr[ind]==1) {
                res = ind;
                break;
            }
            ind++;
        }
        return res;
    }
}
