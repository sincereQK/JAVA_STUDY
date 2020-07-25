package homework0330;
import java.util.Scanner;

public class game369 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 입력(범위: 1~99) : ");
		int num = scanner.nextInt();
		scanner.close();
		
		if (num<10) {  // 입력값이 한자리 수인 경우
			if ((num %3) == 0)
				System.out.println("박수짝");
			else
				System.out.println(" ");
		}
		else {  // 입력값이 두자리 수인 경우
			boolean b1 = (num/10) %3 == 0;  // 십의 자리수가 3의 배수인지 판별
			boolean b2 = (num%10) %3 == 0;  // 일의 자리수가 3의 배수인지 판별
			
			if ((num%10) == 0) // 예외처리
				b2 = false;
			
			if (b1 && b2)
				System.out.println("박수짝짝");
			else if (b1 || b2)
				System.out.println("박수짝");
			else
				System.out.println(" ");
		}
	}
}
