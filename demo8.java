public class demo8{
    public static void main(String[] args) {
        int p =61; int c=66; int m=70; int e=60; int h=65;
        int total = 0 ; float perc=0;
         total =p+c+m+e+h;
         perc = (total/500.0f)*100;
         if(p<35 || c<35 || m<35 || e<35 || h<35) {
            System.out.println("Result is Fails");
            if(p<35) {
                System.out.println("fail in physics =  "+p);
            } 
            if(c<35){
                System.out.println("fail in chemistry = "+c);
            }
            if(m<35){
                System.out.println("fail in math ="+m);
            } 
            if(e<35){
                System.out.println("fail in english="+e);
            }
            if(h<35){
                System.out.println("fails in hindi="+h);
            }
         } 
         else {
             
            if (perc <60){
                System.out.println("Pass in second class");
            }
            else if(perc<80){
                System.out.println("pass in first class");
            }
            else{
                System.out.println("pass in destination class");
            }
        }
    }
}