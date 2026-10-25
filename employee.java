public class employee{
     String name;
     String empId;
     float salary;
     String company;

     void employeeDetails(){
         System.out.println(name + " "+empId+" " + company + " "+salary);
     } 

     void encrementDetails(){
         //  float Incrementsalary = salary + (10/100f)*salary;
        // float increment = (10/100f)*salary;
        //salary = salary+increment;
          salary = (int) (salary+ (salary*10/100f));
        System.out.println("salary incremented for  " +name);
        System.out.println("10% incrementes salary is "+ salary);
     }
     void bonus() {
         if(salary <= 30000) {
             float bonus = (20/100f)* salary;
             salary = salary + bonus;
             System.out.println(bonus + " bonus  ");
             System.out.println(salary);
         }
         else 
         {
            float bonus = (10/100f)*salary;
            salary = salary+bonus;
            System.out.println(bonus + " ");
            System.out.println(salary);
         }
     }
    

     public static void main(String[] args) {
       employee   e1 =  new employee();
       e1.name = "sandeep";
       e1.empId = "0501CS2211720";
       e1.company = "Infosys";
       e1.salary = 35000;

      // e1.employeeDetails();
      // e1.encrementDetails();
      // e1.employeeDetails();

       e1.bonus();
       
        

     }
}

