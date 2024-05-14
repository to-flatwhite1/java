package dan;

public class Start {
	public static void main(String [] args) {
		System.out.println("실행확인!");
		//단항연산자 : 항이 단독으로 사용가능한 연산자
		// !항 : true는 false로 false는 true로 값을 반전
		boolean B=false;
		boolean C=!B;
		System.out.println(C);
		
		//증감연산자 : 단항의 데이터를 한단위 증가 또는 감소 시키는 효과
		// ++ : 항의 값을 한단위 증가
		// -- : 항의 값을 한단위 감소
		//증감연산자는 전위증감과 후위증감이 약간 다르게 동작한다."x5.000.000"
		//=대입연산자와 함께 쓰일때 다르게 동작한다.
		int a=5;
		
		++a;
		System.out.println(a);
		
		//A=A+B
		//A=A-B
		//A=A*B
		int i=5;
		i*=2;
		System.out.println(i);
		
		char c='가';
		int number=c;
		System.out.println(number);
		
		//강제 형변환(캐스팅) : 다른 타입의 자료를 저장하기 위해 타입을 강제변경
		float f=1.234f;
		int g;
		g=(int)f;
		System.out.println(g);
		}//main 끝
}//class 끝
