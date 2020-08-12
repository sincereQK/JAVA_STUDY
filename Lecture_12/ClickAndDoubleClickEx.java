//예제 10-10 : 더블클릭 시 컨텐트팬의 배경색 변경
//더블클릭할 때마다 컨텐트팬의 배경색을 랜덤하게 변경한다.

// 마우스 이벤트
// 사용자의 마우스 조작에 따라 발생하는 이벤트 총 8가지 경우가 있음

//현재 이예제에서 사용되는 이벤트는 mouseClicked	 
//마우스로 컴포넌트를 클릭하였을때 이벤트가 발생

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ClickAndDoubleClickEx extends JFrame {
	public ClickAndDoubleClickEx() {//생성자
		setTitle("Click and DoubleClick 예제"); //제목 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// 윈도우창의 x 클릭시 프로그램을 완전히 종료

		Container c = getContentPane(); //프레임에 연결된 콘텐트 팬을 얻음
		c.addMouseListener(new MyMouseListener()); //마우스 리스너를 컴포넌트에 등록
		setSize(300,200); //사이즈 설정
		setVisible(true); // 출력
	}

	class MyMouseListener extends MouseAdapter { 
		//마우스 어뎁터를 사용 
		// 이벤트 리스너 구현에 따른 부담을 해소 하기 위하여 사용 
		//리스너 작성시 추상메소드들을 모두 구현해야하기에는 부담이 됨
		public void mouseClicked(MouseEvent e) { 
			if(e.getClickCount() == 2) { //클릭카운트가 2번 즉 더블 클릭
				int r = (int)(Math.random()*256); 
				int g = (int)(Math.random()*256); 
				int b = (int)(Math.random()*256); 
				Component c = (Component)e.getSource(); 
				c.setBackground(new Color(r,g,b)); 
			} 
		} 
	} 
	public static void main(String [] args) { 
		new ClickAndDoubleClickEx(); 
	}
}
