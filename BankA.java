public class BankA{
      int pin;
      int balance;

      void checkBalance(int pin) {
            if(this.pin == pin) {
                System.out.println("balance = " + balance);
            }
            else 
            {
                System.out.println("incorrect pin");
            }
      }
        void deposit(int pin ,int amount) {
            if(this.pin == pin) {
                balance = balance + amount;
                System.out.println(amount + "  deposit ");
                System.out.println(balance);
            }
            else 
            {
                System.out.println("Incorrect pin");
            }
        }

        void checkWithdraw(int pin, int amount) {
             if(this.pin == pin) {
                if(amount < balance) {
                balance = balance-amount;
                System.out.println(amount + " Withdrawl Money");
                System.out.println("Current available balance = " + balance);
                } else {System.out.println("Insufficent bank balance");}
             } else {
                System.out.println("Incorrect pin");
             }
        }
        void atm(int pin,int amount) {
            if(this.pin == pin) {
                if(amount < balance && amount%100 == 0) {
                    balance = balance -amount;
                    System.out.println("Withdrawl Succeful");
                    System.out.println("Withdrawl amount = " + amount);
                    System.out.println("Reamaining balance = " + balance);
                } else {
                    System.out.println("Invalid Withdrawl");
                }
            } else {
                System.out.println("Incorrect pin");
            }
        }
      public static void main(String[] args) {
          BankA b1 = new BankA();
          b1.pin = 841435;
          b1.balance = 55000;

        //  b1.checkBalance(841435);
          //b1.deposit(841435,5000);
          //b1.checkWithdraw(841435,50000);
          b1.atm(841435,5000 );
          
      }
}