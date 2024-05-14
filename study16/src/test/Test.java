package test;

public class Test {
	public static void main(String [] args) {
		//for 문을 이용해서 1~10까지 순서대로 출력하시오
		int[] arr1= {1,2,3,5,6,7,8,9,10};
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		/*
		 *
		 **
		 ***
		 ****
		 *****
		 */
	
		//for문 구구단을 만들어 봅시다.
		//2~9단까지 반복
		for(int c=2; c<10; c++) {
			System.out.println("==="+c+"단");
			for(int a=1; a<10; a++) {
				System.out.println(c+"*"+a+"="+c*a);
				}//중첩for문 끝
		}//for문 끝
		
		int c;
		for(c=2; c<10; c++) {
			System.out.print("["+c+"단]"+"\t");
		}
		System.out.print("\n");
		
		
		for(c=1; c<10; c++) {
			for(int e=2; e<10; e++)
				System.out.print(e+"*"+c+"="+e*c+"\t"); 
				System.out.print("\n");
		}//for문끝 
			
	}//main 끝
}//class 끝


