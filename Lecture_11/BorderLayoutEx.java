//���� 9-4 : BorderLayout ��ġ�����ڸ� ����ϴ� ��

//BorderLayout ��ġ�����ڸ� ����Ͽ� ����Ʈ�ҿ� ������ ���� 5���� ��ư ������Ʈ�� �����϶�

import javax.swing.*;
//��ư üũ�ڽ� ������ư �����̴� �ؽ�Ʈ�ʵ� ����Ʈ ����Ʈ���� �� �پ��Ѱ��� ���� ������Ʈ�� ��������
import java.awt.*;
//native �ü���� GUI������Ʈ�� ������ �޾� �۵�
//��ġ ������ ��ǥ ���� 4�������� awt��Ű���� �����Ǿ��ִ�.
//FlowLayout BorderLayout GridLayout ��ġ������ ��� ����

public class BorderLayoutEx extends JFrame { 
	public BorderLayoutEx() { 
		setTitle("BorderLayout Sample"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		//����Ʈ���� �˾Ƴ��� ����

		c.setLayout(new BorderLayout(30, 20)); //hgap(���򰣰�) 30 �ȼ�	vgap(��������) 20�ȼ�
		c.add(new JButton("Calculate"), BorderLayout.CENTER); //��ư���� 
		c.add(new JButton("add"), BorderLayout.NORTH); //add��ư�� ��ġ�� �����Դϴ�.
		c.add(new JButton("sub"), BorderLayout.SOUTH); 
		c.add(new JButton("mul"), BorderLayout.EAST); 
		c.add(new JButton("div"), BorderLayout.WEST);
		
		setSize(300, 200); // ������ ũ�� 300��200 ���� 
		//setSize(300, 400);	// div Calculate mul ����� ���Ϸ� �þ
		//setSize(500, 200);	// add Calculate sub ���̸� �¿�� �þ
		setVisible(true); // �������� ȭ�鿡 ���
	}

	public static void main(String[] args) { 
		new BorderLayoutEx(); 
	}
}
