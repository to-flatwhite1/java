package server;

import java.net.*;
import java.io.*;


public class WebServer {
	public static void main(String[] args) {
		try {
			ServerSocket srvr = new ServerSocket(1234);
			System.out.println("서버정보 : "+ srvr.getInetAddress().getLocalHost());
			System.out.println("클라이언트 접속 대기중...");
			while(true) {
				Socket socket=srvr.accept();
				System.out.println("클라이언트 접속 확인!");
				BufferedReader in=new BufferedReader(new InputStreamReader(socket.getInputStream()));	//들어오는 데이터를 읽는 변수
				BufferedWriter out=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));	//
				//들어오는 데이터를 서버에 바로 입력되지 않게 영역에 전체 데이터를 임시로 모아 놓을 공간을 Buffer라고 한다.
				String s;	//태그를 포함 내용물의 변수
				
				//input이 있을 시 빈 공백에 대한 처리
				while((s=in.readLine())!=null) {
					System.out.println(s);
					if(s.isEmpty()) {
						break;
					}
				}
				
				//출력부분
				out.write("HTTP/1.0 200 OK\r\n");	//200코드는 내용이 정상 작동 한다는 표시,
				//	\r = 케리지리턴, \n = 줄바꿈 , ms규격엔 하나\n일 경우 하나만 읽을 수 있다. 
				out.write("Content-Type:text/html\r\n");
				//
				out.write("\r\n");
				out.write("<meta charset='utf-8'>");
				out.write("<title>제목</title>");
				out.write("<h1>접속을 환영합니다</h1>");
				out.write("<h2>지금 접속 하는 화면을 뛰웁니다</h2>");
				//----------------------------------
				
				out.close();
				in.close();
				socket.close();
			}
		}catch(Exception e){
			System.out.println("서버 가동중 오류 발생 : "+e);
		}
	}
}

