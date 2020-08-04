//예제 7-4 : Iterator를 이용하여 Vector의 모든 요소를 출력하고 합 구하기
//예제 7-1의 코드를 Iterator<Integer>를 이용하여 수정하라.

import java.util.*;

public class IteratorEx { 
	public static void main(String[] args) { 
		// 정수 값만 다루는 제네릭 벡터 생성 
		Vector<Integer> v = new Vector<Integer>(); 
		v.add(5); // 5 삽입 
		v.add(4); // 4 삽입
		v.add(-1); // -1 삽입 
		v.add(2, 100); // 4와 -1 사이에 정수 100 삽입
		
		// Iterator를 이용한 모든 정수 출력하기 
		Iterator<Integer> it = v.iterator(); //iterator() 메소드 : iterator 객체 반환 | iterator 객체 얻기
		while(it.hasNext()) { //이터레이터 객체 it 에 다음요소 가있다면 true를 반환
			int n = it.next(); 	//n에 it의 다음요소를 반환 합니다.
			System.out.println(n); //n울 츌력합니다.
		}	// 이과정은 it에 다음요소가 없을떄 즉 it의 전부를 출력할떄 까지 지속합니다.
		// Iterator를 이용하여 모든 정수 더하기 
		int sum = 0; 
		it = v.iterator(); // Iterator 객체 얻기 
		while(it.hasNext()) { //Iterator 객체 it 에 다음요소 가있다면 true를 반환
			int n = it.next(); //n에 it의 다음요소를 반환 합니다.
			sum += n; // sum에 n 값을 더합니다.
		} 
		System.out.println("벡터에 있는 정수 합 : " + sum);
	}
}
