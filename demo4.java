public class demo4{
    public static void main(String[] args) {
        int s1 = 1299; int s2=499; int s3= 749; int s4=599;
        int p1=1899; int p2= 999; int p3=2499; int p4=1999;

        int sTotal = s1+s2+s3+s4;
        int pTotal = p1+p2+p3+p4;

        float sDis = (15/100.0f)*sTotal;
        float pDis = (30/100.0f)*pTotal;

        float totalPrice = (sTotal-sDis)+(pTotal-pDis);
        System.out.println("paint = "+ pTotal);
        System.out.println("stotal ="+sTotal);
        System.out.println("total = "+(pTotal+sTotal));
        System.out.println("discount ="+(sDis+pDis));

        System.out.println("total price = " + totalPrice);
    }
}