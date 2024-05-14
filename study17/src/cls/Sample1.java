package cls;

public class Sample1 {
	public static void main(String [] args) {
		
	//main 끝
	//클래스 : 객체를 조립하는 설계도
	//*X5,000,000
	//클래스는 필드, 메서드,생성자를 가질 수 있다.
	//1.필드 : 객체간 구별을 위한 데이터(속성)를 저장 할 수 있는 공간
	//2.메서드: 객체가 수행할 수 있는 동작
	//3.생성자:객체를 조립하는 방법
	//클래스는 객체로 조립하여서 사용해야한다.
	//객체 조립방법 : new 클래스 이름();
	//조립된 객체는 변수에 담아야 사용하기 편하다.
	int a=15;
	Test t;
	t=new Test();
	System.out.println(a);
	System.out.println(t);
	
	//클래스 하나로 객체는 여러개 제작할 수 있고
	//제작된 객체는 서로 영향을 받지 않는다.
	Test t1;
	Test t2;
	Test t3;
	t1=new Test();
	t2=new Test();
	t3=new Test();
	
	t1.name="김철수";
	t2.name="홍길동";
	t2.name="안예지";
			
	}
	
	
}//Sample1종료
//class 제작법 : 같은 패키지 내부에서는 한번 사용한 클래스명을 다시 사용하지 않도록 주의
//class 이름{}
//클래스는 다른 클래스 내부에 만들어도 되고 밖에 만들어도 되지만
//클래스를 다른 클래스 내부에 만들면 처음에 공부하기 어려워진다.

class Test{
	//필드 : 통상적으로는 변수로 제작한다.
	//객체가 가질 수 있는 다른 객체와 구별되는 데이터(속성)를 저장할 공간
	String name;
	int number;
	}//Test종료