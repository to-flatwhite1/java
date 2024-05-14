package exam;

public class Sample2 {
	public static void main (String [] args) {
		Child c=new Child(99);
	}//main 끝
}//class 끝
class Parent{
	int number;
	Parent(){
		System.out.println("부모의 일반생성자");
	}
	Parent(int a){
		number=a;
		System.out.println("number를 초기화하는 부모의 생성자");
	}
	void setNumber(int a) {
		this.number=a;//this 필드 지칭 //this는 자기본인 super는 부모클래스
	}//이름이 setNumber이고 int타입의 데이터를 받아 number필드에 저장하는 void타입 메서드 제작
}//class Parent 끝

class Child extends Parent{
	Child(){
		System.out.println("자식의 일반생성자");
	}//Child 일반 생성자 -상속이 이루어지면 부모의 일반생성자가 발생된 이후 자식의 일반 생성자가 실행된다
	Child(int a){
		super(a);
		System.out.println("자식의 부모생성자 특정 생성처리");
	}//super()은 Parent(); 동일
}//Child 클래스가 Parent클래스를 상속받도록 지정한것임
