package cla;

public class Sample3 {
	public static void main (String [] args) {
		Client c=new Client();
		c.ID="test";
		c.PW="1111";
		c.name="홍길동";
		String msg="이것도 영화라고 만들었냐";
		int score=1;
		int number=4567; //영화 고유 일련번호
		String data=c.datgul(score,msg,number);
		System.out.println("데이터베이스에 "+data+"를 입력했습니다.");
	}
}
class Client{
	String ID;//회원 아이디
	String PW;//회원 비밀번호
	String name;//닉네임
	
	String datgul(String dat, int star,int number) {
		System.out.println("다음 영화에 댓글이 달렸습니다. "+number);
		System.out.println("댓글내용:"+dat+",평점: "+star);
		return dat+", "+star;
	}
	//매개 변수의 순서 또는 수를 다르게 해서 다른 메서드처럼 쓰는 방법:메서드 오버로드
	String datgul(int star,String dat, int number) {
		System.out.println("다음 음식점에 댓글이 달렸습니다. "+number);
		System.out.println("댓글내용:"+dat+",평점: "+star);
		return dat+", "+star;
	}
}
//영화에 평점과 리뷰달아줘서 