package Chapter15;

import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.Formatter;
import java.util.Scanner;

public class StudentsInfo {

    public void saveRecords() throws FileNotFoundException {
        //create and open a file
        try (Formatter formatter = new Formatter("students_records.txt");
             Scanner scanner = new Scanner(System.in);) {
            System.out.println("Enter Student records and Enter + CTRL + D");
            System.out.println("Enter Firstname");
            formatter.format("%s %s %s %s %s%n", "FirstName", "LastName", "Level", "BirthYear", "Age");


            while (scanner.hasNext()) {
                String firstName = scanner.next();
                System.out.println("Enter Lastname");
                String lastName = scanner.next();
                System.out.println("Enter Level");
                int level = scanner.nextInt();
                System.out.println("Enter Birth Year");
                int birthYear = scanner.nextInt();

                formatter.format("%s %s %d %d %d %n", firstName, lastName, level, birthYear, LocalDate.now().getYear() - birthYear);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) throws FileNotFoundException {
        StudentsInfo info = new StudentsInfo();
        info.saveRecords();
    }
}