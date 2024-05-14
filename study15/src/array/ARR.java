package array;

public class ARR {
	public static void main(String [] args) {
		//배열 : array, 여러개의 값을 저장할 수 있는 규격
		//타입[] 이름=new 타입[칸수];
		//배열은 몇칸으로 만들지 먼저 지정해 주어야 한다.
		//*x5,000,000 배열의 번호(index)는 0번부터 시작하기 때문에 칸수 -1까지만 있다.
		//배열 칸수는 배열이름.length를 통해 확인 할 수 잇따.
		int[] a;
		a=new int[5]; //숫자가 여러개 들어 갈 수 있는 이름 a가 된 상자를 만들어줘
		a[0]=12;
		a[1]=25;
		a[2]=30;
		a[3]=99;
		a[4]=50;
		
		
		System.out.println("a배열칸수는 "+a.length);
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		
		int[] b= {100,80,60,10,50,25};
		System.out.println("b배열칸수는 "+b.length);
		for(int i=0; i<b.length; i++) {
			System.out.println("b["+i+"]="+b[i]);
		}
		//*5,000,000 배열내부의 데이터를 전부 출력하는 반복문
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		String[] ab;//문자열이 여러개 들어 갈 수 있는 이름 b가 된 상자를 만들어줘
		System.out.println(a);
		
	}//main 끝
}//class 끝
