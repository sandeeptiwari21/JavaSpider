import java.util.Scanner;
public class SwitchQ1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        int ch = sc.next().charAt(0);


        switch (ch) {
            case 'a':
                System.out.println("it is vowel");
                break;
            case 'e' :
                System.out.println("it is vowel");
                break;
            case  'i' :
                System.out.println("it is vowel");   
                break;
            case  'o' :
                System.out.println("it is vowel");
                break;
            case 'u' :
                System.out.println("it is vowel");     
                break;      
        
            default:
                System.out.println("invalid input or it is consonant");
                break;
        }
    }
}