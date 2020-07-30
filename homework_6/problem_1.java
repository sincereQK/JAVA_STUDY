
import java.util.StringTokenizer;

public class problem_1 {
	public static void main(String[] args) {
		
		String aaa = "냉장고,세탁기,에어컨,TV,오디오";
		StringTokenizer aa = new StringTokenizer(aaa,",");
		
		System.out.println(aa.countTokens());
		
		while(aa.hasMoreTokens()) {
			System.out.println(aa.nextToken());
		}
		
		System.out.println(aa.countTokens());		
	}
	
}
