import javax.swing.*; 
import java.awt.*;

//���� 9-2 : 3���� ��ư ������Ʈ�� ���� ���������� �����

//���� �׸��� ���� ����Ʈ���� ������ ������������ �ϰ�, �̰��� OK, 
//Cancel, Ignore ��ư���� ������ ���� ���α׷��� �ۼ��϶�.

public class ContentPaneEx extends JFrame { 
	public ContentPaneEx() { 
		setTitle("ContentPane�� JFrame"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		//JFrame���� â�� ����ٰ� ���� ��ܿ� Xǥ�ø� ������ �츮������ â�� ���� ��ó�� �������� �����δ� JVM�� �����ִ�.
		//���� ��ɾ ����ϸ� ������â ����� ���μ������� ����ϰ� ���� �� �ִ�.
		
		Container contentPane = getContentPane(); 
		//Frame�� ��������� ContentPane�� setting�� ���Ͽ� JFrameŬ������ ��ü �޼ҵ��� getContentPane() ȣ���Ͽ����� 
		//�ش� method���� ��ȯ�� ���� Container Ÿ���� reference variable(��������)�� �����Ͽ����ϴ�.
		contentPane.setBackground(Color.ORANGE); //����� ������ ������ �մϴ�.
		contentPane.setLayout(new FlowLayout());	//�������� ���̾ƿ��� �����Ҽ��ִ� �κ�
		
		//contentPane.setLayout(new FlowLayout(FlowLayout.LEFT));
		//contentPane.setLayout(new FlowLayout(0));
		//contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 100));
		//contentPane.setLayout(new FlowLayout(0, 30, 100));
		
		// ��ư ����
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		setSize(300, 150);	//������ũ�� 300x150
		setVisible(true);	// ������ ���
	}
	
	public static void main(String[] args) { 
		new ContentPaneEx(); 
	}
}