package cond;

public class FOR {
	public static void main(String [] args) {
		//반복문 for : 특정 동작을 반복해서 수행하도록 하는 문법
		//for(시작점; 조건; 증감식){반복 수행할 문장;}
		//*5,000,000 중요 반시계 방향
		//반복 기준점을 잡고 기준점에 변화를 줘서 특정값이 될 때까지 반복해라
		System.out.println("반복 시작 전");
		int i;
		for(i=210000000; i>=3; i++) {
			System.out.println("반복중..."+i);
		}//for 끝
		System.out.println("반복 종료"+i);
		//for문은 조건까지 보고 출력하고 조건이 거짓이 될 때 까지 반복함
		
		//숫자가 들어갈 수 있는 i 상자에 0을 넣어
		//조건 자리에는 참 또는 거짓이 들어가야 함
	}//main 끝
}//class 끝
