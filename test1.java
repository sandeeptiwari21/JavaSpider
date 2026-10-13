public class test1{
    static  int total (int p , int c, int m, int o){
        return  p+c+m+o;
 }

    static void perc(int total){
        float perc = total/400.0f*100;
        System.out.println(perc);
    }
    public static void main(String[] args) {
     int  x= test1.total(55,65,77,85);
     test1.perc(x);
    }
}