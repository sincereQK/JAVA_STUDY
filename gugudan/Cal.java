package gugudan;

import java.util.Scanner;

public class Cal {
	public static void main(String[] args) {
		String math;
		int number1, number2;
		
		Scanner scan = new Scanner(System.in);
		
		number1 = scan.nextInt();
		math = scan.next();
		number2 = scan.nextInt();
		
		//math = "*";
		//number1 = 100;
		//number2 = 30;
		//System.out.println(number1+math+number2);
		
		
		while (!"=".equals(math)) {
			if ("+".equals(math)) {
				System.out.println("°á°ú: "+(number1+number2));
				//break;
			} else if ("-".equals(math)) {
				System.out.println("°á°ú: "+(number1-number2));
				//break;
			} else if ("*".equals(math)) {
				System.out.println("°á°ú: "+(number1*number2));
				//break;
			} else if ("/".equals(math)) {
				System.out.println("°á°ú: "+(number1/number2));
				//break;
			} else {
				System.out.println("°á°ú: "+(number1%number2));
				//break;
			}
			number1 = scan.nextInt();
			math = scan.next();
			number2 = scan.nextInt();
		}
	}

}
