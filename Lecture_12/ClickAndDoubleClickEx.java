//���� 10-10 : ����Ŭ�� �� ����Ʈ���� ���� ����
//����Ŭ���� ������ ����Ʈ���� ������ �����ϰ� �����Ѵ�.

// ���콺 �̺�Ʈ
// ������� ���콺 ���ۿ� ���� �߻��ϴ� �̺�Ʈ �� 8���� ��찡 ����

//���� �̿������� ���Ǵ� �̺�Ʈ�� mouseClicked	 
//���콺�� ������Ʈ�� Ŭ���Ͽ����� �̺�Ʈ�� �߻�

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ClickAndDoubleClickEx extends JFrame {
	public ClickAndDoubleClickEx() {//������
		setTitle("Click and DoubleClick ����"); //���� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// ������â�� x Ŭ���� ���α׷��� ������ ����

		Container c = getContentPane(); //�����ӿ� ����� ����Ʈ ���� ����
		c.addMouseListener(new MyMouseListener()); //���콺 �����ʸ� ������Ʈ�� ���
		setSize(300,200); //������ ����
		setVisible(true); // ���
	}

	class MyMouseListener extends MouseAdapter { 
		//���콺 ��͸� ��� 
		// �̺�Ʈ ������ ������ ���� �δ��� �ؼ� �ϱ� ���Ͽ� ��� 
		//������ �ۼ��� �߻�޼ҵ���� ��� �����ؾ��ϱ⿡�� �δ��� ��
		public void mouseClicked(MouseEvent e) { 
			if(e.getClickCount() == 2) { //Ŭ��ī��Ʈ�� 2�� �� ���� Ŭ��
				int r = (int)(Math.random()*256); 
				int g = (int)(Math.random()*256); 
				int b = (int)(Math.random()*256); 
				Component c = (Component)e.getSource(); 
				c.setBackground(new Color(r,g,b)); 
			} 
		} 
	} 
	public static void main(String [] args) { 
		new ClickAndDoubleClickEx(); 
	}
}
