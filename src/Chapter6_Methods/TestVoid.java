package Chapter6_Methods;

public class TestVoid {
    public static void main(String[] args) {
        System.out.println("the grade is "+ get_grade(75.9));
        System.out.println("the grade is "+ get_grade(59.54));
    }
    public static char get_grade(double score){
        if(score>=90.0)
        return 'A';
        else if (score>=80.0)
            return 'B';
        else if (score>=70.0)
            return 'C';
        else
           return  'F';
    }


}
