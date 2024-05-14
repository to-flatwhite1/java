package arra;

public class Array {
	public static void main(String [] args) {
		//다차원 배열
		//배열 내부의 한 요소가 배열로 이루어져 있는 경우
		
		int[] arr1= {1,2,3};//length가 3이고 0~2번까지 index를 가진 배열
		//System.out.println(arr1[  ]);
		//0
		//1
		//2
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		
		//이차원 배열의 내부를 보기 위해서는 for 문이 이중으로 필요하다
		int[][] arr2= {{1,2,3},{1,2,3}};
		
		System.out.println(arr2[0][1]);
		//System.out.println(arr2[0][1]);
		//System.out.println(arr2[0][2]);
		//System.out.println(arr2[0][3]);
		for(int a=0; a<2; a++) {
			for(int i=0; i<3; i++) {
				System.out.print(arr2[a][i]+"\t");
			}
			System.out.println
		}
		//length 몇칸으로 나누어져 있느냐
			
		int[][][] arr3= {{{1,2,3},{1,2,3}},{{1,2,3},{1,2,3}},{{1,2,3},{1,2,3}}};	
		//눈에 잘보이게 들여쓰기 해야함
	}//main 끝
}//class 끝
