public class Rectangle{
      int length;
      int bredth;

      void calculateArea(){
         System.out.println(length*bredth);
      }
      public static void main(String[] args) {
          Rectangle r1 = new Rectangle();
             r1.length=50;
             r1.bredth=30;

             r1.calculateArea();
      }
}