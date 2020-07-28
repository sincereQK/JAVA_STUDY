package PenPackage;

import java.util.Scanner;

class Pen {
	private int amount;
	
	public int getAmount() {
		return amount;
	}
	
	public void setAmount(int amount) {
		this.amount = amount; 
	}
	
	public static void main(String[] args) {
		//Pen pen1 = new Pen();
		SharpPencil sharp = new SharpPencil();
		BallPen ball = new BallPen();
		FountainPen fountain = new FountainPen();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�����潽�� ����: ");
		sharp.setAmount(sc.nextInt());
		
		System.out.print("������ ����: ");
		ball.setAmount(sc.nextInt());
		
		System.out.print("�������� ����: ");
		fountain.setAmount(sc.nextInt());
		
		System.out.print("�����潽�� ������ "+sharp.getAmount()+"�� �Դϴ�.\n");
		System.out.print("������ ������ "+ball.getAmount()+"�� �Դϴ�.\n");
		System.out.print("�������� ������ "+fountain.getAmount()+"�� �Դϴ�.\n");
		
		System.out.print("������ ����: ");
		ball.setColor(sc.next());
		System.out.print("������ ������ "+ball.getColor()+"�Դϴ�.\n");
		
		System.out.print("�������� ����: ");
		fountain.setColor(sc.next());
		System.out.print("�������� ������ "+fountain.getColor()+"�Դϴ�.\n");
		
		System.out.print("������ ���� : ");
		fountain.refill(sc.nextInt());
		System.out.print("������ �������� ���� "+fountain.getAmount()+"�� �Դϴ�.\n");
	}
}
