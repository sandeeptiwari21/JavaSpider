public class Product{
     String name;
     float price;

     void discount(){
        float discount = (20/100f)*price;
        price = price - discount;
       // System.out.println(discount + "discount");
        System.out.println("final price = " +price);
     }
     public static void main(String[] args) {
          Product p1 = new Product();
          p1.name = "Fridge";
          p1.price = 5500;

          p1.discount();
     }
}