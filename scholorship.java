public class scholorship{ 
   public static void checkScholorship (int marks, int income) {
          if(marks >=85 && income <= 300000) { System.out.println("Eligible for scholarship");}
          else { System.out.println("Not Eligible for scholorship");}
   }
   public static void main(String[] args) {
          scholorship.checkScholorship(70,250000);
     }
}