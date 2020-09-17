import java.util.Scanner;

public class Main{

     public static void main(String []args){
         
        Scanner input = new Scanner(System.in);
        System.out.println("First number: ");
        int a = input.nextInt();
        System.out.println("Second number: ");
        int b = input.nextInt();
        int c = a * b;
        System.out.println(a + " x " + b + " = " + c);
        
     }
}
