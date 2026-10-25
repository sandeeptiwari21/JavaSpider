public class login{
     String UserName;
     String Password;

     void saved(String UserName, String Password) {
          if(this.UserName .equals(UserName) && this.Password .equals( Password)) {
           System.out.println("Login Successfull");
          } else {
              System.out.println("Invalid UserName or Passsword");
          }
     }

     public static void main(String[] args) {
        login l1 = new login();
        l1.UserName = "Sandeep Tiwari";
        l1.Password = "Sandeep@2004";

        l1.saved("Sandeep Tiwari", "Sandeep@2004");
     }

}    