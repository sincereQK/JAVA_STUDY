// object Ŭ���� 
// java.lang ��Ű���� ����
// ��� Ŭ������ ���� Ŭ����
// ��� Ŭ������ ���� ��� 	��� ��ü�� ���������� ������ ��ü�� �Ӽ��� ��Ÿ���� �޼ҵ� ����

//���� 6-1 : Object Ŭ������ ��ü �Ӽ� �˾Ƴ���
//��ü ���۷��������� ��ü�� Ŭ������, �ؽ��ڵ� ��, ��ü�� ���ڿ��� ����غ���

class Point {
	public int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "Point(" + x + "," + y + ")";
	}
	public boolean equals(Object obj) {
		Point p = (Point)obj;
		if(x == p.x && y == p.y) 
			return true;
		else 
			return false;
	}
}

public class ObjectPropertyEx {
	public static void print(Object obj) {
		System.out.println(obj.getClass().getName());	// Ŭ�����̸�
		System.out.println(obj.hashCode());	// �ؽ� �ڵ� ��
		// �ؽ��ڵ��
		// å�� index�� �ٷ� hash ���
		// ã���� �ϴ� �ܾ key�� �ɰ��̰�. �׳����� �ִ� ���� ����Ű�� ���� index
		// obj��� reference type data value�� 10������ �ٲ� ���� hash code ��� �Ѵ�.
		System.out.println(obj.toString());	// ��ü�� ���ڿ��� ����� ���
		System.out.println(obj);	// ��ü ���
	}
		public static void main(String[] args) {
			Point p = new Point(2,3);
			print(p);
		}
}
