
import java.util.StringTokenizer;

public class problem_1 {
	public static void main(String[] args) {
		
		String aaa = "�����,��Ź��,������,TV,�����";
		StringTokenizer aa = new StringTokenizer(aaa,",");
		
		System.out.println(aa.countTokens());
		
		while(aa.hasMoreTokens()) {
			System.out.println(aa.nextToken());
		}
		
		System.out.println(aa.countTokens());		
	}
	
}
