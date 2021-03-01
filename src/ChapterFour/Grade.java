package ChapterFour;

import java.util.Scanner;
public class Grade{

public static void main(String[] args){

	Scanner input = 
	new Scanner(System.in);

	int grade;
	
	System.out.println("Enter your Score:");
	grade = input.nextInt();


	if(grade >= 90)
	System.out.println("A");

	if(grade < 90 && grade >= 80)
	System.out.println("B");

	if(grade < 80 && grade >=70)
	System.out.println("C");
	

	else if(grade < 70)
	System.out.println("F");
	
}
}
}	