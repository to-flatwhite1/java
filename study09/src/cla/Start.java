package cla;

public class Start {
	public static void main(String [] args) {
		Student a = new Student(); //a상자에다가 new student 조립해줘
		

		a.number=1;
		a.name="안예지";
		a.phone="010-1234-5678";
		Student b = new Student();
		b.name="똘이";
		System.out.println("이름은"+a.name);
		System.out.println("이름은"+b.name);
		System.out.println(a.check);
	}//main 끝
}//class 끝
class Student{
	int number; //학번을 저장할 공간
	String name;//이름을 저장할 공간
	String phone;//연락처를 저장할 공간
	boolean check; //출석여부를 저장할 공간

}