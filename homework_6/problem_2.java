
import java.util.Scanner;
import java.util.StringTokenizer;

public class problem_2 {

	public static void main(String[] args) {
	
		String bbb = null;
		String cal_data = null;
		int sum = 0;
        Scanner scan = new Scanner(System.in);      // ���� �Է��� ���ڷ� Scanner ����
        
        System.out.println("������ �Է��Ͻʽÿ�");
        
        bbb = scan.nextLine();	// Ű���� ���� �Է�
        
        System.out.println("�Էµ� ������ ������ �����ϴ�. "+bbb);		// �Է� ���� ���
        
		StringTokenizer bb = new StringTokenizer(bbb,"+");	// +�� �и��մϴ�.
		
		System.out.println("��ū���� : "+bb.countTokens());
		
		while(bb.hasMoreTokens()) {	// ������ �մϴ�.
			cal_data = bb.nextToken();
			System.out.println(sum+"+"+cal_data);
			sum += Integer.parseInt(cal_data);
			System.out.println(sum);
		}
		
		System.out.println("���� ��ū ���� : "+bb.countTokens());		

    	scan.close();
	}

}
