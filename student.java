public class student{
      String name;
      int p;
      int m;
      int c;
      int o;

      void studentDetails(){
           System.out.println("Student name is :" +name);
           System.out.println("Marks in Physics :" +p);
           System.out.println( "Marks in Math :" +m);
           System.out.println("Marks in Chemistry :" + c);
           System.out.println( "Marks in Optional :" +o);
      }

      void percentage() {
          int total = p+c+m+o;
          float perc = total/400.0f*100;
          System.out.println("Marks percentage of student is :" +perc);
      }

      public static void main(String[] args) {
            student s1 = new student();
               s1.name = "sandeep";
               s1.p = 71;
               s1.m=75;
               s1.c=71;
               s1.o = 68;

             s1.studentDetails();
             s1.percentage();
      }
}