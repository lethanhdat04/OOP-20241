import java.util.Scanner;

public class DegreeEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a (a ≠ 0): ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter b: ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter c: ");
        double c = Double.parseDouble(scanner.nextLine());
        double delta = b * b - 4 * a * c;
        if (a == 0) {
            System.out.println("Invalid input");
        } else if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("x = " + x);
        } else {
            System.out.println("The equation has no real roots.");
        }
    }
}
