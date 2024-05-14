package var;

public class Sample {
	public static void main(String[] args) {
		//변수 제작법
		//타입 이름;
		int a;
		//int a; 이미 사용중인 이름은 사용할 수 없다.
		//int 123a; 이름은 숫자로 시작할 수 없다.
		//int a 123; 이름에는 띄어쓰기를 사용할 수 없다.
		//int_a_123;이름에는 특수문자 $하고 _둘 중 하나만 사용 가능하다.
		//int int; 이름에 예약어는 사용할 수 없다.
		//int A; 대소문자는 엄격하게 구분한다.
		//int 한글; 한글은 이름으로 쓸 수 있지만 가급적 사용 하지 말 것
		
		//변수의 초기화
		int b=10;//숫자가 들어갈수 있는 b의 데이터 상자를 만들어 주세요.
		//이름이 b이면서 10인 상자를 만들어주세요
		//초기 값을 잡아주는 행위
		System.out.println(b);//b 상자에 든거 알려줘
		int c=10;
		System.out.println(c);
		c=20;
		System.out.println(c);
		
		//상수의 사용 : 한번 값이 정해지면 변경할 수 없는 공간
		//final 타입 이름=초기값;
		//상수는 한번 값이 입력되면 변경할 수 없다.
		//경로값,시리얼넘버 지정 할 경우 많이 쓰인다.
		//실제 개발할때 많이 사용 하지 않는다.
		final int x=80;
		System.out.println(x);
	}
}


