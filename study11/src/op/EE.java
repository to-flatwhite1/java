package op;

public class EE {
	public static void main(String[] args) {
		//이항연산자
		//	산술연산자 :+, -, *, /, %
		//	계산의 결과가 특정한 값으로 표현된다.
		int a=10;
		
		int b=4;
		int result;
		result=a+b;
		
		System.out.println(a+"+"+b+"는 "+result+"입니다.");
		
		result=a-b;
		System.out.println(a+"-"+b+"는 "+result+"입니다.");
		result=a*b;
		System.out.println(a+"*"+b+"는 "+result+"입니다.");
		result=a/b; //int 기반의 나누기는 소수점을 제외한 몫을 계산한다.
		System.out.println(a+"/"+b+"는 "+result+"입니다.");
		result=a%b;
		System.out.println(a+"%"+b+"는 "+result+"입니다.");
		

		
		
	}
	
}
