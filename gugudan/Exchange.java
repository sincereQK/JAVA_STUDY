package gugudan;

import java.util.Scanner;

public class Exchange {
	public static void main(String[] args) {
		int won;
		double dollar=1280.00;
		
		Scanner input = new Scanner(System.in);
		System.out.print("��ȭ�� �Է��Ͻÿ�(���� ��) : ");
		won = input.nextInt();
		
		System.out.println(won+"���� "+(double)won/dollar+"�޷�");
	}

}
