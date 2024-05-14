package op;

import java.util.*;

public class Cal {
	public static void main(String[]args) {
		Scanner sc;
		sc=new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력해주세요.");
		int a=sc.nextInt();
		System.out.println("두번째 숫자를 입력해주세요");
		int b=sc.nextInt();
		System.out.println("입력된 수는"+a+","+b+"입니다.");
		int result=a+b;
		System.out.println("두 수를 더하면 "+result+"입니다.");
		
		sc.close();//외부로부터 데이터를 받아오는 경우 회선을 닫아주는게 중요하다.
	}//main 끝
}// class 끝
