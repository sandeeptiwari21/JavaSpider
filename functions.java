public class functions{ 
     public static boolean ispositive (int n) {
         if(n>0) { return n;} 
    }
     public static boolean iseven(int ispositive) {
           if(n%2 == 0) { return n;}
         }
   public static boolean isdivisibleby3(int n) {
       if(n % 3 == 0) { return n;}
   }
   public static void main(String [] args) {
   int n =12;
       if (isPositive(n) && isEven(n) && isDivisibleBy3(n)) {
            System.out.println("Number satisfies all three conditions");
        } else {
            System.out.println("Number does not satisfy all three conditions");
        }
     }
 }