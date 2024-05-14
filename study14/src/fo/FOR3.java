package fo;

public class FOR3 {
	public static void main(String [] args) {
		//break : 제어문이 가지고 있는 동작을 정지시키는 효과
		//continue: 제어문이 가지고 있는 동작을 처음으로 돌아가는 효과
		// continue가 발생하면 그 아래부분이 동작하지 않는 효과가 있다.
		for(int i=0; i<10; i++) {
			
			if(i==2) {
				continue;//시작점으로 다시 돌아감
			}System.out.println(i);
		} System.out.println("반복문의 외부에서는 break의 영향을 받지 않습니다.");
	
	//while : {} 중괄호 내부의 내용을 반복해서 수행하는 제어 문법
	//while(조건){반복해서 수행할 문장;}
	//do{반복해서 수행할 문장;}while(조건);
	//do-while은 조건이 거짓일지라도 한번은 무조건 실행하도록 하는 기법이다.
		int a=3;
		do{
			System.out.println("반복중.."+a);
			a--;
		}while(a>1);
	}//do while 
}

