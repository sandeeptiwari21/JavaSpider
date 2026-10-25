public class laptop{
    //Attributes
     String brand;
     String model;
     int price;
   //behavior

   void laptopDetails() {
          System.out.println(brand + " " +model + " " + " "+price);
   }

   public static void main(String[] args) {
        laptop l1 = new laptop();
        l1.brand= "HP";
        l1.model= "Pavalion";
        l1.price = 5000;

        laptop l2 = new laptop();
        l2.brand = "Dell";
        l2.model = "sparion";
        l2.price = 45000;

        l1.laptopDetails();
        l2.laptopDetails();
   }

}