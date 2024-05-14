package cla;

public class Sample1 {
	public static void main(String [] args) {
		Test t;
		t=new Test(50);
		
		int number=5;
		int value=t.method(3,number);
		System.out.println("결과값:"+value);
		System.out.println("필드 내부 값: "+t.field);
		
		//객체를 3개 만들어서 name,number,address 필드에 데이터 입력
		Test s1=new Test("홍길동",101,"서울시 노원구");
		Test s2=new Test("안예지",102,"서울시 동대문구");
		Test s3=new Test("김철수",103,"부산 중구");
		s1.show();//s1은 객체임
		s2.show();
		System.out.println(s3);//메모리 저위치에 살고 있는 객체 주소 출력해줌->오버라이드해서 return값으로 
		//해당하는 문자열이나 타입으로 출력하게 만들어줌
		}
}
//클래스(설계도)
//클래스는 필드,메서드,생성자를 가질 수 있다.(꼭 가져야하는 것은 아니다.)
class Test{
	//필드:변수,생성된 객체가 구별되기 위한 데이터를 저장하는 장소
	//클래스 내부에 변수를 만들어 놓으면 필드
	int field;
	String name;
	int number;
	String address;
	//메서드: 생성된 객체가 수행할 수 있는 동작
	//리턴타입 이름(매개변수제작){수행할 동작; return value;}★ X5,000,000
	//매개변수는 메서드 내부에서 변수처럼 사용이 가능하다.
	//매개변수가 있는 메서드는 반드시 해당 변수 타입에 맞는 데이터를 순서대로 주어야 실행 가능하다.
	//if문이나 for문 같은 제어문들은 메서드 내부에 작성해야 한다.
	int method(int a,int b) {
		int result=a+b;
		System.out.println("메서드 동작");
		if(true) {
			System.out.println("메서드 내부 if 문 실행");
		}
		return result;
		//return이 있는 메서드의 경우 return 아래로는 아무것도 시키면 안된다.
	}
	//생성자:객체를 조립하는 방법,객체를 생성해주는 기능
	//별도로 제작하지 않아도 기본적으로 들어가 있는 기능
	//개발자가 본인의 의도를 담아 제작법을 만들려 하는 경우 별도로 제작해 주어야 한다.
	//클래스이름(){추가적으로 실행할 내용;}
	//리턴타입이 적혀잇지 않은 클래스와 이름이 똑같은 메서드처럼 생겼다.
	//생성자의 용도:필드에 초기 데이터를 입력하거나 객체를 다른 형태로 조립할 때 사용
	//무조건 단 한번 객체가 조립될 때 실행된다.★x5,000,000
	Test(){
		field=100;//필드의 초기 데이터
		System.out.println("의도를 잘 담았음");
	}
	Test(int a){
		field=a;
		System.out.println("매개변수를 통해 필드를 초기화하는 생성자 실행");
	}
	Test(String n,int nm,String a){
		name=n;
		number=nm;
		address=a;
		System.out.println("데이터를 전부 입력받아 조립하는 생성자 실행");
	}
	//데이터 출력을 위한 메서드
	void show() {
		System.out.println(name+","+number+","+address);
	}
	//데이터 출력을 편하게 해주는 toString 오버라이드
	//오버라이드는 상속에서 굉장히 중요한 역할을 한다.
	public String toString() {
		return name+","+number+","+address;
	}
}
