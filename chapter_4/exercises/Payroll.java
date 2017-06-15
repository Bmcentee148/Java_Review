/** Read in employee information and print an appropriate payroll statement

    @author Brian McEntee */

import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        //Prompt user to enter employee information
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee's name: ");
        String name = input.nextLine();
        System.out.print("Enter number of hours worked in a week: ");
        double hoursWorked = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double hourlyWage = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double federalTaxRate = input.nextDouble();
        System.out.print("Enter the state tax withholding rate: ");
        double stateTaxRate = input.nextDouble();

        double grossPay = hoursWorked * hourlyWage;
        double federalTax = grossPay * federalTaxRate;
        double stateTax  = grossPay * stateTaxRate;
        double totalWithheld = federalTax + stateTax;
        double netPay = grossPay - totalWithheld;

        System.out.printf("Employee Name: %s%n", name);
        System.out.printf("Hours Worked: %.1f%n", hoursWorked);
        System.out.printf("Pay Rate: $%.2f%nGross Pay: $%.2f%n",
            hourlyWage, grossPay);
        System.out.println("Deductions:");
        System.out.printf("\tFederal Withholding (%.1f%%): $%.2f%n",
            federalTaxRate * 100, federalTax);
        System.out.printf("\tState Withholding (%.1f%%): $%.2f%n",
            stateTaxRate * 100, stateTax);
        System.out.printf("\tTotal Deduction: $%.2f%n", totalWithheld);
        System.out.printf("Net Pay: $%.2f%n", netPay);

    }
}