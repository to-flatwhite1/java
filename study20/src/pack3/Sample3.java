package pack3;

public class Sample3 {
	public static void main(String [] args) {
		//객체를 만들어서 상품명이랑 가격을 입력한 뒤 객체의 show()를 실행해서 출력하시오.
		Product a;
		a=new Product();
		a.setName("바나나");
		a.setPrice(-1000);
		a.show();
		
		Product b;
		b=new Product();
		b.setName("딸기");
		b.setPrice(1000);
		b.show();
		
	}
}
class Product{
	private String name;

	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	private int price;
	public void setPrice(int price){
		if(price<0) {
			System.out.println("잘못된 물건값을 입력하셨습니다. 0으로 초기화 합니다.");
		}else {
			this.price=price;
		}
		
	}
	void show() {
		System.out.println("상품명:"+name+",가격:"+price);
	}
}
