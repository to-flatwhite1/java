package op;

public class Dan {
	public static void main(String [] args) {
		System.out.println("안녕하세요!");
		//단항연산자
		//	부정연산자 ! :값을 반전시키는 용도로 사용
		// 	증감연산자 ++,-- :값을 한단위 증가시키거나 감소 시킬 때 사용
		boolean b=!true;
		System.out.println(b);
		

		//++a 계산 우선 순위가 높음
		//증감연산자는 전위증감이냐 후위증감이냐에 따라 계산 우선순위에 차이가 있다.
		int i=3;
		int k=i;
		System.out.println("k값 :"+k);
		System.out.println("i값 : "+i);
		
		//상수는 연산이 불가 '파이널을 붙이면 상수' 절대로 바뀔수 없는 값
		final int a=15;
		System.out.println(a);
		//a++; 값을 바꿀수 없어서 증감 불가
		
		
	}
}
