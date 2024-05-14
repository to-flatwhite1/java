package exam;

public class Sample2 {
	public static void main(String [] args){
		Student a;
		a=new Student("안예지",100,500,800);//생성자에서 만든 변수의 괄호() 안에 값을 입력
		//System.out.println(a.name);//a안에 name 있는 내역 name 값을 갖고와서 보여줘
		//System.out.println(a.math);//a안에 있는 수학
		//a.show();
		System.out.println(a);//"a가 뭔데?.. 전기신호"출력이 나오는데  public String toString() 하면 return 뒤에 입력한 값이 나온다
	}
	
}
//이름과 수학성적,영어성적,국어성적을 가질 수 있는 학생객체를 만드려 한다.
//Student 클래스를 제작하여 필드를 작성하시오

//생성자를 이용하여 이름을 입력할 수 있도록 마련하시오
class Student{
	String name;
	int student_nubmer;
	int score;
	int math;
	int eng;
	int kor;
	
	Student (String n, int a, int b, int c){
		name=n;//=오른쪽에 있는 걸 왼쪽에 넣어줘
		math=a;
		eng=b;
		kor=c;
		
	}
	//생성자:리턴타입이 없고 이름이 클래스와 똑같은 메서드처럼 생겼다. 타입 이름:변수를 만들어주세요
	//객체를 만들때는 생성자 중 하나만 선택해서 조립하게 된다.
	Student (String str){
		name=str;
	}
	/*void show() {
		System.out.println("이름:"+name+",수학:"+math+",영어:"+eng+",국어:"+kor);
	}*/
	
	//오버라이드:기존에 있던 기능을 재정의해서 사용하는 기법
	//클래스 내부에 toString()을 재정의하면 객체를 출력시 주소가 아니라 해당 내용을 출력한다.
	public String toString() {
		return "이름:"+name+",수학:"+math+",영어:"+eng+",국어:"+kor;
	}
}

