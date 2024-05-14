package cond;

public class SWITCH {
	public static void main(String [] args) {
		//분기문 switch
		/*변수의 값에 따라 코드를 수행할 지점(시작의 위치)을 결정하는 문법 (
		(단위를 골라서 실행 할 수 는 없음)*/
		//switch(변수){case 값 : 수행할 문장;break}
		
		//swtich는 위치만 지정할 뿐 아래로 쭉 읽어내려가려는 성질이 남아있어서
		//선별작업에 사용하고자 한다면 break;명령을 통해 해당 성질을 막아야한다.
		//case 값이 중복되면 오류 발생
		//브레이크를 걸면 해당하는 코드만 실행
		int i =10;
		switch(i) {
		default : System.out.println("해당하는 값이 없습니다!");
		case 50 : System.out.println("50일 때 수행 확인!");
		case 100 : System.out.println("100일 때 수행 확인!");
		
		}
		System.out.println("스위치문 종료 후 실행");
		
		
	}//main 끝.프로그램 종료
}//class 끝
