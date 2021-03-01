package ChapterFour;

public class Kata {

    public double calculateAverage(int firstNumber, int secondNumber, int thirdNumber){
     double average = (firstNumber + secondNumber + thirdNumber)/ 3.0;
     return average;

    }

 public String calculateGrade(int score){
     if(score>=90){
         return  "A";
     }
    else if(score <=80){
        return "B";

     }
    else if(score <=70){
        return "C";
     }

    else {
        return  "F";
     }

    }



        }



