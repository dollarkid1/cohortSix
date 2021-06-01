package Chapter7;

public class GradeBookModified {
    private String courseName;
    private static int [][] grades;

    public GradeBookModified(String courseName, int[][] grades) {
        this.courseName = courseName;
        this.grades = grades;
    }
   public void setCourseName(String courseName){
        this.courseName = courseName;
   }

   public String getCourseName(){
        return courseName;
   }

   public static void processGrade(){
        outputGrades();
       System.out.printf(" %n%s  %d%n%s  %d%n%n",
               "the lowest grade in the Grade book is", getMinimum(),
               "the highest grade in the Grade book is",getMaximum());
        outputBarChart();

   }

   public static int getMinimum(){

        int lowestGrade = grades[0][0];

        for (int[] studentGrade : grades){
            for (int grades : studentGrade)
                if ( grades < lowestGrade)
                    lowestGrade = grades;
        }
        return lowestGrade;
   }

   public static int getMaximum(){

        int highestGrade = grades[0][0];

        for (int[] studentGrade : grades){
            for (int grades : studentGrade)
                if ( grades > highestGrade)
                    highestGrade = grades;
        }
        return highestGrade;
    }

   public static double getAverage(int [] setOfGrades){
        int total = 0;

        for (int grade: setOfGrades)
            total += grade;
        return (double) total / setOfGrades.length;
   }

   public static   void  outputBarChart(){
       System.out.println(" Overall grade distribution");
       
   }

   public static void outputGrades(){

   }

}









