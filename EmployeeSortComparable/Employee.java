package EmployeeSortComparable;

public class Employee implements Comparable<Employee>{

    @Override
    //by salary
//    public int compareTo(Employee emp) {
//        //return getSalary()-emp.getSalary();
//        return Integer.compare(getSalary(), emp.getSalary());
//    }

    //by name alphabetically
    public int compareTo(Employee emp){
        return this.getName().compareToIgnoreCase(emp.getName());
    }

    private String name;
    private int salary;

    void setName(String name){
        this.name=name;
    }
    void setSalary(int salary){
        this.salary=salary;
    }

    String getName(){
        return this.name;
    }

    int getSalary(){
        return this.salary;
    }

    Employee(){}

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}'+"\n";
    }

    Employee(String name, int salary){
        this.name=name;
        this.salary=salary;
    }
}
