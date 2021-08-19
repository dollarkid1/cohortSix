package com.myerBriggs;

import java.util.ArrayList;
import java.util.Scanner;

public class Questions {

    ArrayList<String> question = new ArrayList<String>();
    public void displayQuestion(){
        question.add("Question 1. \n A. expend energy, enjoy groups \n B. conserve energy, enjoy one-on-one");
        question.add("Question 2\n. A. interpret literally \n B. look for meaning and possibilities");
        question.add("Question 3.\n A. logical, thinking, questioning\n B. empathetic, feeling, accommodating");
        question.add("Question 4. A. organized, orderly or b. flexible, adaptable");
        question.add("Question 5. A. more outgoing, think out loud \n B. more reserved, think to yourself");
        question.add("Question 6. A. practical, realistic, experiential \n B. imaginative, innovative, theoretical");
        question.add("Question 7. A. candid, straight forward, frank \n B. tactful, kind, encouraging");
        question.add("Question 8. A. plan, schedule \n B. unplanned, spontaneous");
        question.add("Question 9. A. seek many tasks, public activities, interaction with others\n" +
                "  B. seek private, solitary activities with quiet to concentrate\n");
        question.add("Question 10. A. standard, usual, conventional \n B. different, novel, unique");
        question.add("Question 11. A. firm, tend to criticize, hold the line \n B. gentle, tend to appreciate, conciliate");
        question.add("Question 12. A. regulated, structured \n B. easygoing, “live” and “let live”\n");
        question.add("Question 13. A. external, communicative, express yourself \n B. internal, reticent, keep to yourself");
        question.add("Question 14. A. focus on here-and-now \n B. look to the future, global perspective, “big picture”\n");
        question.add("Question 15. A. tough-minded, just \n B. tender-hearted, merciful");
        question.add("Question 16. A. preparation, plan ahead \n B. go with the flow, adapt as you go\n");
        question.add("Question 17. A. active, initiate \n B. reflective, deliberate\n");
        question.add("Question 18. A. facts, things, “what is” \n B. ideas, dreams, “what could be,” philosophical");
        question.add("Question 19. A. matter of fact, issue-oriented \n B. sensitive, people-oriented, compassionate");
        question.add("Question 20. A. control, govern \n B. latitude, freedom");
    }

    public ArrayList<String> getQuestion() {
        return question;
    }



    public static void print() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> answers = new ArrayList<String>(), result = new ArrayList<String>();
        Questions questions = new Questions();

        questions.displayQuestion();

        for (String q : questions.getQuestion()) {
            System.out.println(q);

            System.out.println("enter answer");
            String input = scanner.nextLine();
            answers.add("input");
        }
        if(answers.get(0).equalsIgnoreCase("A")
                & answers.get(4).equalsIgnoreCase("A")
                & answers.get(8).equalsIgnoreCase("A")
                & answers.get(12).equalsIgnoreCase("A")) result.add("E");
        else result.add("I");

        if(answers.get(5).equalsIgnoreCase("A") & answers.get(13).equalsIgnoreCase("A")) result.add("S");
        else result.add("N");

        if (answers.get(14).equalsIgnoreCase("B") ) result.add("F");
        else result.add("T");

        if(answers.get(7).equalsIgnoreCase("B")) result.add("P");
        else result.add("J");

        System.out.println(answers.toString());
        System.out.println(result.toString());
    }

    public static void main(String[] args) {
        print();
    }
}
