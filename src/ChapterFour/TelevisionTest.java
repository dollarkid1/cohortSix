package ChapterFour;

import java.util.Scanner;

public class TelevisionTest{

public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
	Television humbleNewTv= new Television("LG");
	System.out.printf("TV name is %s%n", humbleNewTv.getproductName());

}

}