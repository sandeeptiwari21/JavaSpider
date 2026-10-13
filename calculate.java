public class calculate{
       public static void calculateoperator(int a, int b, char op) {
              if(op == '+') { System.out.println(" result= "+(a+b)); } else if(op == '-') { System.out.println("result =" + (a-b));} else if(op == '*') {System.out.println("result ="+ (a*b));} else if (op == '/') {System.out.println("result = " + (a/b));} else { System.out.println("Invalid operator");}
             } 
  public static void main(String [] args) {
         calculate.calculateoperator(10,15,'+');
         calculate.calculateoperator(10,15,'-');
         calculate.calculateoperator(10,15,'*');
         calculate.calculateoperator(10,15,'/');
     }
}