import java.util.Scanner;
public class switchQ2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("Enter opeartor");
        char o = sc.next().charAt(0);

        switch(o) {
              case '+' : 
              int add = a+b;
               System.out.println(add);
               break;

               case '-' :
                int sub = a-b;
                System.out.println(sub);
                break;

                case '*' :
                    int prod = a*b;
                    System.out.println(prod);
                    break;
                case '/' :
                    int div = a/b;
                    System.out.println(div);
                    break;
                default : 
                 System.out.println("Invalid Operation");        
        }
    }
}