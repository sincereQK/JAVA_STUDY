package homework0330;
import java.util.Scanner;

public class game369 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� �Է�(����: 1~99) : ");
		int num = scanner.nextInt();
		scanner.close();
		
		if (num<10) {  // �Է°��� ���ڸ� ���� ���
			if ((num %3) == 0)
				System.out.println("�ڼ�¦");
			else
				System.out.println(" ");
		}
		else {  // �Է°��� ���ڸ� ���� ���
			boolean b1 = (num/10) %3 == 0;  // ���� �ڸ����� 3�� ������� �Ǻ�
			boolean b2 = (num%10) %3 == 0;  // ���� �ڸ����� 3�� ������� �Ǻ�
			
			if ((num%10) == 0) // ����ó��
				b2 = false;
			
			if (b1 && b2)
				System.out.println("�ڼ�¦¦");
			else if (b1 || b2)
				System.out.println("�ڼ�¦");
			else
				System.out.println(" ");
		}
	}
}
