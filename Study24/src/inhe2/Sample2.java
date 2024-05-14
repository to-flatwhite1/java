package inhe2;

public class Sample2 {
	public static void main(String [] args) {
		//GrandParent gp=new GrandParent(); 추상 클래스이므로 객체 생성불가
		GrandParent gp;//객체를 만들 수 없지만 변수타입으로 사용은 가능
		GrandParent p=new Parent();
		p.run();
	}
}
//추상클래스는 객체로 조립할 수 없다. 객체는 없지만 변수는 만들 수 있다.
//필드,메서드,생성자를 가질 수 있지만 자기가 직접 객체를 만들 수 없어 직접 사용 불가능
//추상 클래스는 추상 메서드를 가질 수 있다.
//추상 메서드: {}부분을 가지지 못하는 메서드
//추상 메서드 제작 방법: abstract 리턴타입 이름();
//추상 클래스가 추상 메서드를 가진 경우 
//->추상 클래스를 상속받은 일반클래스들은 반드시 추상 메서드의 몸통을 구현하여야 한다.
abstract class GrandParent{
	int money;
	void run() {
		System.out.println("할아버지의 메서드");
	}
	abstract void abs();//추상 메서드
}
class Parent extends GrandParent{
	String house;
	void run() {
		System.out.println("아버지가 오버라이드한 메서드");
	}
	//추상메서드에서 abstract를 제거하고{}를 달아주면 내용을 구현하게 된다.
	void abs() {
		System.out.println("할아버지의 추상메서드를 아버지가 구현함");
	}//일반메서드
}
class Child extends Parent{
	boolean computer;
	void abs() {
		System.out.println("할아버지의 추상메서드를 아버지가 구현한걸 오버라이드 함");
	}
}