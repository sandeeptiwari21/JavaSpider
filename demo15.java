//find the give number to minimu and maximum number
import java.util.*;
public class demo15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();

        int max =0;
        int min = 9;

        while (number != 0) {
            int digit = number % 10;

            if(digit > max) {
                max = digit;
            }
            if(digit < min) {
                min = digit;
            }

            number = number/10;
        }
         System.out.println("Maximum number is "+max);
         System.out.println("Minimum Number is "+min);
         sc.close();
        
    }
}
