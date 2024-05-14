package e;

public class Op3 {
	public static void main(String [] args) {
		//중요도 하
		//비트연산자: 계산의 결과가 특정 값을 보이도록 연산
		//수를 이진수로 변환하여 자릿수별로 계산
		// & : 자릿수가 모두 1이면 1 하나라도 0이면 0
		// | : 자릿수중 하나라도 1이면 1, 모두 0이면 0
		// ^ : xor,(익스클루시브 오어) 자릿수가 서로 다르면 1, 같으면 0
		int a=3;
		int b=10;
		int result=3^5;
		System.out.println(result);
		
		//2진수로 변환한 값을 확인하는 방법
		int number=9;
		String data;
		data=Integer.toBinaryString(number);
		System.out.println(data);
		
		// 시프트 연산자
		// 이진수로 변환해서 자릿수를 변화시키는 방법
		// A<<B : A를 이진수 변환해서 왼쪽으로 B칸 자릿수 증가
		// A>>B : A를 이진수 변환해서 오른쪽으로 B칸 자릿수 감소
		result=a<<b;
		System.out.println(result);
		
		//삼항연산자
	}
}
