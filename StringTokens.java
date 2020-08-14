import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\\Z");
        String s = scan.next().trim();
        // Write your code here.
        if(s.length()>0){
            String[] str = s.split("[!,?._'@\\s]+");
            System.out.println(str.length);
            for(String token:str)
                System.out.println(token);
        }
        else
            System.out.println(0);
        scan.close();
    }
} 

