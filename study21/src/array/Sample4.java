package array;

public class Sample4 {
	public static void main(String[] args) {
		Object a=new Student("테스트",111);
		//배열: 여러개의 데이터를 index로 구분하여 하나의 변수에 저장하는 기법
		//배열이 생성되면 내부 데이터의 수를 length라는 변수에 저장한다.
	

		Student[] arr=new Student[4];
		//객체 타입의 배열을 제작하는 경우 위 코드는 단순히 칸만 나누어 둔다
		
	
		arr[0]=new Student("홍길동",106);
		arr[1]=new Student("김철수",107);
		arr[2]=new Student("이순신",108);
		arr[3]=new Jungsu("이영준",109);
		//배열 내부의 모든 데이터를 순서대로 읽는 for문
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
class Student{
	String name;
	int number;
	public String toString() {
		return "이름: "+name+",번호: "+number;
				
	}
	Student (String a,int b){
		name=a;
		number=b;
	}
}
class Jungsu extends Student{
	Jungsu(String a,int b){
		super(a,b);
	}
}
