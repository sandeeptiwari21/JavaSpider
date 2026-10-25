import java.util.Scanner;
public class demo14{
    public static void numbers() {
        int i =1;

        do{
            System.out.println(i);
            i++;
        } while(i<=10);

    }
    public static void reverseNumber(){
        int i =50;
        do{
            System.out.println(i);
            i--;
        } while(i>=1);
    }

    public static void multiple() {
        int n=5;
        int i =1;
        do{
            
            System.out.println(n*i);
            i = i+1;
        }while(i<=10);
    }
    public static void multiple5(){
        int i =5;
        do{
            System.out.println(i);
            i=i+5;
        } while(i<=100);
    }
    public static void sum(){
       int n = 5;
       int i = 1;
       int sum =0;

       do{
         sum = sum+i;
         i++;
       } while (i<=n);
       System.out.println("number of sum is"+sum);
    }

    public static void main(String[] args) {
       // demo14.numbers();
         //demo14.reverseNumber();
        // demo14.multiple();
        //demo14.multiple5();
        demo14.sum();
    }
}