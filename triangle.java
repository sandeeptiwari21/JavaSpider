public class triangle{
   public static void checktriangle(int a, int b, int c) {
        if( a>0 && b>0 && c >0) {
               if( (a+b) > c && (a+c) >b && (b+c) > a) {
                     System.out.println("Triangle is valid");
                    } else { System.out.println("Triangle is invalid");}
           } else { System.out.println("triangle is not valid");} 
  
   }
    public static void main(String[] args) {
          triangle.checktriangle(3,4,5);
    }
 }