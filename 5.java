import java.util.Scanner;

public class Main{

     public static void main(String []args){
         
        Scanner input = new Scanner(System.in);
        System.out.println("Number: ");
        int a = input.nextInt();
        for(int i=1; i<11; i++) {
            System.out.println(a + " x " + i + " = " + a*i);
        }
      
     }
}
