public class movie{
      float price;
      int age;

      void calculateTicket(){
           if (age < 12) {
               float discount = (50/100f)*price;
               price = price -discount;
               System.out.println("Discount = :" + discount);
               System.out.println("Price for kids =:" + price);
           } else if (age >= 60) {
                float discount = (30/100f)*price;
                price = price -discount;
                System.out.println("Discount = :" +discount);
                System.out.println("Price for older =:" +price);
           }  else {
              System.out.println("No Discount");
              System.out.println("Give Original Price :" + price);
           }
      }
      public static void main(String[] args) {
            movie m1 = new movie();
            m1.price = 1500;
            m1.age =10;
            m1.calculateTicket();
      }
}