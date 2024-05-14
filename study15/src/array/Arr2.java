package array;

public class Arr2 {
	public static void main(String [] args) {
		//배열은 사실 데이터가 저장되어 있는 다른 위치의 주소를 저장하고 있다.
		//배열을 복사한 경우 하나의 배열 값 변동이 다른 배열의 값까지 함께 바꾼다면
		//주소값을 출력해 확인 해 볼것 (같은주소인지 다른주소인지 확인)
		int [] A;
		A=new int[3];
		A[0]=10; A[1]=20; A[2]=30;
		
		int[] B;
		B=new int[3];
		for(int i=0; i<A.length; i++) {
			B[i]=A[i];
		}
	
		A[1]=999;
		for(int i=0; i<A.length; i++) {
			System.out.print("A["+i+"]="+A[i]+" \t");
		} 
		System.out.println();
		for(int i=0; i<B.length; i++) {
			System.out.print("B["+i+"]="+B[i]+" \t");
			
	}
		System.out.println();
		System.out.println("A의 주소 :"+A);
		System.out.println("B의 주소 :"+B);
		
		//이차원 배열
		int[][] C;
		C=new int[2][5];
		C[0][0]=100;
		C[1][4]=200;
	}
	}
