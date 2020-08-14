import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public void tables(int n){
            for(int i=1;i<=10;i++)
                System.out.println(n+ " x "+i+" = "+n*i);
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        Solution s=new Solution();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        s.tables(N);
        scanner.close();
    }
}
