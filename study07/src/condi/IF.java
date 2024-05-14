package condi;

public class IF {
	public static void main(String [] args) {
		//조건문 if : 조건의 true, false여부에 따라 실행을 할지 말지 결정하는 문법
		//if(조건){조건이 true일 경우 수행할 명령;}
		//*5,000,000
		//if 문에 {}이 없는 경우 뒤에 처음으로 나오는 ;까지를 {}으로 본다.
		int a=10;

		System.out.println("if문 밖이므로 조건과 무관하게 무조건 실행");
		if (a!=10) {
			System.out.println("조건이 참이므로 실행 합니다.");
			}//if 끝
		//변수가 만들어지는 중괄호 안에서만 사용 가능
		//if-else 문
		//조건에 따라 어느 부분을 실행할지 결정하는 문법
		//if(조건){조건이 true일 경우 수행;}else{조건이 false일 경우 수행;}
		//절대로 두개가 동시에 실행되거나 아무것도 실행되지 않는 경우는 없다.
		a=104;

		if(a<100) {
			System.out.println("if-else의 조건이 true입니다.");}
		else {
			System.out.println("거짓");}
		System.out.println("if문의 {}밖은 조건과 무관하게 실행");
		
		//if-else if : 조건이 여러개인 경우 그 중 하나를 선택하여 수행하는 문장
		//조건은 위에서부터 순서대로 하나라도 true가 나오면 아래는 보지 않는다
		//if(조건){}else if (조건2)else if(조건3){}....
		a=0;
		if(a>1) {
			System.out.println("조건 1 만족");
		}else if(a>5) {
			System.out.println("조건 2 만");
		}
			
	}//main 끝
	//System.out.println("프로그램 종료지점 밖이므로 오류발생");
}//class 끝
