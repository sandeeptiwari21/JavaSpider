//write a program that takes number as input input 1 check area of circle input 2 check square of a nunber input 3 qube of nunber inout 4 exist message
import java.util.Scanner;
public class switchQ5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for area of circle");
        System.out.println("Enter 2 for square of number");
        System.out.println("Enter 3 for qube of number");
        System.out.println("Enter 4 for exist message");
        System.out.println("Enter your choice");
        int choice = sc.nextInt();

        switch(choice) {
            case 1 :
                System.out.println("Enter a radious");
                float r = sc.nextFloat();
                float area = (22/7.0f) * r*r;
                System.out.println(area);
                break;

             case 2 :
                System.out.println("Enter a number");
                int n = sc.nextInt();
                int square = n*n;
                System.out.println(square);
                break;

             case 3 :
                System.out.println("Enter a number");
                int n1 = sc.nextInt();
                int cube = n1*n1*n1;
                System.out.println(cube);
                break;

             case 4 :
                System.out.println("Exit");   
        }
        sc.close();
    }
}