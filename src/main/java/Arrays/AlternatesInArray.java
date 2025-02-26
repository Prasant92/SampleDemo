package Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class AlternatesInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        getAlternatesFunc(arr);
        sc.close();
    }
        
    public static ArrayList<Integer> getAlternatesFunc(int arr[]) {
        ArrayList<Integer> arrlist = new ArrayList<>();
        ArrayList<Integer> arrlist1 = new ArrayList<>();
        for(Integer i:arr) {
            arrlist.add(i);
        }
        int i = 0;
        while(i<arrlist.size()) {
            if(i==0 || i%2==0) {
                arrlist1.add(arrlist.get(i));
            }
            i++;
        }
        System.out.println(arrlist1);
        return arrlist1;
    }
}