//예제 11-14 : JSlider로 슬라이더 컴포넌트를 만들고 모양을 제어하는 예

import javax.swing.*;
import java.awt.*;

public class SliderEx extends JFrame {
	public SliderEx() {
		setTitle("슬라이더 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 200, 100);
		//JSlider slider = new JSlider(JSlider.VERTICAL, 0, 200, 100);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(50);
		slider.setMinorTickSpacing(10);
		
		c.add(slider);
		setSize(300,100);
		//setSize(300,300);
		setVisible(true);
	}
	public static void main(String [] args) {
		new SliderEx();
	}
}