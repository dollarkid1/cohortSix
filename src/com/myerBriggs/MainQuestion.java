package com.myerBriggs;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MainQuestion {

   static ArrayList<String> question = new ArrayList<>();
   static int[] store = new int[21];
   static int count = 0;
   static String type = "";





    public void addQuestion(){
        System.out.println("This is a 20 question questionnaire designed to help see who you are.\n ");
        question.add("Question 1. \n A. expend energy, enjoy groups \n B. conserve energy, enjoy one-on-one");
        question.add("Question 2\n. A. interpret literally \n B. look for meaning and possibilities");
        question.add("Question 3.\n A. logical, thinking, questioning\n B. empathetic, feeling, accommodating");
        question.add("Question 4. A. organized, orderly or b. flexible, adaptable");
        question.add("Question 5. A. more outgoing, think out loud \n B. more reserved, think to yourself");
        question.add("Question 6. A. practical, realistic, experiential \n B. imaginative, innovative, theoretical");
        question.add("Question 7. A. candid, straight forward, frank \n B. tactful, kind, encouraging");
        question.add("Question 8. A. plan, schedule \n B. unplanned, spontaneous");
        question.add("""
                Question 9. A. seek many tasks, public activities, interaction with others
                  B. seek private, solitary activities with quiet to concentrate
                """);
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
        ArrayList<String> result = new ArrayList<>();
        MainQuestion quest = new MainQuestion();

        quest.addQuestion();

        for (String q : quest.getQuestion()) {
            System.out.println(q);
            String input = scanner.nextLine();
            result.add(input);
            count++;
            if(input.equals("A") || input.equals("a")){
                store[count] = 1;
            }
            else
                store[count] = 2;
        }
        column1();
        column2();
        column3();
        column4();


        System.out.println(Arrays.toString(store));
        System.out.println(result);
        System.out.println(type);
    }


    public static void column1(){
        int E = 0;
        int I = 0;
        for (int i = 1; i < store.length ; i += 4) {
            if (store[i] == 1) E++;
            else I++;
        }
        if(E > I) type += "E ";
        else type += "I ";
    }
    public static void column2(){
        int S = 0;
        int N = 0;
        for (int i = 2; i < store.length ; i += 4) {
            if (store[i] == 1) S++;
            else N++;
        }
        if (S > N) type += "S ";
        else type += "N ";
    }
    public static void column3(){
        int T = 0;
        int F = 0;
        for (int i = 3; i < store.length ; i += 4) {
            if (store[i] == 1) T++;
            else F++;
        }
        if (T > F) type += "T ";
        else type += "F ";
    }
    public static void column4(){
        int J = 0;
        int P = 0;
        for (int i = 4; i < store.length ; i += 4){
        if (store[i] == 1) J++;
        else P++;}
        if (J > P) type += "J ";
        else type += "P ";
    }


    public static void main (String[]args){
        print();
        if (type.equals("E S T J "))
               System.out.println("""
                       ESTJ - Overseer
                       •Military Leader
                       •Police
                       •Researcher
                       •Sales\s
                       •Scientist
                       •Senior Manager
                       •Teacher
                       •Teacher/Professor
                       •Technical Specialist
                       •Underwriter
                       •Writer
                       •Accountant
                       •Auditor
                       •Banker
                       •Administrator
                       •Business Analyst\s
                       •Computer Specialist
                       •Detective
                       •Economist
                       •Editor
                       •Engineer
                       •Financial Officer
                       •Government Worker
                       •Insurance Agent
                       •Judge
                       •Lecturer
                       •Librarian
                       •Manager
                       •Marketer""");
        if (type.equals("E S F J "))
               System.out.println("""
                       ESFJ - Supporter
                       •Receptionist
                       •Researcher
                       •Social Worker
                       •Speech Therapist
                       •Teacher
                       •Trainer
                       •Accountant
                       •Administrative Assistant
                       •Administrator
                       •Bookkeeper
                       •Child Care
                       •Church Worker
                       •Counselor
                       •Dental Assistant
                       •Family Doctor
                       •Homemaker
                       •Human Resources
                       •Marketer
                       •Nurse
                       •Office Manager
                       •Organization Leader
                       •Radiologist
                       """);
        if (type.equals("I S T J "))
               System.out.println("""
                       ISTJ - Examiner
                       •Mechanical\s
                       Engineer
                       •Military Leader
                       •Police
                       •Scientist
                       •Steelworker
                       •Systems Analyst\s
                       •Technical Specialist
                       •Technician
                       •Accountant
                       •Administrator
                       •Auditor
                       •Computer\s
                       Programmer/Software\s
                       Developer
                       •Computer Specialist
                       •Dentist
                       •Detective
                       •Doctor
                       •Electrician
                       •Executive
                       •Financial Officer
                       •Judge
                       •Lawyer/Attorney
                       •Librarian
                       •Manager
                       •Marketer
                       •Math Teacher
                       """);
        if (type.equals("I S F J "))
                    System.out.println("""
                            ISFJ - Defender
                            •Entrepreneur
                            •Gardener
                            •Health Service
                            •Homemaker
                            •Human Resources
                            •Interior Decorator
                            •Librarian
                            •Marketer
                            •Medical Technologist
                            •Military
                            •Nurse
                            •Office Manager
                            •Paralegal
                            •Police
                            •Psychologist/Counselor
                            •Researcher
                            •Scientist
                            •Shopkeeper
                            •Social Worker
                            •Writer
                            •Accountant
                            •Actor
                            •Administrative Assistant
                            •Administrator
                            •Artist
                            •Auditor
                            •Banker
                            •Bookkeeper
                            •Business Analyst\s
                            •Career Counselor
                            •Child Care
                            •Church Worker
                            •Clerical Supervisor
                            •Counselor
                            •Designer
                            •Doctor
                            •Early Childhood\s
                            Development
                            •Economist
                            •Editor""");
        if (type.equals("E S T P "))
                    System.out.println("""
                            ESTP - Persuader
                            •Paramedic/EMT
                            •Police
                            •Project Manager
                            •Sales
                            •Agent
                            •Auditor
                            •Carpenter
                            •Comedian
                            •Computer Tech Support
                            •Computer Technician
                            •Craftsman
                            •Detective
                            •Driver
                            •Engineer
                            •Entrepreneur
                            •Farmer
                            •Firefighter
                            •Laborer
                            •Marketer
                            •Military
                            •Network Specialist""");
        if (type.equals("E S F P "))
                    System.out.println("""
                            ESFP - Entertainer
                            •Receptionist
                            •Recreation Worker
                            •Sales Scientist
                            •Social Worker
                            •Supervisor
                            •Systems Analyst\s
                            •Technical Specialist
                            •Trainer
                            •Actor
                            •Administrative Assistant
                            •Artist
                            •Child Care
                            •Church Worker
                            •Coach
                            •Comedian
                            •Entrepreneur
                            •Fashion Designer
                            •Human Resources
                            •Interior Decorator
                            •Lawyer/Attorney
                            •Marketer
                            •Musician
                            •Painter
                            •Photographer
                            •Psychologist/Counselor
                            """);
        if (type.equals("I S T P "))
                    System.out.println("""
                            ISTP - Craftsman
                            •Motorcyclist
                            •Paramedic/EMT
                            •Pilot
                            •Police
                            •Probation Officer
                            •Project Manager
                            •Sales\s
                            Representative
                            •Scientist
                            •Steelworker
                            •Systems Analyst\s
                            •Technical\s
                            Specialist
                            •Transportation\s
                            Operative
                            •Athlete
                            •Business Analyst\s
                            •Carpenter
                            •Computer Programmer
                            •Computer Specialist
                            •Construction Worker
                            •Dental Hygienist
                            •Detective
                            •Driver
                            •Electrical Engineer
                            •Engineer
                            •Entrepreneur
                            •Farmer
                            •Firefighter
                            •Forensic Pathologist
                            •Human Resources
                            •Marketer
                            •Mechanic
                            •Military""");
        if (type.equals("I S F P "))
                    System.out.println("""
                            ISFP - Artist
                            •Musician
                            •Naturalist
                            •Nurse
                            •Pediatrician
                            •Personal Service
                            •Physical Therapist
                            •Psychologist
                            •Social Worker
                            •Teacher
                            •Technical Specialist
                            •Trainer
                            •Veterinarian
                            •Waiter/Waitress
                            •Writer
                            •X-Ray Technician
                            •Administrative Assistant
                            •Artist
                            •Carpenter
                            •Chef
                            •Child Care
                            •Church Worker
                            •Clerical Supervisor
                            •Composer
                            •Counselor
                            •Dental Staff
                            •Designer
                            •Early Childhood\s
                            Development
                            •Editor
                            •Forest Ranger
                            •Homemaker
                            •Librarian
                            •Mechanic
                            •Medical Staff
                            """);
        if (type.equals("E N T J "))
                    System.out.println("""
                            ENTJ - Chief
                            • Business\s
                            Administrator
                            • Computer\s
                            Consultant
                            • Corporate Executive\s
                            Officer
                            • Entrepreneur
                            • Judge
                            • Lawyer/Attorney
                            • Manager
                            • Mortgage Banker
                            • Politician
                            • Scientist
                            • Systems Analyst\s
                            • Teacher/Professor""");
        if (type.equals("E N T P "))
                    System.out.println("""
                            ENTP - Originator
                            • Politician
                            • Psychiatrist
                            • Psychologist
                            • Sales\s
                            Representative
                            • Scientist
                            • Systems Analyst\s
                            • Writer
                            • Actor
                            • Artist
                            • Comedian
                            • Computer Analyst
                            • Computer\s
                            Programmer
                            • Consultant
                            • Designer
                            • Engineer
                            • Entrepreneur
                            • Inventor
                            • Journalist
                            • Lawyer/Attorney
                            • Marketer
                            • Musician
                            • Photographer
                            """);
        if (type.equals("I N T J "))
                    System.out.println("""
                            INTJ - Strategist
                            • Business\s
                            Administrator
                            • Computer\s
                            Consultant
                            • Corporate Executive\s
                            Officer
                            • Entrepreneur
                            • Judge
                            • Lawyer/Attorney
                            • Manager
                            • Mortgage Banker
                            • Politician
                            • Scientist
                            • Systems Analyst\s
                            • Teacher/Professor""");
        if (type.equals("I N T P "))
                    System.out.println("""
                            INTP - Engineer
                            •Judge
                            •Lawyer/Attorney
                            •Legal Mediator
                            •Logician
                            •Marketer
                            •Mathematician
                            •Musician
                            •Network Specialist
                            •Philosopher
                            •Photographer
                            •Project Manager
                            •Psychiatrist
                            •Psychologist
                            •Researcher
                            •Scientist
                            •Strategic Planner
                            •Systems Analyst\s
                            •Teacher/Professor
                            •Technical Writer
                            Actor
                            •Agent
                            •Archaeologist
                            •Architect
                            •Artist
                            •Computer Animator
                            •Computer Programmer
                            •Computer Specialist
                            •Consultant
                            •Economist
                            •Engineer
                            •Financial Planner
                            •Forestry/Park Ranger
                            •Historian
                            •Human Resources\s
                            Manager
                            •Interpreter/Translator
                            •Inventor
                            •Investigator
                            •Investment Banker""");
        if (type.equals("E N F J "))
                    System.out.println("""
                            ENFJ - Mentor
                            •Accountant/Auditor
                            •Actor
                            •Administrative\s
                            Assistant
                            •Administrator
                            •Artist
                            •Banker/Economist
                            •Career Counselor
                            •Church Worker
                            •Computer Specialist
                            •Consultant
                            •Designer
                            •Diplomat
                            •Editor
                            •Engineer
                            •Events Coordinator
                            •Facilitator
                            •Homemaker
                            •Human Resources
                            •Musician
                            •Nurse
                            •Occupational Therapist
                            •Politician
                            •Project Manager
                            •Psychiatrist
                            •Psychologist/Counselor
                            •Sales Representative
                            •Scientist
                            •Senior Manager
                            •Social Worker
                            •Teacher/Professor
                            •Technical Specialist
                            •Trainer
                            •Writer""");
        if (type.equals("E N T P"))
                    System.out.println("""
                            ENFP - Advocate
                            •Merchandise Planner
                            •Musician
                            •Newscaster
                            •Nurse
                            •Occupational Therapist
                            •Painter
                            •Politician
                            •Project Manager
                            •Psychologist/Counselor
                            •Public Relations
                            •Researcher
                            •Scientist
                            •Senior Manager
                            •Social Scientist
                            •Social Worker
                            •Speech Pathologist
                            •Teacher/Professor
                            •Technical Specialist
                            •Trainer
                            •Writer
                            •Accountant/Auditor
                            •Actor
                            •Art Director
                            •Artist
                            •Banker/Economist
                            •Career Counselor
                            •Church Worker
                            •Conference Planner
                            •Designer
                            •Dietitian/Nutritionist
                            •Diplomat
                            •Editor
                            •Engineer
                            •Entrepreneur
                            •Homemaker
                            •Human Resources
                            •Journalist
                            •Lawyer/Attorney
                            •Marketer
                            •Massage Therapist""");
        if (type.equals("I N F J "))
                    System.out.println("""
                            INFJ - Confidant\040\040\040\040\040\040\040\040\040\040\040
                            •Actor
                            •Alternative Medicine
                            •Artist
                            •Child Care Worker
                            •Child Development
                            •Chiropractor
                            •Church Worker
                            •Clergy
                            •Consultant
                            •Dentist
                            •Designer
                            •Doctor
                            •Educational Consultant
                            •Entrepreneur
                            •Human Resources
                            •Librarian
                            •Marketer
                            •Missionary
                            •Musician
                            •Photographer
                            •Psychiatrist
                            •Psychologist/Counselor
                            •Social Worker
                            •Systems Analyst\s
                            •Teacher/Professor
                            •Trainer
                            •Writer""");
        if (type.equals("I N F P"))
                    System.out.println("""
                            INFP - Dreamer
                            •Massage Therapist
                            •Minister
                            •Missionary
                            •Musician
                            •Photographer
                            •Physical Therapist
                            •Psychologist/Counselor
                            •Researcher
                            •Social Scientist
                            •Social Worker
                            •Speech Pathologist
                            •Teacher/Professor
                            •Translator/Interpreter
                            •Video Editor
                            •Writer
                            •Activist
                            •Actor
                            •Architect
                            •Artist
                            •Church Worker
                            •Counselor
                            •Editor
                            •Educational Consultant
                            •Employee\s
                            Development Specialist
                            •Fashion Designer
                            •Filmmaker
                            •Graphic/Web Designer
                            •Holistic Health\s
                            Practitioner
                            •Human Resources
                            •Journalist
                            •Legal Mediator
                            Librarian""");


    }
}



