//예제 9-5 : GridLayout으로 입력 폼 만들기

//아래 화면과 같이 사용자로부터 입력받는 폼을 스윙 응용프로그램을 작성하라

import javax.swing.*; 
import java.awt.*;
//배치 관리자 대표 유형 4가지들은 awt패키지에 구현되어있다.
//FlowLayout BorderLayout GridLayout 배치관리자 사용 안함

public class GridLayoutEx extends JFrame { 
	public GridLayoutEx() { 
		setTitle("GridLayout Sample"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		GridLayout grid = new GridLayout(4, 2); 	// 4x2로 분할 배치
		//GridLayout(int rows, int cols, int hGap, int vGap)
		//rows 그리드의 행 수, 디폴트 1
		//cols 그리드의 열 수, 디폴트 1
		//hGap 좌우 컴포넌트 사이의 수평 간격, 픽셀단위, 디폴트 0
		//vGap 좌우 컴포넌트 사이의 수직 간격, 픽셀단위, 디폴트 0
		
		grid.setVgap(5);

		Container c = getContentPane(); 
		c.setLayout(grid); 
		c.add(new JLabel(" 이름")); 
		c.add(new JTextField("")); 
		c.add(new JLabel(" 학번")); 
		c.add(new JTextField("")); 
		c.add(new JLabel(" 학과")); 
		c.add(new JTextField("")); 
		c.add(new JLabel(" 과목")); 
		c.add(new JTextField("")); 
		
		setSize(300, 200);	// 프레임 크기 300×200 설정 
		setVisible(true);	// 프레임을 화면에 출력
	}

	public static void main(String[] args) { 
		new GridLayoutEx(); 
	}
}
