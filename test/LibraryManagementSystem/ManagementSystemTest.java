package LibraryManagementSystem;

import LibraryManagementSystem.users.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ManagementSystemTest {
    Student student;
    ManagementSystem lms;

    @BeforeEach
    void setUp() {
        student = new Student("Dan",0001);
        lms = new ManagementSystem();
    }

    @Test
    void registerStudent(){
        assertEquals(0, lms.getTotalNumberOfStudents());
        lms.register(student);
        assertEquals(1, lms.getTotalNumberOfStudents());
        assertEquals(student, lms.getStudents().get(0));
    }
}