package study01.text03;

import java.util.Scanner;

public class HowOldRu {

	public static void main (String [] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("너 몇살이냐?");
		String age = scan.nextLine();
		int num = Integer.parseInt(age);
		if(num<=10) {
			System.out.println("어린이");
		}else if(num<=20) {
			System.out.println("청소년");
		}else if(num<=40) {
			System.out.println("청년");		
		}else if(num<41) {
					System.out.println("꼰대");
	}
		}
}
