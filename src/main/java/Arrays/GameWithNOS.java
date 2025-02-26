package Arrays;

import java.util.Scanner;

public class GameWithNOS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        game_with_number(arr, n);
        sc.close();
    }

    public static int[] game_with_number(int arr[], int n) {
        int[] res = new int[n];
        int i = 0;
        while(i<=n-1) {
            if(i<n-1) {
                res[i] = (Integer.valueOf(arr[i])^Integer.valueOf(arr[i+1]));
            }
            else if(i == n-1) {
                res[i] = arr[i];
            }
            i++;
        }
        for(int j:res) {
            System.out.print(j+" ");
        }
        return res;
    }
}
