//MathTest

import java.util.Scanner;

public class MathTest{
	public static void main(String args[]){
		int a;
		System.out.println("Please input integer a=:" );
		Scanner input = new Scanner(System.in);
		a = input.nextInt();
		
		System.out.println("a=: " + a);
		System.out.printf("a^0.5= %.2f " , Math.sqrt(a));
			
		
	}
		
}