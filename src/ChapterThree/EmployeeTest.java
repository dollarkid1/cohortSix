package ChapterThree;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Sarah","Alex",900_000);
        System.out.println(employee1.getFirstName()+" " + employee1.getLastName()+" monthly salary is " + employee1.getMonthlySalary());
        employee1.setYearlySalary(900_000.00);
        System.out.println("Sarah Alex's salary for a year is "+((long) employee1.getYearlySalary()));

        System.out.println();

        Employee employee2 = new Employee("Dan", "Lee",1_000_000);
        System.out.println(employee2.getFirstName()+" "+employee2.getLastName()+" monthly salary is "+employee2.getMonthlySalary());
        employee2.setYearlySalary(1_000_000);
        System.out.println("Sarah Alex's salary for a year is "+((long) employee2.getYearlySalary()));




    }
}
