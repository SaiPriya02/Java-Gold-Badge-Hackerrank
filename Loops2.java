import java.util.*;
import java.io.*;
import java.lang.Math;

class Solution{

    public void func(int a,int b,int n){
        int sum=a;
        for(int i=0; i<n;i++){
            sum+=(int)(Math.pow(2,i)*b);
            System.out.print(sum+ " ");
        }
        System.out.println();
    }
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        Solution s = new Solution();
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            s.func(a,b,n);
        }
        in.close();
    }
}
