public class HDFC{
       String accountHolderName;
       int pin;
       int Balance;

       void checkBalance(int pin) {
            if(this.pin == pin) {
                System.out.println("Balance = " +Balance);
            }
            else 
            {
                System.out.println("InCorrect Pin");
            }
       }

       void deposit(int pin,int amount) {
           if(this.pin == pin) {
               Balance = Balance +amount;
               System.out.println(amount +   " Deposited");
               System.out.println("Updated balance = "+Balance);
           }
            else 
            {
                System.out.println("incorrect pin");
            }
       }

       void withdrawl(int pin, int amount) {
                if(this.pin == pin) {
                      if(amount <= Balance) {
                          Balance = Balance -amount;
                          System.out.println(amount+  " withdrawl ");
                          System.out.println("Remaining Balance is "+Balance);
                      } 
                      else 
                      {
                        System.out.println("Insufficeint Bank Balance");
                      }
                } 
                else 
                {
                    System.out.println("incorrect pin");
                }
       }

       public static void main(String[] args) {
             HDFC h1 = new HDFC();
               h1.accountHolderName = "sandeep";
               h1.pin = 841435;
               h1.Balance = 55000;

               h1.checkBalance(841435);
               h1.deposit(841435,5000);
               h1.withdrawl(841435 ,50000);

       }
}