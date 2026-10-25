public class student1{
     int marks;
     String grade;

     void printGrade() {
          if(marks >= 80) {
             grade = "Grade A";
          } else if(marks >= 60) {
               grade = "Grade B";
          } else if(marks >= 40) {
            grade = "Grade C";
          } else {
              grade = "Fail";
          }

          System.out.println("Marks: " +marks);
          System.out.println("Result: " +grade);
     }
     public static void main(String[] args) {
             student1 s1 = new student1();
             s1.marks = 90;
             s1.printGrade();
     }
}