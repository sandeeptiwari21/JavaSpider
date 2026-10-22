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
    public static void main(String [] args) {
       // demo13.print();
      //  demo13.printreverse();
       // demo13.evennumber();
      //  demo13.oddnumber();
      demo13.sum();
        
    }

}