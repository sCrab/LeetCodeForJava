package 笔试;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main s = new Main();
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] vals = new int[n];
        for (int i = 0; i < n; i++) {
            vals[i] = sc.nextInt();
        }

    }
    private int change(int x,int length,int[] v) {
//        if (x==1) return 1;
//        if (x==0) return 0;
//        if (i==1) return x;
//        return min(change(x,i-1,length,v),x/v[i]+change(x%v[i],vmax(x,v,length),length,v));
        int count = 0;
        int i;
        while (x > 0) {
            i = vmax(x, v, length);
            count += x / v[i];
            x = x % v[i];
        }
        return count;
    }

    int min(int a, int b) {
        return a<b?a:b;
    }
    private int vmax(int x, int v[], int length){
        int i = 0;
        while ((x >= v[i]) && (i < length)) {
            i++;
        }
        return i-1;
    }

}
