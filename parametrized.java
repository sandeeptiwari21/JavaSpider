 class parameterized{ 
    public static int squarenumber(int n) {
       return n*n;
    }  
    public static void checkEvenOdd(int n) {
    if ( n% 2==0) { System.out.println("even number");} 
   else { System.out.println("odd Number");}
   
   }
   public static void MaximumNumber(int a , int b) {
       if ( a> b) { System.out.println(a) ;} 
      else { System.out.println(b);}
     }

   public static void primenumber(int n) {
       if (n <=1) { System.out.println("not a prime number"); return;}
   for (int i = 2; i<n; i++) {
       if(n%i==0) {
       System.out.println(n+"is not prime");
   return;
      }
    }
     System.out.println(n+ " is prime");
       
   }
    
  public static void main (String [] args) {

   System.out.println("Square: " + squarenumber(5));

        checkEvenOdd(8);

         MaximumNumber(10, 20);

        primenumber(7);

  }
}