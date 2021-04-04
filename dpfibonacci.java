package hello.src;

import java.util.*;
public class dpfibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(fo(n));
    }
    public static int fo(int n){
        int f[] = new int[n+2];
        int i=0;
        f[0] = 0;
        f[1] = 1;
        for(i =2;i<=n;i++){
            f[i] = f[i-1]+f[i-2];
        }
        return f[n];
    }
    
}
