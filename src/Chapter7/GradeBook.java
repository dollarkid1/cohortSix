package Chapter7;

public class GradeBook {
    private String courseName;
    private final int [] grades;

    public  GradeBook(String courseName, int[] grades){
    this.courseName = courseName;
    this.grades = grades;
    }

    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    public String getCourseName(){
        return courseName;
    }

    public void processGrades() {

        outputGrades();
        System.out.printf("%nClass average is %.2f%n", getAverage() );
        System.out.printf("Lowest grade is %d%nHighest grade is %d%n%n", getMinimum(), getMaximum());
        outputBarChart();

    }

    public int getMinimum(){

        int lowGrade = grades[0];

        for (int i: grades )
        {
            if (lowGrade < i )
                lowGrade = i;
        }

        return lowGrade;

    }

    public int getMaximum(){

        int highGrade = grades[0];

        for (int i : grades)
        {
            if (highGrade < i)
                highGrade = i;
        }

        return highGrade;

    }

    public double getAverage(){
        int total = 0;

        for (int i : grades)
        {
            total += i;
        }

        return (double)total / grades.length;

    }


    public void outputBarChart(){
        System.out.println("Grades Distribution");

        int [] frequency = new int[11];

        for (int i : grades)
            ++frequency[i/10];
        for (int count = 0; count < frequency.length; count++) {

            if (count == 10)
                System.out.printf("%5d",100);
            else
                System.out.printf("%02d-%02d",count * 10, count * 10 + 9);

            for (int stars = 0; stars < frequency[count]; stars++) {
                System.out.print("*");
            }
            System.out.println("");
        }


    }

    public void outputGrades(){

        System.out.printf("the grades are: %n%n");
        for (int students = 0; students < grades.length; students++) {
            System.out.printf("Student %2d: %3d%n", students+1, grades[students]);
        }
    }

    public static void main(String[] args) {
        int[] gradesArray = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
        GradeBook gradeBook = new GradeBook("Java programming",gradesArray);
        System.out.printf("Welcome to the grade book for%n%s%n%n", gradeBook.getCourseName());
        gradeBook.processGrades();
    }

}

























