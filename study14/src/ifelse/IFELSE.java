package ifelse;

public class IFELSE {
	public static void main(String [] args) {
		/*if(조건1){조건이 true 일 경우 수행 할 문장;
		 	}else if(조건2){
		 	조건1이 false 이고 조건 2가 true 일 경우 수행할 문자;
		 	}else{
		 	위쪽에 나온 모든 조건이 거짓이 경우 수행되는 문장;
		 	}
		 	
		 * 
		조건 : 계산의 결과가 true 또는 false로 나오는 것
		/*5,000,000 중요 IF-ELSE-IF 문의 조건은 위에서부터 순서대로 판단하고.
		 	하나라도 TRUE가 나오는 순간 그 아래는 무시한다.
		 	조건은 좁은 범위부터 차차 넓어지도록 작성하지 않으면 아래쪽이 영원히 실행되지 않는다.
		*/
		int score=96;
		if(score>95) {
			System.out.println("A+학점입니다.");
		}else if(score>90){
			System.out.println("A학점입니다.");
		}else {
			System.out.println("F학점입니다.");
		}
	}//main 끝
}
