//���� 9-3 : FlowLayout ��ġ������ Ȱ��

//���� ������ 30, ���� ������ 40�ȼ��� �ϰ� LEFT�� ���� ��ġ�ϴ� FlowLayout ��ġ�����ڸ� ���� 
//����Ʈ�ҿ� 5���� ��ư ������Ʈ�� ������ ���� �������α׷��� �ۼ��϶�.

import javax.swing.*; 
import java.awt.*;
//��ġ ������ ��ǥ ���� 4�������� awt��Ű���� �����Ǿ��ִ�.
//FlowLayout BorderLayout GridLayout ��ġ������ ��� ����

public class FlowLayoutEx extends JFrame { 
	public FlowLayoutEx() { 
		setTitle("FlowLayout Sample"); //����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //XŬ���� ���μ�������
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40)); //������ ���̾ƿ� ����
		// LEFT�� ����		hgap(���򰣰�) 30 �ȼ�	vgap(��������) 40�ȼ�	
		c.add(new JButton("add")); //��ư�߰�
		c.add(new JButton("sub")); 
		c.add(new JButton("mul")); 
		c.add(new JButton("div")); 
		c.add(new JButton("Calculate"));

		setSize(300, 200);	//�����ӻ����� ����
		setVisible(true);	//������ ���
	}
	
	public static void main(String[] args) { 
		new FlowLayoutEx(); 
	}
}
