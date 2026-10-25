public class Fan{
      String brand;
      int speed;

      void fanDetails(){
         System.out.println(brand + " " + speed);
      }
      public static void main(String[] args) {
                 Fan f1 = new Fan();
                 f1.brand = "USha";
                 f1.speed = 9;

                 f1.fanDetails();
      }
}