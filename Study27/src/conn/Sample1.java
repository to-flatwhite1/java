package conn;
import java.sql.*;//sql을 이용할 때 필요한 데이터 규격들이 들어 있어요

public class Sample1 {
	public static void main(String [] args) {
		//jdbc가 있어야 데이터베이스와 통신이 가능하다.
		Connection conn;// 접속 회선
		Statement stmt; // 쿼리문을 전송하기 위한 규격
		ResultSet rs;//select문의 결과를 받아오기 위한 규격
		
		String url="jdbc:mysql://127.0.0.1:3306/sample"; //접속 위치
		String db_id="root";						//접속 아이디
		String db_pw="iotiot";						//접속 비번
		//String sql="select * from student;";
		
		
		String sql="insert into student (name,kor,math,eng,sum)";//데이터베이스로 입력
		sql+="values ('안예지',50,50,50,10);";
		try {
			conn=DriverManager.getConnection(url,db_id,db_pw);//회선 가져옴 sampledatebase 접속
			stmt=conn.createStatement();
			stmt.execute(sql);
			//rs=stmt.executeQuery(sql);
			System.out.println("접속 이상 없음!");
			
			//rs.next();한줄의 데이터를 읽어오는 명령어 (sql에서 table에 있는 내용 한줄씩 가져오기)
			
			
		
			//rs.next()의 횟수와 rs.getString(int)의 값을 조절해서 원하는 정보를 추출해보세요
			//한줄 데이터 셀의 위치를 int 자리에 순번을 숫자로
			
			
			
		}catch(Exception e) {
			System.out.println("접속중 오류발생 : "+e);
		}
	}
}
