package gugudan;

public class gugudan2 {
	public static void main(String[] args) { // 'main'�� ���� �ڵ��ϼ� ����Ű(ctrl + �����̽���) ������ ����
		int i = 2;
		while (i<=9) {
		int j = 1;
		while (j<=9) {
			if (j!=9) {
				System.out.print(i+"*"+j+"="+(i*j)+","+"\t");
				j++;
			} else {
				System.out.print(i+"*"+j+"="+(i*j)+"\t");
				j++;
			}
		}
		i++;
		System.out.println("");
		}
	}
}
