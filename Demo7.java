public class Demo7{
    public static void main(String [] args) {
        int balance = 75000;
        int amount = 65000;
        boolean pancard= true;
        if(amount < 50000 || pancard == true) {
            balance = balance+amount;
            System.out.println("transaction successful" + " ");
        } 
        else {
            System.out.println("Link Pancard"+ "");
        }
    }
}