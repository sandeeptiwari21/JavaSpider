public class greater{
        public static void findGreater(int a, int b) {
             if(a>b) { System.out.println("a is greater than b ="+a);}
             if(b>a) { System.out.println("b is greater than a ="+b);}
             if(b==a) {System.out.println("both are equal number");}
          }
    public static void main(String[] args) {
            greater.findGreater(10,10);
       }
}