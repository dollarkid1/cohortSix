package ClassesAndObject;

class CourseTest {
    public static void main(String[] args) {
        Course course1 = new Course("Data Structure");
        Course course2 = new Course("Database System");

        course1.addStudent("Peter Jones");
        course1.addStudent("Kim Smith");
        course1.addStudent("Anne Kennedy");

        course2.addStudent("Peter Jones");
        course2.addStudent("Kim Smith");

        System.out.println("Number of student in course1: " +
                course1.getNumberOfStudents());

        String[] students = course1.getStudents();

        for (int i = 0; i < course1.getNumberOfStudents(); i++)
            System.out.print(students[i] + ", ");

        System.out.println();
        System.out.print("Number of student in course2: "+
                course2.getNumberOfStudents());
    }
}