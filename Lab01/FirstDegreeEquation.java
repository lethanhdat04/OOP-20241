import java.util.Scanner;
public class FirstDegreeEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a (a ≠ 0): ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter b: ");
        double b = Double.parseDouble(scanner.nextLine());
        if (a != 0) {
            double x = -b / a;
            System.out.println(" x = " + x);
        } else {
            System.out.println("Invalid input. a must not be zero.");
        }
    }
}

