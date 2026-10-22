//write a code to find given number is positive or neagative using switch case

import java.util.Scanner;
public class switchQ4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

      switch( (n>0) ? "positive" : n<0 ? "negative" : "zero" ) {
          case "positive":
            System.out.println("postive number");
            break;
          case "negative":
            System.out.println("Negative number");   
            break;
          case "zero" :
          System.out.println("zero number");  
          break;
      }
      sc.close();
    }
}