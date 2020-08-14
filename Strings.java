import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int lenA = A.length();
        int lenB= B.length();
        System.out.println(lenA+lenB);
        //now check lexico
        int flag=0;
        if (lenA>lenB){
            for(int i =0;i<lenA;i++){
                if(A[i]<B[i]){
                    flag=1;
                    break;
                }
                else if(i==lenB)
                    break;
            }
        }
        else{
            for(int i =0;i<lenB;i++){
                if(A[i]<B[i]){
                    flag=1;
                    break;
                }
                else if(i==lenA)
                    break;
            }
        }
        if(flag==0) System.out.println("Yes");
        else System.out.println("No");
        //now caps and print together
        A[0] = A[0].toUpper();
        B[0] = B[0].toUpper();
        System.out.println(A+" "+B);
        
    }
}



