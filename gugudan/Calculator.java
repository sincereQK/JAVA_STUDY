package gugudan;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		char math;
		int number1, number2;
		
		Scanner scan = new Scanner(System.in);
		
		number1 = scan.nextInt();
		math = scan.next().charAt(0);
		number2 = scan.nextInt();
		
		while (math != '=') {
			if (math == '+') {
				System.out.println("결과: "+(number1+number2));
			} else if (math == '-') {
				System.out.println("결과: "+(number1-number2));
			} else if (math == '*') {
				System.out.println("결과: "+(number1*number2));
			} else if (math == '/') {
				System.out.println("결과: "+(number1/number2));
			} else {
				System.out.println("결과: "+(number1%number2));
			}
			number1 = scan.nextInt();
			math = scan.next().charAt(0);
			number2 = scan.nextInt();
		}
	}
}
