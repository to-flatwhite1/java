package fo;

public class FOR {
	public static void main (String [] args) {
		//for 문: {}내부의 내용을 반복해서 수행 해주는 문법
		/* for (시작점; 조건; 증감식 ){반복해서 수행할 문장;}
		 
		 */
		//반시계 방향
		//전역에 기준점이 마련된 경우 for 문 내부에서 변수를 똑같은 이름으로 만들면 안된다.
		int i=5;
		for(i=0;i<3;i++) {
			i=1;
			System.out.println("반복수행중.."+i);
			//시작점을 먼저 읽고 조건식으로 가서 읽고 조건이 맞으면 출력 후 증감식으로 올라가서 다시 시작점 읽기...
		}//실행(출력)이 끝나면 ++로 넘어감
		System.out.println("반복이 종료된 시점의 i값 :"+i);
	}
	

}
