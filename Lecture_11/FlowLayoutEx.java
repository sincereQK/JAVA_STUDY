//예제 9-3 : FlowLayout 배치관리자 활용

//수평 간격이 30, 수직 간격을 40픽셀로 하고 LEFT로 정렬 배치하는 FlowLayout 배치관리자를 가진 
//컨텐트팬에 5개의 버튼 컴포넌트를 부착한 스윙 응용프로그램을 작성하라.

import javax.swing.*; 
import java.awt.*;
//배치 관리자 대표 유형 4가지들은 awt패키지에 구현되어있다.
//FlowLayout BorderLayout GridLayout 배치관리자 사용 안함

public class FlowLayoutEx extends JFrame { 
	public FlowLayoutEx() { 
		setTitle("FlowLayout Sample"); //제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //X클릭스 프로세스종료
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40)); //프레임 레이아웃 설정
		// LEFT로 정렬		hgap(수평간격) 30 픽셀	vgap(수직간격) 40픽셀	
		c.add(new JButton("add")); //버튼추가
		c.add(new JButton("sub")); 
		c.add(new JButton("mul")); 
		c.add(new JButton("div")); 
		c.add(new JButton("Calculate"));

		setSize(300, 200);	//프레임사이즈 설정
		setVisible(true);	//프레임 출력
	}
	
	public static void main(String[] args) { 
		new FlowLayoutEx(); 
	}
}
