package May31;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.OptionalDouble;
class Employee {
 private int id;
 private String firstName;
 private String lastName;
 private int age;
 private String city;
 private double salary;

 public Employee(int id, String firstName, String lastName, int age,
   String city, double salary) {
  super();
  this.id = id;
  this.firstName = firstName;
  this.lastName = lastName;
  this.age = age;
  this.city = city;
  this.salary = salary;
 }

 public int getId() {
  return id;
 }

 public void setId(int id) {
  this.id = id;
 }

 public String getFirstName() {
  return firstName;
 }

 public void setFirstName(String firstName) {
  this.firstName = firstName;
 }

 public String getLastName() {
  return lastName;
 }

 public void setLastName(String lastName) {
  this.lastName = lastName;
 }

 public int getAge() {
  return age;
 }

 public void setAge(int age) {
  this.age = age;
 }

 public String getCity() {
  return city;
 }

 public void setCity(String city) {
  this.city = city;
 }

 public double getSalary() {
  return salary;
 }

 public void setSalary(double salary) {
  this.salary = salary;
 }

 @Override
 public boolean equals(Object employee) {
  if (Objects.isNull(employee))
   return false;

  if (!(employee instanceof Employee))
   return false;

  Employee emp = (Employee) employee;

  return id == emp.id;
 }

 @Override
 public int hashCode() {
  return Objects.hash(id, firstName, lastName, age);
 }

 @Override
 public String toString() {
  return String.format("%s(%s,%d,%f)", firstName, city, age, salary);
 }

}
public class Stream1 {
 public static List<Employee> getEmployees() {
  Employee emp1 = new Employee(1, "Siddhu ", "Musicewala", 28,
    "Mansa", 400000);
  Employee emp2 = new Employee(2, "Mikka", "Singh", 32, "Chandigarh",
    500000);
  Employee emp3 = new Employee(3, "Atif", "Aslam", 31, "Peshwar",
    350000);
  Employee emp4 = new Employee(4, "Shreya", "Ghoshal", 32, "KOlkata",
    76000);
  Employee emp5 = new Employee(5, "Sonu", "Nigam", 32, "Haryana",
    900000);
  Employee emp6 = new Employee(6, "Shankar",  "Mahadevan", 37,
    "Bangalore", 56700);


  List<Employee> employees = new ArrayList<>();

  employees.add(emp1);
  employees.add(emp2);
  employees.add(emp3);
  employees.add(emp4);
  employees.add(emp5);
  employees.add(emp6);



  return employees;
 }

 public static void main(String args[]) {
  List<Employee> employees = getEmployees();

 
  double totalSalary = employees.stream()
    .mapToDouble(Employee::getSalary).sum();


  OptionalDouble minSalary = employees.stream()
    .mapToDouble(Employee::getSalary).min();


  OptionalDouble maxSalary = employees.stream()
    .mapToDouble(Employee::getSalary).max();

  OptionalDouble avgSalary = employees.stream()
    .mapToDouble(Employee::getSalary).average();

  System.out.println("Total Salary : " + totalSalary);
  System.out.println("Minimum Salary : " + minSalary.getAsDouble());
  System.out.println("Maximum Salary : " + maxSalary.getAsDouble());
  System.out.println("Average Salary : " + avgSalary.getAsDouble());
 }
}
