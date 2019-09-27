package study01.text03;

import java.util.Scanner;

public class HowOldRu {

	public static void main (String [] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("너 몇살이냐?");
		String age = scan.nextLine();
		System.out.println("난 "+ age + "살이야");
		int num = Integer.parseInt(age);
		
		
	}
}
