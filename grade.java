public class grade{
   public static void checkgrade(int marks) {
         if(marks >=90 && marks <=100) { System.out.println("Grade : A");}
         if(marks >=80 && marks < 90) { System.out.println("Grade : B");}
         if(marks >=70 && marks < 80) { System.out.println("Grade : C");}
         if(marks >=60 && marks < 70) { System.out.println("Grade : D");}
        if(marks >=35  && marks < 60) { System.out.println("Grade: E");}
         if(marks < 35) { System.out.println("Fail");}
    }
  public static void main(String [] args) {
       
   grade.checkgrade(65);
   grade.checkgrade(30);
    grade.checkgrade(95);

   }
}