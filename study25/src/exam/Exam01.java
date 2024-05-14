package exam;

public class Exam01 {
	public static void main(String [] args) {
		People[] school=new People[4];
		school[0]=new Student(15,"홍길동");
		school[1]=new Teacher(45,"김철수");
		school[2]=new Student(16,"왕건");
		school[3]=new Student(17,"이순신");
		for(int i=0; i<school.length; i++) {
			school[i].work();
		}
	}
}
//추상 클래스는 추상 메서드를 가질 수 있다.
//일반클래스는 추상 메서드를 가질 수 없다.
//추상 메서드를 가진 추상 클래스를 상속받은 일반 클래스는 반드시 추상 메서드의 몸통을 구현하여야한다.

//abstract class가 abstract 메서드를 가진 경우
//이를 상속 받은 class는 반드시 abstract메서드의 몸통을 구현하여야 한다.
abstract class People{
	int age;
	String name;
	
	void show() {
		System.out.println("age의 값 :"+age);
		System.out.println("name의 값 :"+name);
	}
	//메서드에서 필드값 넣으면 메서드 동작할때 ()치면 필드값 출력 됨
	People(int num ,String str){
		age=num;
		name=str; 
	}//생성자 매개변수를 만들어 조립할때 () 변수의 값을 입력하면 됨
	People(){
		
	}//일반생성자
	abstract void work();
}
	

class Student extends People{
	Student(int num,String str){
		super(num,str);
	}
	int kor;
	int eng;
	int math;
	
	void input(int[] arr) {
		kor=arr[0];
		eng=arr[1];
		math=arr[2];
	}//Studnet만 수행할수 있는 메서드
	

	
	void show() {
		super.show();//부모것도 갖고 올때 super. 같이 써주기
		//super(a,b)는 생성자임
		System.out.println("국어 점수:"+kor);
		System.out.println("영어 점수:"+eng);
		System.out.println("수학 점수:"+math);
	}//오버라이드
	void work() {
		System.out.println("공부합니다.");
	};
	
}

class Teacher extends People{
	Teacher(int a, String b){
		super(a,b);
	}
	String subject;
	void work() {
		System.out.println("수업합니다.");
	}
}