package CalcPackage;

import java.util.Scanner;

class Calc {
	
	public int a;
	public int b;
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public static void main(String[] args) {
		Add add = new Add();
		Sub sub = new Sub();
		Mul mul = new Mul();
		Div div = new Div();

		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오>>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		String operator = sc.next();
		
		while (!operator.equals("@")) {
			if (operator.equals("+")) {
				add.setValue(a, b);
				System.out.print(add.calculate()+"\n");
			} else if (operator.equals("-")) {
				sub.setValue(a, b);
				System.out.print(sub.calculate()+"\n");
			} else if (operator.equals("*")) {
				mul.setValue(a, b);
				System.out.print(mul.calculate()+"\n");
			} else if (operator.equals("/")) {
				div.setValue(a, b);
				System.out.print(div.calculate()+"\n");
			}
			
			System.out.print("두 정수와 연산자를 입력하시오>>");
			a = sc.nextInt();
			b = sc.nextInt();
			operator = sc.next();
		}
		
		System.out.print("프로그램을 종료합니다.");
		
		sc.close();
	}
}
