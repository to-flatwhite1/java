package var;

public class INT {
	public static void main(String [] args) {
		//byte : 바이트, 아주 작은 수가 저장될 수 있는 타입
		//short : 숏,작은 수가 저장 될 수 있는 타입
		//int : 인티저, 일상적인 수가 저장될 수 있는 타입 *x5,000,000
		//long: 롱,아주 큰 수가 저장 될 수 있는 타입
		
		byte a;
		a=127;
		System.out.println(a);
		
		short b;
		b=10000;
		System.out.println(b);
		
		int c;
		c=21000000;
		System.out.println(c);
		
		int abc;//변수 이름 앞에 첫 문자는 숫자를 적으면 안된다.
		int d=1000;
		
		long x;
		x=310000000l; //인티저로 다 받아들이기 때문에 l,L붙여주면 LONG으로 인식
		System.out.println(x);
	}
}
