package e;

public class Op2 {
	public static void main(String [] args) {
		//논리 연산자 : true,false를 가지고 true, false를 계산하는 연산자
		// 한개만 적으면 전혀 다른 연산자이니 주의 *x5,000,000
		// && : ~이고 ~이다 and //앞과 뒤의 조건이 모두 true인 경우만 true
		// || : ~이거나 ~이다 or //앞과 뒤의 조건 중 하나라도 true인 경우 true
		boolean result;
		result=true&&false;
		System.out.println(result);
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
		
		String id="admin";
		String pw="1111";
		
		result=(id=="admin")&&(pw=="1112");
		System.out.println(result);
		
		//number가 3보다 작거나 5보다 큰지 확인하여 결과를 result에 저장하고
		//이를 출력하시오
		
		//number가 3보다 크고 6보다 작거나 같은지 확인하도록 아래 코드를 바꾸시오
		boolean result2;
		int number=7;
		result2=(6>=number)&& (number>3); 
		System.out.println(result2);
		
		
	}
}
