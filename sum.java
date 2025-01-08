import java.util.Scanner;
public class sum {
   public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a two-digit number: ");
        int number = scanner.nextInt();
        int a = number / 50;  
        int b = number % 50;  
        int sum = a + b;
        System.out.println(a + " + " + b + " = " + sum);
        scanner.close();
    }
}
    

