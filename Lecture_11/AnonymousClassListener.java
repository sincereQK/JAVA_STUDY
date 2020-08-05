//예제 10-3 : 익명 클래스로 Action 이벤트 리스너 만들기

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;

public class AnonymousClassListener extends JFrame { 
	public AnonymousClassListener() { 
		setTitle("Action 이벤트 리스너 작성");//제목 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//X클릭스 프로세스종료
		
		Container c = getContentPane(); 
		//JFrame을 상속받은 클래스에서 메소드(add, setLayout,remove등) 을 사용하려면 getContentPane()을 사용해야함
		//자바 최근 버전에선 사용하지 않아도 어느정도 보정이 되지만 안정성을 위해선 사용을 권함
		//그럼에도 getContentPane()를 사용해야 하는 이유
		//자바에서는 원래 Frame과 JFrame을 구분 했던거같음
		//그래서 메소드를 그냥 사용하면 Frame에 붙고
		//getContentPane()을 사용하면 JFrame에 붙는 느낌임
		//최근 자바에서 어느정도 보정을 해주지만, 가끔 보정이 먹히지 않을때가 있음
		//이를 명확하게 구분해서 getContentPane()를 사용하여 안정적으로 사용하기 위함



출처: https://sourcestudy.tistory.com/94 [study]
		c.setLayout(new FlowLayout()); 
		JButton btn = new JButton("Action"); 
		c.add(btn);

		//익명 클래스로 Action리스너 작성
		btn.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) { 
				JButton b = (JButton)e.getSource(); 
				if(b.getText().equals("Action")) 
					b.setText("액션"); 
				else 
					b.setText("Action"); 
				setTitle(b.getText());	//AnonymousClassListener의 멤버나 JFrame의 멤버를 호출할 수 있음
				} 
			});

		setSize(350, 150); 
		setVisible(true);
	}

	public static void main(String [] args) { 
		new AnonymousClassListener(); 
	}
}
