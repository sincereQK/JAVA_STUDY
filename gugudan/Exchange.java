package gugudan;

import java.util.Scanner;

public class Exchange {
	public static void main(String[] args) {
		int won;
		double dollar=1280.00;
		
		Scanner input = new Scanner(System.in);
		System.out.print("원화를 입력하시오(단위 원) : ");
		won = input.nextInt();
		
		System.out.println(won+"원은 "+(double)won/dollar+"달러");
	}

}
