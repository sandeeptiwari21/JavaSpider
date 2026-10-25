import java.util.Scanner;
public class demo13{

    public static void print() {
        int n = 1;
        while (n<=10) {
            System.out.println(n);
            n++;
        }
    }
    public static void printreverse(){
        int n=10;
        while(n >=1){
            System.out.println(n);
            n--;
        }
    }

    public static void evennumber(){
        int n =2;
        while (n <=50 ) {
            if(n%2==0){
            System.out.println(n);}
            n++;
        }
    }
    public static void oddnumber(){
        int n= 2;
        while(n<=50) {
            if(n%2==1) {
                System.out.println(n);
            }
            n++;
        }
    }
    public static void sum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("eneter a number");
        int n = sc.nextInt();
         int i =0;
          int sum=i;
        while(i <=n) {
            sum = sum+i;    
            i++;
        }
       System.out.println(sum);

    }
    public static void mult() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n = sc.nextInt();
        int i =1;
        
        while(i<=10) {
           int prod = n*i;
           System.out.println(n+"X" +i+ "="+prod);
            i++;
        }
        sc.close();
    }

    public static void count(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int count = 0;

        while(n !=0) {
            n = n/10;
            count++;
        }
        System.out.println("Number of digits:=" + count);
    }

    public static void sumDigit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter a number");
        int n = sc.nextInt();

        int sum =0;
        while(n != 0) {
            int digit = n%10;
            sum = sum+digit;
            n = n/10;
        }
        System.out.println("sum of digitc :"+sum);
        sc.close();
    }

    public static void reverse() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        int reverse = 0;

        while( n !=0) {
            int digit = n%10;
            reverse = reverse*10+digit;
            n = n/10;
        }
        System.out.println("Reversed number: "+reverse);
        sc.close();
    }

    public static void PalindromeCheck (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int original = n;
        int reverse = 0;

        while(n != 0) {
             int digit = n%10;
             reverse = reverse*10+digit;
             n = n/10;
        }
        if(original == reverse) {
            System.out.println(original + "  is a Palindrome");
        } else {
            System.out.println(original + "  is not a Palindrome");
        }
    }
    public static void main(String [] args) {
       // demo13.print();
      //  demo13.printreverse();
       // demo13.evennumber();
      //  demo13.oddnumber();
     // demo13.sum();
       // demo13.mult();     
        //  demo13.count();  
         //  demo13.sumDigit();
          // demo13.reverse();
          demo13.PalindromeCheck();
    }
}