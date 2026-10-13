public class admission{
  public static void checkAdmission(int age,int marks) {
    if(age > 17 && marks >= 60) {System.out.println("Eligible for admission");}
    else {System.out.println("Not Applicable for Application");}
}
  public static void main(String [] args) {
       admission.checkAdmission(23,85);
       }
  }