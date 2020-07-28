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
		System.out.print("샤프펜슬의 개수: ");
		sharp.setAmount(sc.nextInt());
		
		System.out.print("볼펜의 개수: ");
		ball.setAmount(sc.nextInt());
		
		System.out.print("만년필의 개수: ");
		fountain.setAmount(sc.nextInt());
		
		System.out.print("샤프펜슬의 개수는 "+sharp.getAmount()+"개 입니다.\n");
		System.out.print("볼펜의 개수는 "+ball.getAmount()+"개 입니다.\n");
		System.out.print("만년필의 개수는 "+fountain.getAmount()+"개 입니다.\n");
		
		System.out.print("볼펜의 색깔: ");
		ball.setColor(sc.next());
		System.out.print("볼펜의 색깔은 "+ball.getColor()+"입니다.\n");
		
		System.out.print("만년필의 색깔: ");
		fountain.setColor(sc.next());
		System.out.print("만년필의 색깔은 "+fountain.getColor()+"입니다.\n");
		
		System.out.print("만년필 보충 : ");
		fountain.refill(sc.nextInt());
		System.out.print("보충한 만년필의 수는 "+fountain.getAmount()+"개 입니다.\n");
	}
}
