import java.util.Scanner;

public class switchmenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        while (n != 5) {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            switch (n) {
                case 1:
                    System.out.println("addition is"+addition(num1, num2));
                    break;
                case 2:
                    System.out.println("Subtraction is"+sub(num1, num2));
                    break;
                case 3:
                    System.out.println("multiplication is"+mul(num1, num2));
                    break;
                case 4:
                    System.out.println("division is"+div(num1, num2));
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }  
            n = scanner.nextInt();
    }
    scanner.close();
    System.out.println("Exit");
    
    }
    public static int addition(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static double div(int a, int b) {
        return (double) a / b;
    }
}

