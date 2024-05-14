package cla;

import java.util.*;

public class Sample2 {
	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력해 주세요");
		int num=sc.nextInt(); //사용자가 입력한 숫자를 num에 저장
		System.out.println("두번째 숫자를 입력해주세요");
		int num2=sc.nextInt(); //사용자가 입력한 두번째 숫자를 num2에 저장*/
		
		Cal c;
		c=new Cal();
		c.add(10,20,30
				);
		
		
	
	}//main 끝
}//class 끝
class Cal{
	//매개변수 : 메서드를 실행할 때 데이터를 주고 시켜야 하는 경우
	//	메서드 외부에서 데이터를 메서드 내부로 전달 할 경우 매개 변수를 사용한다.
	//	매개변수의 타입과 일치하는 데이터를 주지 않으면 동작을 시킬 수 없다.
	//	해당 데이터를 메서드 내부의 변수를 통해 전달해 주어야 한다.
	//리턴타입 이름(매개변수){실행 시 수행 할 문장;}
	void add(int a, int b) {
		System.out.println(a+b);
	}
	//리턴타입이 int 이고 숫자 두개를 받아 동작하며 받아온 수 두개를 곱해서 반환하는 메서드 제작
	//메서드를 통해 return 된 값은 변수에 담아 콘솔에 출력할 것
	
	int multi(int e,int d) {
		System.out.println("매개변수 두개를 받아 동작하는 add");
		System.out.println(e*d);
		return e*d;
	}
	//리턴타입과 이름이 똑같은 메서드를 매개변수의 수와 종류를 다르게 해서
	//다른 메서드처럼 사용하는 방법
	//"메서드 오버로드"*5,000,000
	void add(int a, int b,int c) {
		System.out.println("매개변수 세개를 받아 동작하는 add");
		System.out.println(a+b);
	}
}
