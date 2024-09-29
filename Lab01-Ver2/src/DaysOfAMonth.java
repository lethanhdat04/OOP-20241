import java.util.Scanner;
public class DaysOfAMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month;
        int year;
        while (true) {
            System.out.print("Enter a month : ");
            month = scanner.nextLine().trim().toLowerCase();
            System.out.print("Enter a valid year: ");
            year = scanner.nextInt();
            scanner.nextLine();
            int days = dayInMonth(month, year);
            if (days > 0) {
                System.out.println("Number of days in " + month + " " + year + " is: " + days);
                break;
            } else {
                System.out.println("Invalid, enter again.");
            }
        }
        scanner.close();
    }

    public static int dayInMonth(String month,int year){
        switch (month) {
            case "january","jan","1", "march", "mar", "3", "may", "5", "august", "aug", "8", "july", "jul", "7", "october", "oct", "10", "december", "dec", "12": return 31;
            case "february","feb","2":
                if (isLeapYear(year)) return 29;
                else return 28;
            case "april","apr","4", "june", "jun", "6", "september", "sep", "9", "november", "nov", "11": return 30;
            default: return -1;
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        }
        return false;
    }
}