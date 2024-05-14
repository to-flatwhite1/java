package method;

import java.util.Scanner; //다른 사람이 만든 클래스를 가져올때 import해서 갖고 오기

public class Sample3 {
	public static void main(String [] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("num1에 저장할 숫자를 입력해 주세요.");
		int num1=scan.nextInt();
		System.out.println("num2에 저장할 숫자를 입력해 주세요.");
		int num2=scan.nextInt();
		System.out.println("num3에 저장할 숫자를 입력해 주세요.");
		int num3=scan.nextInt();
		
		Exam e;
		e=new Exam();
		int result=e.sum(num1,num2,num3);//()괄호안에 데이터가 들어가야 함
		System.out.println(result+"이 결과 입니다.");
		e.check();
	}//main 끝
}//class 끝
class Exam{
	//가급적 매개 변수 명과 필드명을 같은 이름을 쓰지 맙시다.
	//만약 같은 이름을 꼭 사용해야 하는 상황이 있다면 필드명 앞에 this. 필드명의 방법으로 매개변수와 구별
	int a;
	int sum(int a,int b,int c) {
		System.out.println("두 수를 더하면 다음과 같습니다.");
		//매개변수로 전달된 데이터는 안써도 상관없다.
		this.a=a; //this는 지금 보고 있는 설계도 Exam 
		System.out.println(a+b+c);
		return a+b+c; 
		//return a+b+c; return뒤에 return도 실행 불가
		//System.out.println("return이후에는 다른 명령 불가");
	}
	void check() {
		System.out.println("a내부의 값:"+a);
		//void는 return을 적으면 오류난다
		//void 타입은 반환 데이터가 없어 변수에 저장 불가
	}
class Scanner{
	
}	
}
