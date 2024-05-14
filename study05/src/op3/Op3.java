package op3;

public class Op3 {
	public static void main(String[] args) {
		//비교연산자
		//값의 크고 작음을 비교, 계산의 결과는 true 또는 flase로 나온다.
		
		// < : 왼쪽이 오른쪽보다 작은지 확인
		// > : 왼쪽이 오른쪽보다 큰지 확인
		// <= : 왼쪽이 오른쪽보다 작거나 같은지 확인
		// >= : 왼쪽이 오른쪽보다 크거나 같은지 확인
		// == : 둘이 똑같은지 확인
		// != : 둘이 다른지 확인
		
		int a;
		int b;
		boolean result;
		a=5;
		b=3;
		result=3<a && a<7;
		System.out.println(result);
		
		//논리연산자 : 논리적인 판단을 진행하는 연산자
		// && : ~이고 ~이다
		// || : ~이거나 ~이다
		
		result=3>a || a>5;
		System.out.println(result);
	}
	
}
