public class test{
     static boolean divisibleby35(int n) {
       if(n%3==0 && n%5==0) return true;
       return false;
     } 
     static boolean divisibleby1015(int n) {
        if(divisibleby35(n) && n%10==0 && n%15==0) return true;
        return false;
     }

     static boolean divisibleby20(int n){
      if( divisibleby1015(n) && n%20==0){ return true; }
      return false;
     }
    
    public static void main(String[] args) {
        System.out.println(divisibleby20(30));
    }
}