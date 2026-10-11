
public class demo12 {
    public static void main(String[] args) {
        int s1 = 599, s2 = 899, s3 = 499, s4 = 1299;
        int p1 = 1299, p2 = 1999, p3 = 1899, p4 = 2399;

        int sTotal = s1 + s2 + s3 + s4;
        int pTotal = p1 + p2 + p3 + p4;

        int count = 0;
        float shirtDis = (15.0f / 100) * sTotal;
        float paintDis = (15.0f / 100) * pTotal;

        float extraDis = 0;
        float total;
        float grandTotal;

        if (sTotal >= 3000) {
            shirtDis = (30.0f / 100) * sTotal;
            count = count + 1;
        }

        if (pTotal >= 4000) {
            paintDis = (20.0f / 100) * pTotal;
            count = count + 1;
        }

        total = (sTotal - shirtDis) + (pTotal - paintDis);
        grandTotal = total;

        if (count == 2) {
            extraDis = (5.0f / 100) * (sTotal + pTotal);
            grandTotal = total - extraDis;
        }

        System.out.println("Shirt Total = " + sTotal);
        System.out.println("Pant Total = " + pTotal);
        System.out.println("Shirt Discount = " + shirtDis);
        System.out.println("Pant Discount = " + paintDis);
        System.out.println("Total After Discounts = " + total);
        System.out.println("Extra Discount = " + extraDis);
        System.out.println("Grand Total = " + grandTotal);
    }
}