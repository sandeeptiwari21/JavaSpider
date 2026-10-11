public class demo{
    public static void main(String[] args) {
          int balance = 75000;
          int amount = 10000;
          System.out.println("Balance before withdrw = "+ balance);
        /*  balance = balance+amount;
         System.out.println("balance after deposit ="+balance);*/
         if(amount <= balance) {
            balance = balance - amount;
            System.out.println("transaction successful");
         }
         else 
         {
            System.out.println("insufficient bank  balance");
         }
       
         System.out.println("balance after withdraw = "+ balance);


    }
}