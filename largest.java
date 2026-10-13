public class largest{
    public static void findlargest(int a, int b, int c) {
        if( a>b && a>c) {System.out.println("a is greater = "+a);}
       if( b>a && b>c) {System.out.println("b is greater = "+b);}
       else {System.out.println("c is greater"+c);}
    } 
   public static void anotherwayfind(int a,int b,int c) {
          if(a>b) { if(a>c) {System.out.println("a is greate among them"+a);} else {System.out.println(c + "is the largest");} } else { if (b>c) {System.out.println(b+"is greate");} else {System.out.println(c+"is greater");}}
        }
   public static void main(String[] args) {
               largest.findlargest(10,20,30);
               largest.anotherwayfind(20,39,5);
           }
   }