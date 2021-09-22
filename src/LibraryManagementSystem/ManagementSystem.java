package LibraryManagementSystem;

import LibraryManagementSystem.users.Student;

import java.util.ArrayList;
import java.util.List;

public class ManagementSystem {
//    private List <User> staff = new ArrayList<>();
    private List <Student> students = new ArrayList<>();
    private String Username;
    private String Password;

//
//    public List<User> getStaff() {
//        return staff;
//    }
//
//    public void setStaff(List<User> staff) {
//        this.staff = staff;
//    }
//
//    public List<User> getStudent() {
//        return student;
//    }
//
//    public void setStudent(List<User> student) {
//        this.student = student;
//    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public int getTotalNumberOfStudents() {
        return students.size();
    }

    public void register(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }
}
