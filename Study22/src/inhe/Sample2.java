package inhe;

public class Sample2 {
	public static void main(String [] args) {
		Child C=new Child();
	}//main 끝
}//class 끝
//상속: 클래스간에 부모 클래스로부터 내용들을 자식 클래스가 이어받는 문법
//자바에는 다중상속이 금지되어 있다.
//자식은 여럿이 존재할 수 있지만 한 클래스는 하나의 부모만 가질 수 있다.
//자식 클래스 만드는 방법 - 자식클래스이름 extends 부모클래스이름 :상속이 성립한다.
//상속이 성립하면 부모클래스가 가진 필드와 메서드를 이어 받는다.
//자식은 부모가 가진 필드와 메서드를 이용할 수 있지만, 부모는 자식의 구성물을 이용할 수 없다.
//자식객체는 부모가 들어갈 수 있는 변수에 들어갈 수 있지만
//부모객체는 자식이 들어갈 수 잇는 변수에 들어갈 수 없다
class Parent{
	int money=5000000;
	void work() {
		System.out.println("열심히 일합니다.");
	}
	Parent() {
		System.out.println("부모의 생성자 실행");
	}
	Parent(int a) {
		System.out.println("부모의 생성자 실행");
	}
}	
class Child extends Parent{
	String hobby="게임";
	//오버라이드 : 부모로부터 물려받은 메서드를 자식이 재정의하여 사용하는 방법
	//부모의 메서드랑 똑같은 걸 적은 뒤에 내용만 바꾼다.
	void work() {
		super.work();//오버라이드시 부모의 기능을 유지하고 싶다면 super.메서드();로 실행
		System.out.println("저는 건성건성 할껍니다..");
	}
	//자식이 객체가 되기 위해서는 부모의 조립된 모양이 필요하니
	//자식의 생성자를 호출하면 부모의 생성자가 먼저 실행된다.
	Child(){
		super(100000000);
		//부모의 생성자가 여러개라 그 중 하나를 골라야 하는 경우 super()를 이용한다.
		//부모의 생성자는 자식생성자보다 늘 먼저 실행되어야 하므로
		//자식 생성자의 가장 위에서 부모의 생성자를 골라야한다.
		System.out.println("자식의 생성자 실행");
		
	}
}

class Child2 extends Parent{
	
}