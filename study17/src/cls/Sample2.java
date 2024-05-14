package cls;

public class Sample2 {
	public static void main(String [] args) {

		//인스턴스 변수는 인스턴스를 거친 오브젝트를 통하지 않으면 접근할 수 없다.
		Object o1=new object();
		object o2=new object();
		
		System.out.println(o1.price);
		System.out.println(o2.price);
		//클래스는 설계도다
		//클래스는 필드,메서드,생성자를 가질 수 있다.
		//필드는 클래스 내부에 작성되어 조립된 객체가 가지는 속성을 저장할 수 있는 공간
		

	}//main끝
}//class끝


class Object{
	String name;	//상품명
	int price;			//가격
	String number="1";		//상품번호
	String category="찜기";	//상품분류
	boolean sale=true;		//판매개시여부
	int qty; 			//재고량
	String test;		//상품 설명
	String review;		//후기
	
}

class Shop{
	Object[] products;
}