package study01.text02;

public class ArrayTest {
	public static void main(String[] args) {
		int money1 = 0;
		int money2= 500;
		int money3= 5000;
		int money4= 50000;
		
		int[] moneys=new int[4];
		moneys[0] =0;
		moneys[1] =500;
		moneys[2]=5000;
		moneys[3]=50000;
		
		System.out.println(moneys.length);
		
		for(int i= 0; i<moneys.length;i =i+1) {
			System.out.println(moneys[i]);
		}
		
	}
	
}