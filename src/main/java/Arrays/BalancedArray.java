package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BalancedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(Integer i: arr) {
            al.add(i);
        }
        minValueToBalance(al);
        sc.close();
    }

    public static int minValueToBalance(List<Integer> arr) {
        int res = 0;
        int n = arr.size()/2;
        int i = 0;
        int l_side = 0, r_side = 0;
        while(i<arr.size()) {
            if(i<n) {
                l_side = l_side + arr.get(i);
            } else {
                r_side = r_side + arr.get(i);
            }
            i++;
        }
        if(l_side<r_side) {
            res = r_side - l_side;
        } else if(l_side>r_side) {
            res = l_side - r_side;
        } else if(l_side == r_side) {
            res = 0;
        }
        return res;
    }
}
