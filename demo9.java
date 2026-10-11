public class demo9{
    public static void main(String[] args) {
        int balance = 70000;
        int amount = 70000 ;
        Boolean pancard = true ;
        int bankcode  = 1; {
            if(amount <= balance) {
                   if(amount <50000 || pancard == true)
                   {
                    balance =balance-amount;
                    System.out.println("Transaction -Successful"+ " ");
                    if(bankcode ==1) 
                    {
                        if(balance < 10000)
                        {
                            System.out.println("low minimum balance"+"");
                            System.out.println("Deposit"+(10000-balance)+"to maintain min balance");
                        }
                    }
                    else if (bankcode ==2 || bankcode ==4)
                    {
                        if(balance <5000)
                        {
                            System.out.println("low minimum balance"+""+"to maintain min-balance");
                            System.out.println("Deposit"+(5000-balance));
                        }
                    }
                        
                   }
                   else {
                    System.out.println("Link pancard"+"");
                   }
            }
            else {
                System.out.println("Insufficient bank balance");
            }
        }
        
    }
}