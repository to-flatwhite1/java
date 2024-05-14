package block;

public class Block {
	public static void main(String[] args) {
		//블락{} : 설계도의 영역을 나타내는 기호
		//블락 내부에서 만들어진 변수는 외부에서 사용 할 수 없다.
		//변수는 자신이 만들어진 블락을 벗어나는 순간 사라진다.
		int a;//숫자가 들어갈수 있는 이름a 상자를 만들어줘
		{
			
			a=1000;
			System.out.println(a);
		}//임의로 만든 블락의 끝
		a=1500;
		System.out.println(a);
		}
	
}
