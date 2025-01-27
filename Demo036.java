import java.util.Scanner;
    public class Demo036 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();
            System.out.print("Enter the third number: ");
            int num3 = scanner.nextInt();
            if (num1 > num2) {
                System.out.println(num1 + " is the big number.");
            } else if (num2 > num1) {
                System.out.println(num2 + " is the big number.");
            } else if (num1 > num2 && num2 >num1);
            System.out.println(num3 + "is the big number.");
    
        }
        
    }
    
    

