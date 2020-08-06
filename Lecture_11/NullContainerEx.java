//예제 9-6 : 배치관리자 없는 컨테이너에 컴포넌트를 절대 위치와 크기로 지정

// 배치 관리자가 없는 컨테이너란?
//응용프로그램에서 컴포넌트의 절대 크기와 절대 위치결정

//용도
//컴포넌트의 크기나 위치를 개발자 임의로 결정하고자 하는 경우
//게임 프로그램과 같이 시간이나 마우스/키보드의 입력에 따라 컴포넌트들의 취치와 크기가 수시로 변하는 경우
//여러 컴포넌트들이 서로 겹쳐 출력하고자하는 경우


import javax.swing.*; 
import java.awt.*;

public class NullContainerEx extends JFrame { 
	public NullContainerEx() {
		setTitle("Null Container Sample"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//컨테이너의 배치 관리자 제거
		Container c = getContentPane(); 
		c.setLayout(null);

		JLabel la = new JLabel("Hello, Press Buttons!"); 
		la.setLocation(130, 50); //위치 설정
		la.setSize(200, 20); //크기설정
		//setBounds(int x, int y, int width, int height) 사용시 위치와 크기 동시 설정
		c.add(la);

		for(int i=1; i<=9; i++) {
			JButton b = new JButton(Integer.toString(i)); // 버튼 생성 
			b.setLocation(i*15, i*15); //위치 설정
			b.setSize(50, 20); //크기 설정
			c.add(b); // 버튼을 컨텐트팬에 부착 
		} 
	setSize(300, 200); //프레임크기
	setVisible(true);//프레임 출력
	}

	public static void main(String[] args) { 
		new NullContainerEx(); 
	}
}
