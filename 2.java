import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
     
     Scanner scanner = new Scanner(System.in);
     
  
     System.out.println("Enter number 1: ");
     int number1 = scanner.nextInt();
     System.out.println("Enter number 2: ");
     int number2 = scanner.nextInt();
     
     int sum = number1 + number2;
     System.out.println("The sum of " + number1 + " and "
     + number2 + " is equals to " + sum
     );
 }
}
