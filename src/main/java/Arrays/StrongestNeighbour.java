package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class StrongestNeighbour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        maximumAdjacent(n, arr);
        sc.close();
    }

    static void maximumAdjacent(int sizeOfArray, int arr[]){
        ArrayList<Integer> al = new ArrayList<Integer>(sizeOfArray-1);
        int i = 0;
        while(i<arr.length-1) {
            if(arr[i] > arr[i+1]) {
                al.add(arr[i]);
            } else if(arr[i] < arr[i+1]) {
                al.add(arr[i+1]);
            } else if(arr[i] == arr[i+1]) {
                al.add(arr[i+1]);
            }
            i++;
        }
        for(Integer j: al) {
            System.out.print(j+ " ");
        }
    }
}
