package example.composite.Pattern;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private String         name;
    private String         department;
    private int            salary;
    private List<Employee> subordinates;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(List<Employee> subordinates) {
        this.subordinates = subordinates;
    }

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.subordinates = new ArrayList<Employee>();
    }

    @Override
    public String toString() {
        return "Employee ----> Name : " + name + " Department : " + department + " salary : " + salary;
    }

    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

}
