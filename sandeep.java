public class sandeep{
    public static void main(String[] args) {
        int p = 65; int c=35; int m=85; int o=75;
        int count = 0; 
        float perc = 0;
        int total = 0;

       if(p>35){count = count+1;}
       if(c>35){count = count+1;}
       if(m>35){count = count+1;}
       if(o>35) {count = count+1;}

       if(count ==4)
       {
        total = p+c+m+o;
        perc = (total/400.0f)*100;
        System.out.println(perc);
       } else {
        System.out.println("fail");
       }

    }
}