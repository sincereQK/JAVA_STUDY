//���� 9-5 : GridLayout���� �Է� �� �����

//�Ʒ� ȭ��� ���� ����ڷκ��� �Է¹޴� ���� ���� �������α׷��� �ۼ��϶�

import javax.swing.*; 
import java.awt.*;
//��ġ ������ ��ǥ ���� 4�������� awt��Ű���� �����Ǿ��ִ�.
//FlowLayout BorderLayout GridLayout ��ġ������ ��� ����

public class GridLayoutEx extends JFrame { 
	public GridLayoutEx() { 
		setTitle("GridLayout Sample"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		GridLayout grid = new GridLayout(4, 2); 	// 4x2�� ���� ��ġ
		//GridLayout(int rows, int cols, int hGap, int vGap)
		//rows �׸����� �� ��, ����Ʈ 1
		//cols �׸����� �� ��, ����Ʈ 1
		//hGap �¿� ������Ʈ ������ ���� ����, �ȼ�����, ����Ʈ 0
		//vGap �¿� ������Ʈ ������ ���� ����, �ȼ�����, ����Ʈ 0
		
		grid.setVgap(5);

		Container c = getContentPane(); 
		c.setLayout(grid); 
		c.add(new JLabel(" �̸�")); 
		c.add(new JTextField("")); 
		c.add(new JLabel(" �й�")); 
		c.add(new JTextField("")); 
		c.add(new JLabel(" �а�")); 
		c.add(new JTextField("")); 
		c.add(new JLabel(" ����")); 
		c.add(new JTextField("")); 
		
		setSize(300, 200);	// ������ ũ�� 300��200 ���� 
		setVisible(true);	// �������� ȭ�鿡 ���
	}

	public static void main(String[] args) { 
		new GridLayoutEx(); 
	}
}
