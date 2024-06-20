package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortList {
    public static void main(String [] args){

//        List<Integer>  list = new ArrayList<>();
//        list.add(100);
//        list.add(1);
//        list.add(40);
//        list.add(20);
//        list.add(30);
//        list.add(10);
//
//        Collections.sort(list);//ascending order
//        System.out.println(list);
//
//        Collections.reverse(list);//descending order
//        System.out.println(list);

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(2, "John Doe", 30, 50000));
        employees.add(new Employee(1, "Jane Smith", 35, 60000));
        employees.add(new Employee(4, "Alice Johnson", 28, 45000));
        employees.add(new Employee(5, "Bob Brown", 40, 70000));
        employees.add(new Employee(3, "Emily Davis", 25, 40000));

        Collections.sort(employees,new MySort());
        System.out.println(employees);

        System.out.println("************************");
        Collections.sort(employees);
        System.out.println(employees);

        System.out.println("****************************");
        // lambda expression
        // Sorting employees by ID using lambda expression
        Collections.sort(employees, (emp1, emp2) -> Integer.compare(emp1.getId(), emp2.getId()));

        // Printing sorted employees' IDs
        employees.forEach(emp -> System.out.println(emp));

        System.out.println("*******************************");
        //by using stream

        // Sorting employees by ID using stream and filter
        employees.stream()
                .sorted(Comparator.comparingInt(Employee::getId))
                .forEach(emp -> System.out.println(emp));
        System.out.println("*******************************");
        // Creating a separate list of employees with salary less than 50000
        List<Employee> lowSalaryEmployees = employees.stream()
                .filter(emp -> emp.getSalary() < 50000)
                .toList();
        // Printing the details of low salary employees
        System.out.println("Employees with salary less than 50000:");
        lowSalaryEmployees.forEach(emp -> System.out.println(emp));
        System.out.println("*******************************");
        // Creating a separate list of employees whose names start with "J"
        List<Employee> jEmployees = employees.stream()
                .filter(emp -> emp.getName().startsWith("J"))
                .toList();

        // Printing the details of employees whose names start with "J"
        System.out.println("Employees whose names start with 'J':");
        jEmployees.forEach(emp -> System.out.println(emp));
        System.out.println("*******************************");
        // Increase salary of employees whose names start with "J"
        List<Employee> increasedSalaryEmployees = employees.stream()
                .filter(emp -> emp.getName().startsWith("J"))
                .peek(emp -> emp.setSalary(emp.getSalary() + 15000))
                .toList();

        // Printing the details of employees whose names start with "J" after salary increase
        System.out.println("Employees whose names start with 'J' after salary increase:");
        increasedSalaryEmployees.forEach(emp -> System.out.println(emp));

        System.out.println("*******************************");
        // Increase salary of employees whose names start with "J"
        List<Employee> increasedSalaryEmployeess = employees.stream()
                .filter(emp -> emp.getName().startsWith("J"))
                .map(emp -> {
                    emp.setSalary(emp.getSalary() + 5000);
                    return emp;
                })
                .toList();

        // Printing the details of employees whose names start with "J" after salary increase
        System.out.println("Employees whose names start with 'J' after salary increase:");
        increasedSalaryEmployeess.forEach(emp -> System.out.println(emp));
    }
}
 class MySort implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
//        return o1.getName().compareTo(o2.getName());// by-name
//        return o1.getId()-o2.getId();// by-id
//        return o1.getAge()-o2.getId();//by-age
//        return Long.compare(o1.getSalary(), o2.getSalary());// ascending
        return Long.compare(o2.getSalary(), o1.getSalary());// descending
    }
}
