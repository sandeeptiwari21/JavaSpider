import java.util.Scanner;
public class operation{

     static void circle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a radious value");
        float r = sc.nextFloat();
        float area = (22/7.0f)*r*r;
        System.out.println(area);
     }

      static void triangle(){
          Scanner sc = new Scanner (System.in);
          System.out.println("enetr a base value");
          int b = sc.nextInt();
          System.out.println("Enter a height value");
          int h = sc.nextInt();

          float area = (1/2.0f)* b*h;
          System.out.println(area);
      }

      static void qube(){
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter a value");
           int a = sc.nextInt();
           float area = 6*a*a;
           System.out.println(area);
      }
      static void sylender(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  raduis r:");
        int r = sc.nextInt();
        System.out.println("Enter a height h");
        int h = sc.nextInt();

        float area = 2*(22/7.0f)*r*(r+h);
        System.out.println(area);
      }
    public static void main(String[] args) {
        int input =0;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Eneter 1 for circle");
            System.out.println("Eneter 2 for triangle");
            System.out.println("Eneter 3 for qube");
            System.out.println("Eneter 4 for sylender");
            System.out.println("Eneter 5 for Exit");
          input =sc.nextInt();

          if(input ==1) {
            operation.circle();
          } else  if(input ==2) {
            operation.triangle();
          } else  if(input ==3) {
            operation.qube();
          } else  if(input ==4) {
            operation.sylender();
          } else {
            System.out.println("invalidn input");
          }
        } while(input !=5);
        
    }
}