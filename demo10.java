
public class demo10 {
    public static void main(String[] args) {
        int s1 = 750, s2 = 850, s3 = 950, s4 = 1050;
        int p1 = 550, p2 = 650, p3 = 800, p4 = 900;

        int shirtTotal = s1 + s2 + s3 + s4;
        int paintTotal = p1 + p2 + p3 + p4;

        float shirtDis = 0;
        float paintDis = 0;
        float grandTotal = 0;

        if (shirtTotal >= 1000 && shirtTotal < 2000) {
            shirtDis = (10 / 100f) * shirtTotal;
        } else if (shirtTotal >= 2000 && shirtTotal < 3000) {
            shirtDis = (20 / 100f) * shirtTotal;
        } else if (shirtTotal >= 3000 && shirtTotal < 4000) {
            shirtDis = (30 / 100f) * shirtTotal;
        } else if (shirtTotal >= 4000) {
            shirtDis = (40 / 100f) * shirtTotal;
        }

        if (paintTotal < 2000) {
            paintDis = (15 / 100f) * paintTotal;
        } else if (paintTotal >= 2000 && paintTotal < 3000) {
            paintDis = (25 / 100f) * paintTotal;
        } else if (paintTotal >= 3000 && paintTotal < 4000) {
            paintDis = (35 / 100f) * paintTotal;
        } else {
            paintDis = (50 / 100f) * paintTotal;
        }

        grandTotal = (shirtTotal - shirtDis)
                   + (paintTotal - paintDis);

        System.out.println("Shirt Total = " + shirtTotal);
        System.out.println("Shirt Discount = " + shirtDis);
        System.out.println("Pant Total = " + paintTotal);
        System.out.println("Pant Discount = " + paintDis);
        System.out.println("Grand Total = " + grandTotal);
    }
}