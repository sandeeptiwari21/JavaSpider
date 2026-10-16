public class functions{ 
     public static boolean ispositive (int n) {
          return n>0;
    }
     public static boolean iseven(int n) {
           return n%2==0;
         }
   public static boolean isdivisibleby3(int n) {
           return   n%3==0;
   }
   public static void main(String [] args) {
        int n =12;
       if(ispositive(n) && iseven(n) && isdivisibleby3(n)) {
            System.out.println("Number satisfies all three conditions");
        } else {
            System.out.println("Number does not satisfy all three conditions");
        }
     }
 }