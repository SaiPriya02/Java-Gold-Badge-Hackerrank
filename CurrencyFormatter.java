import java.util.*;
import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormatter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        NumberFormat n1 =  NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat n2 =  NumberFormat.getCurrencyInstance(Locale.FRANCE);
        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat n3 =  NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat n4 =  NumberFormat.getCurrencyInstance(Locale.CHINA);
        
        System.out.println("US: " + n1.format(payment));
        System.out.println("India: " + n3.format(payment));
        System.out.println("China: " + n4.format(payment));
        System.out.println("France: " + n2.format(payment));
    }
}