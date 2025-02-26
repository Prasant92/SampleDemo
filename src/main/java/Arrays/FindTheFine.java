package Arrays;

import java.util.Scanner;

public class FindTheFine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] car = new int[n];
        int[] fine = new int[n];
        for(int i=0;i<n;i++) {
            car[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++) {
            fine[i] = sc.nextInt();
        }
        int date = sc.nextInt();
        totalFine(date, car, fine);
        sc.close();
    }

    public static long totalFine(int date, int car[], int fine[]) {
        long res = 0;
        if(date%2==0) {
            for(int i=0, j=0;i<car.length && j<fine.length; i++, j++) {
                if(car[i]%2!=0) {
                    res = res + fine[i];
                }
            }
        } else if(date%2!=0) {
            for(int i=0, j=0;i<car.length && j<fine.length; i++, j++) {
                if(car[i]%2==0) {
                    res = res + fine[i];
                }
            }
        }
        return res;
    }
}
