package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ElementsInTheRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int A = sc.nextInt();
        int B = sc.nextInt();
        check_elements(arr, n, A, B);
        sc.close();
    }

    static boolean check_elements(int arr[], int n, int A, int B) {
        boolean res = false;
        Arrays.sort(arr);
        int[] arr_cmp = new int[B-A+1];
        int num = A;
        for(int i = 0; i<arr_cmp.length && num<=B; i++) {
            arr_cmp[i] = num;
            num++;
        }
        for(int x: arr_cmp) {
            System.out.print(x+" ");
        }
        int count = 0;
        int i = 0;
        while(i<arr_cmp.length) {
            int j = 0;
            while(j<arr.length) {
                if(arr_cmp[i]==arr[j]) {
                    count++;
                    break;
                }
                j++;
            }
            i++;
        }
        System.out.println("Count is " + count);
        if(count>=arr_cmp.length) {
            res = true;
        }
        return res;
    }
}
