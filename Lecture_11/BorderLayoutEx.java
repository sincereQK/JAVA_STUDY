//예제 9-4 : BorderLayout 배치관리자를 사용하는 예

//BorderLayout 배치관리자를 사용하여 컨텐트팬에 다음과 같이 5개의 버튼 컴포넌트를 삽입하라

import javax.swing.*;
//버튼 체크박스 라디오버튼 슬라이더 텍스트필드 리스트 덱스트영역 등 다양한것이 스윙 컴포넌트에 속해있음
import java.awt.*;
//native 운영체제의 GUI컴포넌트의 도움을 받아 작동
//배치 관리자 대표 유형 4가지들은 awt패키지에 구현되어있다.
//FlowLayout BorderLayout GridLayout 배치관리자 사용 안함

public class BorderLayoutEx extends JFrame { 
	public BorderLayoutEx() { 
		setTitle("BorderLayout Sample"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		//컨탠트팬을 알아내는 역할

		c.setLayout(new BorderLayout(30, 20)); //hgap(수평간격) 30 픽셀	vgap(수직간격) 20픽셀
		c.add(new JButton("Calculate"), BorderLayout.CENTER); //버튼생성 
		c.add(new JButton("add"), BorderLayout.NORTH); //add버튼의 위치는 북쪽입니다.
		c.add(new JButton("sub"), BorderLayout.SOUTH); 
		c.add(new JButton("mul"), BorderLayout.EAST); 
		c.add(new JButton("div"), BorderLayout.WEST);
		
		setSize(300, 200); // 프레임 크기 300×200 설정 
		//setSize(300, 400);	// div Calculate mul 사이즈만 상하로 늘어남
		//setSize(500, 200);	// add Calculate sub 사이만 좌우로 늘어남
		setVisible(true); // 프레임을 화면에 출력
	}

	public static void main(String[] args) { 
		new BorderLayoutEx(); 
	}
}
