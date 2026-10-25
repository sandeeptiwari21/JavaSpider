public class mobile{
     String brand;
     int price;

     void Expensive(){
         if(price >= 30000) { System.out.println("Expensive");} else {System.out.println("Affordable");}
     }
     public static void main(String[] args) {
          mobile m1 = new mobile();
          m1.brand ="Apple";
          m1.price = 20000;

          m1.Expensive();
     }
}