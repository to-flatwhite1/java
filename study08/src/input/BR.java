package input;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BR {
	public static void main(String []args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("데이터를 입력해주세요");
		String str=br.readLine();
		System.out.println("입력받은 데이터는 ["+str+"]입니다.");
	}//main 끝
	
}//class 끝
