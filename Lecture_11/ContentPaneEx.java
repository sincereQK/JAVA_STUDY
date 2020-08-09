import javax.swing.*; 
import java.awt.*;

//예제 9-2 : 3개의 버튼 컴포넌트를 가진 스윙프레임 만들기

//다음 그림과 같이 컨텐트팬의 배경색을 오렌지색으로 하고, 이곳에 OK, 
//Cancel, Ignore 버튼들을 부착한 스윙 프로그램을 작성하라.

public class ContentPaneEx extends JFrame { 
	public ContentPaneEx() { 
		setTitle("ContentPane과 JFrame"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		//JFrame으로 창을 띄웠다가 우측 상단에 X표시를 누르면 우리눈에는 창이 닫힌 것처럼 보이지만 실제로는 JVM에 남아있다.
		//위의 명령어를 사용하면 윈도우창 종료시 프로세스까지 깔끔하게 닫을 수 있다.
		
		Container contentPane = getContentPane(); 
		//Frame의 구성요소인 ContentPane의 setting을 위하여 JFrame클래스의 객체 메소드인 getContentPane() 호출하였으며 
		//해당 method에서 반환된 값을 Container 타입의 reference variable(참조변수)에 저장하였습니다.
		contentPane.setBackground(Color.ORANGE); //배경을 오렌지 색으로 합니다.
		contentPane.setLayout(new FlowLayout());	//프레임의 레이아웃을 변경할수있는 부분
		
		//contentPane.setLayout(new FlowLayout(FlowLayout.LEFT));
		//contentPane.setLayout(new FlowLayout(0));
		//contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 100));
		//contentPane.setLayout(new FlowLayout(0, 30, 100));
		
		// 버튼 생성
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		setSize(300, 150);	//프레임크기 300x150
		setVisible(true);	// 프레임 출력
	}
	
	public static void main(String[] args) { 
		new ContentPaneEx(); 
	}
}