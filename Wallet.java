public class Wallet{
      int balance;
    

      void  addMoney(int amount){ 
           balance = balance + amount;
           System.out.println("Momey Added: " + amount);
          
      }

      void spendMoney(int amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Money Spent :" + amount);
        } else 
        {
            System.out.println("Insufficient Wallet Bakance");
        }
      }

      public static void main(String[] args) {
          Wallet W1 = new Wallet();
            W1.balance = 1500;

            W1.addMoney(200);
            W1.spendMoney(300);
            W1.spendMoney(700);

            System.out.println("Final Balance :" +W1.balance);

      }
}