import java.util.*;
public class Loops {
    public void tables(int n){
            for(int i=1;i<=10;i++)
                System.out.println(n+ " x "+i+" = "+n*i);
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        Loops s=new Loops();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        s.tables(N);
        scanner.close();
    }
}
