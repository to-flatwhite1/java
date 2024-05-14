package input;

import java.util.Scanner;

public class SC {
	public static void main (String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("데이터를 입력해주세요");
		String str=sc.nextLine();
		System.out.println("입력받은 데이터는 ["+str+"]입니다.");
	}
}
