public class Electricity{
      int bill;
      int units;

      void CheckBill(){
           if(units <= 100) {
            System.out.println("Bill = " + (units*5));
           } else {
              bill = 500+(units -100)*8;
              System.out.println("Bill = " +bill);
           }
      }
      public static void main(String[] args) {
        Electricity E1 = new Electricity();
            E1.units = 50;
            E1.CheckBill();
      }
}