package generic;

public class Sample3 {
	public static void main(String[] args) {
		//제네릭 : 클래스의 특정 문자를 원하는 타입으로 변환하는 기법
		//자료형을 마음대로 조절할 수 있어서 편리
		Normal n=new Normal("스트링");
		String result=n.show();
		System.out.println(n.a);
		//n.a=15;	객체를 사용하는 입장에서는 class의 수정없이 타입을 변경할 수 없다.
		Gene<Normal> g=new Gene<Normal>(n);
		Normal result2=g.show();
		System.out.println(g.a);
	}
}

class Normal{
	String a;
	Normal(String b){
		a=b;
	}
	String show() {
		return a;
	}
}
class Gene<T>{
	T a;
	Gene(T b){
		a=b;
	}
	T show() {
		return a;
	}
	
}