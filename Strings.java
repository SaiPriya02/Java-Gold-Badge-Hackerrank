import java.util.*;

public class Strings {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        //first find sum of lengths
        int lenA = A.length();
        int lenB= B.length();
        System.out.println(lenA+lenB);
        //now check lexico
        int flag=A.compareTo(B);
        
        if(flag<=0) System.out.println("No");
        else System.out.println("Yes");
        //now caps and print together
       /* A.charAt(0) = A.charAt(0).toUpper();
        B.charAt(0) = B.charAt(0).toUpper(); */
        A=A.substring(0, 1).toUpperCase() + A.substring(1);
        B=B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(A+" "+B);
        sc.close();
    }
}
