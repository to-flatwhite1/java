package op2;

public class Op2 {
	public static void main (String [] args) {
		//산술 연산자 : 계산의 결과가 특정한 값으로 나오는 연산
		//+ : 더하기
		//- : 빼기
		//* : 곱하기
		// / : 나누기
		// % : 나머지
		
		//문자와 숫자를 더하면 둘이 이어붙인 문자열이 된다.	
		int a;
		int b;
		int result;
		
		a=5;
		b=9;
		result=a+b;
		System.out.println("계산결과는 "+result+"입니다.");
		System.out.println("가나다라마바사"+(a+b)+"입니다.");
		System.out.println("a"+(3+5));
		
		result=a-b;
		System.out.println(a+"-"+b+"="+result+"입니다.");
		//곱하기는 *를 사용합니다.영문 x는 문자라 연산에 사용할 수 없음
		result=a*b;
		System.out.println(a+"*"+b+"="+result+"입니다.");
		
		result=b/a;
		System.out.println(result);
		//int간의 나누기를 수행하면 결과값은 몫만 얻을 수 있다.
		
		//%는 나누기 계산에서 발생한 나머지를 구할 때 사용한다.
		result=b%a;
		System.out.println(result);
	}
}