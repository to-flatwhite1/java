package exam;

import java.util.*;

public class Exam1 {
	public static void main(String [] args) {
		//for문을 이용해서 1~100까지 출력하는 프로그램을 제작해 보세요.
		//변수를 num,ber 두개 만들어서 1~100사이 숫자를 저장 해주세요.
		//위의 for문을 num~ber까지 출력하도록 변경 해보세요
		
		//이름이 Test인 클래스를 만들고
		//이름이 make인 String타입 메서드를 제작하시오
		//해당 메서드가 실행되면 console부분에 1~100까지를 출력하도록 제작하시오.
		//make()에 매개 변수를 두어 num~ber까지 반복하도록 변경하시오
		
		//리턴타입 void인 메서드를 Test내부에 제작하여
		//2~9사이의 숫자를 받아 해당 구구단의 단수를 출력하도록 제작하시오
		/*
		
		int i;
		for(i=num; i<=ber; i++){
			System.out.println(i);*/
		int num=46;
		int ber=95;
		Test a;	//class Test가 조립되서 들어갈 정도의 크기로 상자 a를 제작해주세요
		a=new Test();	//a상자에 Test설계도를 새로 조립해서 넣어주세요
		String s;	//문자열이 들어갈 수 있는 크기의 상자 s를 만들어줘
		s=a.make(num,ber);	//조립된 객체가 make동작을 실행하도록 시키고 그 결과를 s상자에 담아줘 
		System.out.println(s);	//상자s내부의 내용을 출력
		
		Scanner n=new Scanner(System.in);
		System.out.println("구구단을 출력합니다. 출력하실 단을 2~9사이 수로 입력해주세요");
		int number=n.nextInt();
		a.gugu(number);
		
	}//main끝
}//class 끝

class Test{
	String make(int num,int ber) {
		String str="안녕";
		//변수에 담아도되고 안담아도 되고 
		//return다음에 타입 해당하는 것을 입력하면 됨 String은 문자 그래서 안녕 넣음
		for(int i=num; i<=ber; i++){
			System.out.println(i);
		}//for문 끝
		return str;//return ""; 이것도 됨 
	}//make() 끝
	
	
	
	void gugu(int dan) {
			for(int i=1; i<=9; i++) {
				System.out.println(dan+"*"+i+"="+dan*i);
			}//for문 끝
		
	}//gugu()끝
	
}//Test Class 끝

