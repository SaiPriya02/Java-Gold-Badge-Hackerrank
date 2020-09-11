import java.util.*;

public class StringReverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int n = A.length(), flag=0;
        /* Enter your code here. Print output to STDOUT. */
        for(int i=0;i<n;i++){
            if(A.charAt(i)!=A.charAt(n-i-1)){
                flag=1;
                break;
            }
        }
        if(flag==1)
            System.out.println("No");
        else System.out.println("Yes");
        sc.close();
    }
}