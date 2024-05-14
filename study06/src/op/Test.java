package op;

public class Test {
	public static void main(String[] args) {
		//연산자 : 계산할때 사용하는 부호
		
		//단항연산자 
		//이항연산자 ex)3+5
		//삼항연산자 
		
		//산술연산자 : 계산의 결과가 특정한 값이 됨
		
		// + : 더하기 ,숫자와 문자를 더하면 접착 해준다.
		// - : 빼기 * : 곱하기 / : 나누기 
		// % : 나머지, 나누기를 수행한 이후 남는 값
		int a=10;
		int b=4;
		int result=a/b;
		System.out.println(result);
		
		//비교연산자 : 계산의 결과가 true 또는 false이 됨
		// < : 왼쪽이 오른쪽보다 작은지 확인
		// <= : 왼쪽이 오른쪽보다 작거나 같은지 확인
		// == : 왼쪽과 오른쪽이 똑같은지 확인, = 구별 주의
		// != : 왼쪽과 오른쪽이 다른지 확인
		boolean c = a>b;
		System.out.println(c);
		
		//비트 연산자 : 이진수로 변환한 뒤 자릿수별로 값을 계산
		//논리연산자와 혼동하지 않도록 주의 ★x5,0000,0000
		
		//& : 자릿수별로 둘다 1이면 1,하나라도 0이면 0
		//| : 자릿수별로 둘중 하나라도 1이면 1 둘다 0이면 0
		//^ : 자릿수별로 둘이 같으면 0 다르면 1 
		a=5;
		b=3;
		result=5&3;
		System.out.println(result);
		a=5;
		b=3;
		
		//논리연산자 : ★5,000,0000
		//true 또는 false를 이요하여 논리적인 결과를 계산하는 연산자
		// && :앞과 뒤가 모두 true이어야 true ~이고 ~이다
		// || : 앞과 뒤 중 하나라도 true면 true ~이거나 ~이다
		c= a>b || a==b;
		System.out.println(c);
		/*
		 true && true true
		 true && false false
		 false && true false
		 false && false false
		 true || true true
		 true || false true
		 false || true true
		 false || false false
		 */
		
		 //시프트 연산자 : 이진수로 바꿔서 자릿수에 변화를 주어 값을 계산하는 연산
		// A<<B : A를 이진수로 변환한 뒤 왼쪽으로 B만큼 자릿수 이동
		// A>>B : A를 이진수로 변환한 뒤 오른쪽으로 B만큼 자릿수 이동
		a=3;
		result=a<<2;
		System.out.println(result);
		
		//삼항연산자 : 항이 3개가 있어야 계산할 수 있는 연산자
		//조건(조건이란: 참 또는 거짓임)?참일경우:거짓일경우;
		result=true?1:2;
		System.out.println(result);
		
		int d=0;
		String msg;
		msg =(d>0)?"양수":(d==0)?"영":"음수";
		System.out.println(d+"는"+msg+"입니다.");
	}
}
