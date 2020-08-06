//���� 9-6 : ��ġ������ ���� �����̳ʿ� ������Ʈ�� ���� ��ġ�� ũ��� ����

// ��ġ �����ڰ� ���� �����̳ʶ�?
//�������α׷����� ������Ʈ�� ���� ũ��� ���� ��ġ����

//�뵵
//������Ʈ�� ũ�⳪ ��ġ�� ������ ���Ƿ� �����ϰ��� �ϴ� ���
//���� ���α׷��� ���� �ð��̳� ���콺/Ű������ �Է¿� ���� ������Ʈ���� ��ġ�� ũ�Ⱑ ���÷� ���ϴ� ���
//���� ������Ʈ���� ���� ���� ����ϰ����ϴ� ���


import javax.swing.*; 
import java.awt.*;

public class NullContainerEx extends JFrame { 
	public NullContainerEx() {
		setTitle("Null Container Sample"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//�����̳��� ��ġ ������ ����
		Container c = getContentPane(); 
		c.setLayout(null);

		JLabel la = new JLabel("Hello, Press Buttons!"); 
		la.setLocation(130, 50); //��ġ ����
		la.setSize(200, 20); //ũ�⼳��
		//setBounds(int x, int y, int width, int height) ���� ��ġ�� ũ�� ���� ����
		c.add(la);

		for(int i=1; i<=9; i++) {
			JButton b = new JButton(Integer.toString(i)); // ��ư ���� 
			b.setLocation(i*15, i*15); //��ġ ����
			b.setSize(50, 20); //ũ�� ����
			c.add(b); // ��ư�� ����Ʈ�ҿ� ���� 
		} 
	setSize(300, 200); //������ũ��
	setVisible(true);//������ ���
	}

	public static void main(String[] args) { 
		new NullContainerEx(); 
	}
}
