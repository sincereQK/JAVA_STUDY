
import java.util.Scanner;
import java.util.StringTokenizer;

public class problem_2 {

	public static void main(String[] args) {
	
		String bbb = null;
		String cal_data = null;
		int sum = 0;
        Scanner scan = new Scanner(System.in);      // 문자 입력을 인자로 Scanner 생성
        
        System.out.println("수식을 입력하십시오");
        
        bbb = scan.nextLine();	// 키보드 문자 입력
        
        System.out.println("입력된 수식은 다음과 같습니다. "+bbb);		// 입력 문자 출력
        
		StringTokenizer bb = new StringTokenizer(bbb,"+");	// +를 분리합니다.
		
		System.out.println("토큰갯수 : "+bb.countTokens());
		
		while(bb.hasMoreTokens()) {	// 덧셈을 합니다.
			cal_data = bb.nextToken();
			System.out.println(sum+"+"+cal_data);
			sum += Integer.parseInt(cal_data);
			System.out.println(sum);
		}
		
		System.out.println("남은 토큰 갯수 : "+bb.countTokens());		

    	scan.close();
	}

}
