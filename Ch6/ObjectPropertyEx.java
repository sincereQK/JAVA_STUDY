// object 클래스 
// java.lang 패키지에 포함
// 모든 클래스의 수퍼 클래스
// 모든 클래스에 강제 상속 	모든 객체가 공통적으로 가지는 객체의 속성을 나타내는 메소드 보유

//예제 6-1 : Object 클래스로 객체 속성 알아내기
//객체 레퍼런스만으로 객체의 클래스명, 해시코드 값, 객체의 문자열을 출력해보자

class Point {
	public int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "Point(" + x + "," + y + ")";
	}
	public boolean equals(Object obj) {
		Point p = (Point)obj;
		if(x == p.x && y == p.y) 
			return true;
		else 
			return false;
	}
}

public class ObjectPropertyEx {
	public static void print(Object obj) {
		System.out.println(obj.getClass().getName());	// 클래스이름
		System.out.println(obj.hashCode());	// 해시 코드 값
		// 해시코드란
		// 책에 index가 바로 hash 방식
		// 찾고자 하는 단어가 key가 될것이고. 그내용이 있는 곳을 가리키는 것이 index
		// obj라는 reference type data value를 10진수로 바꾼 값을 hash code 라고 한다.
		System.out.println(obj.toString());	// 객체를 문자열로 만들어 출력
		System.out.println(obj);	// 객체 출력
	}
		public static void main(String[] args) {
			Point p = new Point(2,3);
			print(p);
		}
}
