package ChapterFour;

import java.util.Scanner;

 	public class Numbers{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);


	int number1;
	int number2;

	System.out.print("enter number here: ");

	int number1 = input.nextInt();

	System.out.print("enter number here: ");

	int number2 = input.nextInt();



	if(number1 < 40){
 	System.out.println("sorry you failed");
	}
	if(number2 >= 40){
 		System.out.println("CONGRATS YOU PASSED");
	}

	

}










}