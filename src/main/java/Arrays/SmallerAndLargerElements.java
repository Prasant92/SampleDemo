package Arrays;
import java.util.Scanner;

public class SmallerAndLargerElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        getMoreAndLess(arr, target);
        sc.close();
    }

    static int[] getMoreAndLess(int[] arr, int target) {
        int[] res = new int[2];
        int i = 0;
        int min = 0, max = 0;
        while(i<arr.length) {
            if(arr[i]<=target) {
                min++;
            } else {
                max++;
            }
            i++;
        }
        res[0] = min;
        res[1] = max;
        return res;
    }
}
