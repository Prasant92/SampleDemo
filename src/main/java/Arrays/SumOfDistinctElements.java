package Arrays;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SumOfDistinctElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        findSum(arr);
        sc.close();
    }

    static int findSum(int arr[]) {
       int sum = 0;
       Set<Integer> set = new HashSet<Integer>();
       for(Integer i: arr) {
        set.add(i);
       }
       for(Integer i: set) {
        sum = sum + i;
       }
       return sum;
    }
}
