public class Shooping{
      float amount;

      void ShopingCart(){
           if(amount >= 2000) {
              float discount =  (10/100f)*amount;
              amount = amount - discount;
              System.out.println(discount + " disocunt");
              System.out.println(amount + "amount");
           } else {
               System.out.println(amount);
               System.out.println("There is no discount Available");
           }
      }
      public static void main(String[] args) {
          Shooping S1 = new Shooping();
          S1.amount = 1500;
          S1.ShopingCart();
      }
}