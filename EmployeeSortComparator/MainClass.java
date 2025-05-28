package EmployeeSortComparator;

import EmployeeSortComparator.Employee;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainClass {

    public static void main(String[] args){
        Employee emp1 =  new Employee("Some", 50000);
        Employee emp2 =  new Employee("suman", 33000);
        Employee emp3 =  new Employee("debajit", 70000);
        Employee emp4 =  new Employee("anjan", 32000);
        Employee emp5 =  new Employee("someshwar", 100000);

        List<Employee> employeeList= Arrays.asList(emp1, emp2, emp3, emp4, emp5);

        //employeeList.sort((e1, e2) -> e2.getSalary()-e1.getSalary());
        //employeeList.sort((e1, e2) -> e2.getName().compareToIgnoreCase(e1.getName()));
        employeeList.sort((e1, e2) -> e1.getName().length()-e2.getName().length());

        System.out.println(employeeList);

    }
}
