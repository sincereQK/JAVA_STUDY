
import java.util.Scanner;
import java.util.StringTokenizer;

public class problem_3 {

	public static void main(String[] args) {
		// ���� ����
		String ccc=null;
		String cal_data=null;
		int result = 0;
		
        Scanner scan = new Scanner(System.in);      // ���� �Է��� ���ڷ� Scanner ����
        
        System.out.println("������ �Է��Ͻʽÿ�");
        
        ccc = scan.nextLine();            // Ű���� ���� �Է�
        
        System.out.println("�Էµ� ������ ������ �����ϴ�. "+ccc);	// �Է� ���� ���
        
		StringTokenizer cc = new StringTokenizer(ccc,"-+",true);	// StringTokenizer ���
		
		System.out.println("��ū���� : "+cc.countTokens());		// ��ū ���� ���
		
		while(cc.hasMoreTokens()) {	//��ū�� ���̻� ������� while���� �����ϴ�.
			cal_data = cc.nextToken();	// ù������ nextToken ���!
			System.out.println(cal_data+" ��ȣ �� ���ڸ� Ȯ���Ͻʽÿ�.");
			if(cal_data.equals("+")) { //��ȣ�� + �� ��� ���ɴϴ�.
				System.out.println("������ �մϴ�.");
				cal_data = cc.nextToken();	// ���� ���� �ҷ��ɴϴ�
				System.out.println(result+"+"+cal_data);
				result += Integer.parseInt(cal_data);	// ����
			}
			else if(cal_data.equals("-")) {	// ��ȣ�� - �� ��� ���ɴϴ�.
				System.out.println("������ �մϴ�.");
				cal_data = cc.nextToken();	// ���� ���� �ҷ��ɴϴ�.
				System.out.println(result+"-"+cal_data);
				result -= Integer.parseInt(cal_data);	//����
			}
			else {	// ó�� ���ڸ� ����� ����ֽ��ϴ�. �ٽ� ������ �ȵ˴ϴ�.
				System.out.println("�ʱⰪ �Դϴ�.");
				result += Integer.parseInt(cal_data);
			}
			System.out.println("result = "+result);	// ���������� �۵��ߴ��� Ȯ��
			//cal_data = cc.nextToken();
			//����� nextToken�� �ᵵ �������� �۵��ϳ� Exception in thread "main" ���� ��
			//ã�ƺ��� nextToken�� hasMoreTokens ������ ����ؾ� �Ѵٰ� �Ѵ�. 
			//�ֳ��ϸ� hasMoreTokens�� ������ ��ū�� �ִ��� Ȯ���Ͽ� ������ �����ϱ� ���ؼ� �̴�.
			//�׷��Ƿ� �������� nextToken������ NoSuchElementException�� �߸� ���ܰ� ���ٰ� ���´�.
		}
		
		System.out.println("���� ��ū ���� : "+cc.countTokens());	// ���� ��ū ���� ��� : 0�̾�� �մϴ�.
		System.out.println("201702986 ��α�");
    	scan.close();
	}

}
