public class practice{

    public static void showMessage(){
        System.out.println("Hello World");
    }
    public static void displayName(){
        System.out.println("My name is Sandeep Nath Tiwari");
    }
    public static void showNumbers(int n){
         for(int i = 1; i<=n; i++) {
            System.out.println(i);
         }
    }
    public static void square(int a){
        int  quare = a*a;
        System.out.println(quare);
    }
    public static void evenNumber(){
        for(int i=1; i<=20; i++) {
            if(i%2==0){
                System.out.println(i);
            } 
        }
    }
    public static void even(int n){
        for (int i=0; i<=n; i++) {
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
    public static void cube(int a){
        int c = a*a*a;
        System.out.println(c);

    }
    public static void addition(int a , int b){
        int result= a+b;
        System.out.println(result);
    }

    public static void multiplicatioin(int a , int b) {
        int mult= a*b;
        System.out.println(mult);
    }

    public static void displayTable(int n){
        for(int i = 1; i<=10; i++) {
               System.out.println(i*n);
        }
    }
  public static void checkEvenodd(int n) {
    if(n%2 == 0) {
        System.out.println("even number");
    } else {
        System.out.println("odd number");
    }
  }

    public static void maximum(int a , int b) {
        if(a>b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }

    public static void checkPositive(int n){
        if(n>0) {System.out.println("number is positive");}
        if(n<0) {System.out.println("number is negative");}
        if(n==0) {System.out.println("number is zero");}
    }

    public static void factorial(int n) {
        int f=1;
        for ( int i = 1; i<=n; i++) {
            f=f*i;

        }
        System.out.println("factorial = "+f);
    }

    public static void prime(int n) 
    {
    if(n<=1){
        System.out.println("not a prime number");
        return;
    }
     
    for(int i = 2; i<n; i++) {
        if(n % i == 0){
            System.out.println("Not a prime number");
            return;
        } 
    }
    System.out.println("IS a prime number");
        
    }

    public static void reverse(int n) {
        int rev = 0;
        while(n > 0){
            int rem = n%10;
            rev= rev*10+rem;
            n= n/10;
        }
        System.out.println("Reversed number:"+rev);
    }

    public static void countdigit(int n) {
        int count = 0;
        while(n >0) {
            n=n/10;
            count++;
        }
        System.out.println("Total digits:"+count);
    }

    public static int square2(int a){
         return a*a;
    }
    public static int add(int a , int b){
        int sum = a+b;
        return sum;
    }

   public static void main(String[] args) {
 //  int x= practice.square2(5);
 //  System.out.println(x);
  System.out.println(practice.add(20,30));
       // practice.displayName();
      // practice.showNumbers(10);
      //practice.square(10);
     //  practice.evenNumber();
    //  practice.even(20);

   //  practice.cube(10);
    //      practice.addition(20,30 );

  //   practice.multiplicatioin(10,10);
   //  practice.displayTable(5);
     //  practice.checkEvenodd(21);

    // practice.maximum(5,8);
     //practice.checkPositive(5);
    //practice.checkPositive(-5);
    // practice.checkPositive(0);

   //  practice.factorial(5);

   // practice.prime(10);
   //  practice.prime(7);
    //  practice.prime(10);

//  practice.reverse(1234);


   }   
}