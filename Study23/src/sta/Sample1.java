package sta;

public class Sample1 {
	public static void main(String[]a) {
		Sample2.test();
	}
	
	static void test() {
		System.out.println("test 실행");
	}
}
class Sample2{
	//static이 붙어 있으면 객체 없이 설계도만 가지고 뭔가 하는 거다
	int n_field;
	static int s_field;//static 설계도의 메모영역
	//static으로 선언된 변수는 객체 없이 클래스만으로 동작 가능하며
	//객체를 통해 접근하더라도 객체와는 아무 상관이 없다.
	
	//static으로 선언된 메서드는 객체 없이 클래스만으로 동작 가능하다.
	//설계도가 수행하는 동작으로 객체와는 아무 상관이 없다.
	static void test() {
		System.out.println("다른 클래스 안의 test 실행");
	}
}