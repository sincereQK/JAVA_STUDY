//���� 10-3 : �͸� Ŭ������ Action �̺�Ʈ ������ �����

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;

public class AnonymousClassListener extends JFrame { 
	public AnonymousClassListener() { 
		setTitle("Action �̺�Ʈ ������ �ۼ�");//���� 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//XŬ���� ���μ�������
		
		Container c = getContentPane(); 
		//JFrame�� ��ӹ��� Ŭ�������� �޼ҵ�(add, setLayout,remove��) �� ����Ϸ��� getContentPane()�� ����ؾ���
		//�ڹ� �ֱ� �������� ������� �ʾƵ� ������� ������ ������ �������� ���ؼ� ����� ����
		//�׷����� getContentPane()�� ����ؾ� �ϴ� ����
		//�ڹٿ����� ���� Frame�� JFrame�� ���� �ߴ��Ű���
		//�׷��� �޼ҵ带 �׳� ����ϸ� Frame�� �ٰ�
		//getContentPane()�� ����ϸ� JFrame�� �ٴ� ������
		//�ֱ� �ڹٿ��� ������� ������ ��������, ���� ������ ������ �������� ����
		//�̸� ��Ȯ�ϰ� �����ؼ� getContentPane()�� ����Ͽ� ���������� ����ϱ� ����



��ó: https://sourcestudy.tistory.com/94 [study]
		c.setLayout(new FlowLayout()); 
		JButton btn = new JButton("Action"); 
		c.add(btn);

		//�͸� Ŭ������ Action������ �ۼ�
		btn.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) { 
				JButton b = (JButton)e.getSource(); 
				if(b.getText().equals("Action")) 
					b.setText("�׼�"); 
				else 
					b.setText("Action"); 
				setTitle(b.getText());	//AnonymousClassListener�� ����� JFrame�� ����� ȣ���� �� ����
				} 
			});

		setSize(350, 150); 
		setVisible(true);
	}

	public static void main(String [] args) { 
		new AnonymousClassListener(); 
	}
}
