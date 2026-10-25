public class Cal{
      int a;
      int b;

      void add(){
         System.out.println(a+b);
      }
      void sub() {
        System.out.println(a-b);
      }
      void mult(){
        System.out.println(a*b);
      }
      void devide(){
        System.out.println(a/b);
      }
      void modulo() {
        System.out.println(a%b);
      }

      public static void main(String[] args) {
             Cal c1 = new Cal();
             c1.a = 20;
             c1.b = 30;

             c1.add();
             c1.sub();
             c1.mult();
             c1.devide();
             c1.modulo();
      }
}