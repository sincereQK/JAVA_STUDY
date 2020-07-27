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
		System.out.print("�� ������ �����ڸ� �Է��Ͻÿ�>>");
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
			
			System.out.print("�� ������ �����ڸ� �Է��Ͻÿ�>>");
			a = sc.nextInt();
			b = sc.nextInt();
			operator = sc.next();
		}
		
		System.out.print("���α׷��� �����մϴ�.");
		
		sc.close();
	}
}
