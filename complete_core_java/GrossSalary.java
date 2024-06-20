package complete_core_java;

import java.util.Scanner;

// program to calculate gross salary of an employee
public class GrossSalary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Use System.in to read input from the user
        System.out.println("Enter your basic salary:");
        double salary = sc.nextDouble();

        double da = 0d, hra = 0d, gross_salary = 0d;
        if (salary <= 10000) {
            da = (salary * 10) / 100;
            hra = (salary * 5) / 100;
            gross_salary = salary + da + hra;
            System.out.println("Your gross salary is: " + gross_salary);

        } else if (salary > 10000 && salary <= 15000) {
            da = (salary * 9) / 100;
            hra = (salary * 4) / 100;
            gross_salary = salary + da + hra;
            System.out.println("Your gross salary is: " + gross_salary);

        } else if (salary > 15000 && salary <= 20000) {
            da = (salary * 8) / 100;
            hra = (salary * 3) / 100;
            gross_salary = salary + da + hra;
            System.out.println("Your gross salary is: " + gross_salary);

        } else if (salary > 20000 && salary <= 25000) {
            da = (salary * 7) / 100;
            hra = (salary * 2) / 100;
            gross_salary = salary + da + hra;
            System.out.println("Your gross salary is: " + gross_salary);
        } else if (salary > 25000 && salary <= 30000) {
            da = (salary * 6) / 100;
            hra = (salary * 2) / 100;
            gross_salary = salary + da + hra;
            System.out.println("Your gross salary is: " + gross_salary);
        } else {
            System.out.println("No DA and HRA allowed for employees with a salary above: " + salary);
        }

        sc.close(); // Don't forget to close the scanner to release resources
    }
}
