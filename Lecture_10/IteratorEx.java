//���� 7-4 : Iterator�� �̿��Ͽ� Vector�� ��� ��Ҹ� ����ϰ� �� ���ϱ�
//���� 7-1�� �ڵ带 Iterator<Integer>�� �̿��Ͽ� �����϶�.

import java.util.*;

public class IteratorEx { 
	public static void main(String[] args) { 
		// ���� ���� �ٷ�� ���׸� ���� ���� 
		Vector<Integer> v = new Vector<Integer>(); 
		v.add(5); // 5 ���� 
		v.add(4); // 4 ����
		v.add(-1); // -1 ���� 
		v.add(2, 100); // 4�� -1 ���̿� ���� 100 ����
		
		// Iterator�� �̿��� ��� ���� ����ϱ� 
		Iterator<Integer> it = v.iterator(); //iterator() �޼ҵ� : iterator ��ü ��ȯ | iterator ��ü ���
		while(it.hasNext()) { //���ͷ����� ��ü it �� ������� ���ִٸ� true�� ��ȯ
			int n = it.next(); 	//n�� it�� ������Ҹ� ��ȯ �մϴ�.
			System.out.println(n); //n�� �����մϴ�.
		}	// �̰����� it�� ������Ұ� ������ �� it�� ���θ� ����ҋ� ���� �����մϴ�.
		// Iterator�� �̿��Ͽ� ��� ���� ���ϱ� 
		int sum = 0; 
		it = v.iterator(); // Iterator ��ü ��� 
		while(it.hasNext()) { //Iterator ��ü it �� ������� ���ִٸ� true�� ��ȯ
			int n = it.next(); //n�� it�� ������Ҹ� ��ȯ �մϴ�.
			sum += n; // sum�� n ���� ���մϴ�.
		} 
		System.out.println("���Ϳ� �ִ� ���� �� : " + sum);
	}
}
