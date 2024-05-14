package close;

import java.sql.*;//Connection,Statement,ResultSet

public class Sample2 {
	public static void main(String [] args) {
		Connection conn=null; 
		//null 넣는 이유는 회선 연결하고 종료 처리 구조 만들때 에러가 날수 있으니까 초기값을 잡음 틀을 잡기 위해서
		Statement stmt=null;
		ResultSet rs=null;
		
		String url="jdbc:mysql://127.0.0.1:3306/sample";
		String db_id="root";
		String db_pw="iotiot";
		String sql="select * from student;";
		
		try {
			conn=DriverManager.getConnection(url,db_id,db_pw);
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			//Statement의 Query 전송 메서드들,용도에 따라 맞게 사용해야 한다.
			//stmt.execute(sql); reutrn boolean; resultset의 존재여부에 따라 true/false 처리
			//stmt.executeQuery(sql);return resultset; 결과화면을 반환
			//stmt.executeUpdate(sql);return int; 변화한 수를 반환
			//회선 연결 처리 부분
			while(rs.next()) {
				//필드 명으로 테이블 갖고 오는 것
				//int 값이 지만 html 마크업 하기 때문에 String 타입으로 갖고온다
				//계산 할 경우 parseInt로 적용 해서 계산
				String num=rs.getString("num");
				String name=rs.getString("name");
				String math=rs.getString("math");
				String kor=rs.getString("kor");
				String eng=rs.getString("eng");
				String sum=rs.getString("sum");
				System.out.println(num+"\t"+name+"\t"+math+"\t"+kor+"\t"+eng+"\t"+sum);
			}
			System.out.println("<h1>접속을 환영합니다.</h1>");
		}catch(Exception e) {
			System.out.println("접속 중 오류발생 : "+e);
		}finally {
			//회선 종료 처리도 try-cath안에 제작해야함.
			try {
				//회선 종료 처리 부분
				if(rs!=null)rs.close();
				if(stmt!=null)stmt.close();
				if(conn!=null)conn.close();
			}catch(Exception ex) {
				System.out.println("접속 해제 중 오류발생: "+ex);
			}
		
		}
		
	}
	
	
}
