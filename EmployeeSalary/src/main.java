import java.util.Scanner;

public class main {

    public static double salary (double hours, double perhour, int vacation) {
        // create a 'results' variable and calculate yearly salary
        // hours * perhour = pay-per-week x 52 = pay-per-year
        // perhour * vacation * 8 = pay-per-8hr-day * number of vacation days = pay lost from vacation days
        // subtract pay lost from yearly salary to get actual salary and return results
        double result = (hours * perhour) * 52 - (vacation * 8 * perhour);
        return result;
    }

    public static void main(String[] args) {
        // setup Scanner function to allow user input
        Scanner input = new Scanner(System.in);
        System.out.println("This calculates yearly salary from number of hours per week and pay per hour");

        // input emplyee hours as a decimal number
        System.out.println("Please enter the number of employee hours");
        double employeeHours = input.nextDouble();

        // input pay per hour as a decimal number
        System.out.println("What is the per hour pay?");
        double perHourPay = input.nextDouble();

        // input number of days taken for vacation as a whole number
        System.out.println("Does employee take any unpaid vacation days?  Enter number of days or 0 for none");
        int vacationDays = input.nextInt();

        // call 'salary' function, passing user input as parms, and put results into 'yearly'
        double yearly = salary(employeeHours, perHourPay, vacationDays);

        // print results from function
        System.out.println("The employee's yearly salary is " + yearly);
    }
}
