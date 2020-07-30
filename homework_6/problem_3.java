
import java.util.Scanner;
import java.util.StringTokenizer;

public class problem_3 {

	public static void main(String[] args) {
		// 변수 선언
		String ccc=null;
		String cal_data=null;
		int result = 0;
		
        Scanner scan = new Scanner(System.in);      // 문자 입력을 인자로 Scanner 생성
        
        System.out.println("수식을 입력하십시오");
        
        ccc = scan.nextLine();            // 키보드 문자 입력
        
        System.out.println("입력된 수식은 다음과 같습니다. "+ccc);	// 입력 문자 출력
        
		StringTokenizer cc = new StringTokenizer(ccc,"-+",true);	// StringTokenizer 사용
		
		System.out.println("토큰갯수 : "+cc.countTokens());		// 토큰 갯수 출력
		
		while(cc.hasMoreTokens()) {	//토큰이 더이상 없을경우 while문을 나갑니다.
			cal_data = cc.nextToken();	// 첫번쨰에 nextToken 사용!
			System.out.println(cal_data+" 부호 나 숫자를 확인하십시오.");
			if(cal_data.equals("+")) { //기호가 + 일 경우 들어옵니다.
				System.out.println("덧셈을 합니다.");
				cal_data = cc.nextToken();	// 다음 값을 불러옵니다
				System.out.println(result+"+"+cal_data);
				result += Integer.parseInt(cal_data);	// 덧셈
			}
			else if(cal_data.equals("-")) {	// 기호가 - 일 경우 들어옵니다.
				System.out.println("뺄셈을 합니다.");
				cal_data = cc.nextToken();	// 다음 값을 불러옵니다.
				System.out.println(result+"-"+cal_data);
				result -= Integer.parseInt(cal_data);	//뺄셈
			}
			else {	// 처음 숫자를 결과에 집어넣습니다. 다시 들어오면 안됩니다.
				System.out.println("초기값 입니다.");
				result += Integer.parseInt(cal_data);
			}
			System.out.println("result = "+result);	// 정상적으로 작동했는지 확인
			//cal_data = cc.nextToken();
			//여기다 nextToken을 써도 문제없이 작동하나 Exception in thread "main" 문이 뜸
			//찾아보니 nextToken은 hasMoreTokens 다음에 사용해야 한다고 한다. 
			//왜냐하면 hasMoreTokens이 다음에 토큰이 있는지 확인하여 오류를 방지하기 위해서 이다.
			//그러므로 마지막에 nextToken을쓰면 NoSuchElementException가 뜨며 예외가 떳다고 나온다.
		}
		
		System.out.println("남은 토큰 갯수 : "+cc.countTokens());	// 남은 토큰 갯수 출력 : 0이어야 합니다.
		System.out.println("201702986 김민규");
    	scan.close();
	}

}
