package collection;

import java.util.*;

public class Sample1 {
	public static void main(String [] args) {
		//리스트: 순서가 엄격하게 부여된 집합 데이터, 순번(index)가 검색의 기준점이다.
		//		기준점이 존재하기 때문에 중복 데이터를 허용한다.
		//		java collection은 interface이기 때문에 직접 객체로 제작할 수 없고
		//		implements 되어있는 준비된 class를 객체로 조립하여 사용한다.
		List<String> L=new ArrayList<String>(); 
		L.add("홍길동");
		L.add("안예지");
		L.add("김철수");
		L.add(1,"김북부");
		
		List<String> L2=new ArrayList<String>(); 
		L2.add("A");
		L2.add("B");
		L2.add("C");
		
		L.addAll(L2);//리스트에 다른 리스트를 합치는 메서드는 addAll이다.
		System.out.println(L);
		System.out.println(L2);
		//리스트에서 데이터의 수를 확인할 때는 length가 아니고 size()를 사용한다.
		System.out.println(L.size());
		
		//데이터를 입력할 때는 add()로 입력하고 꺼내올때는 get()으로 가져온다.
		System.out.println(L.get(1));
		
		//collection은 사용방법이 딱 정해져 있어서 사용할 때 주의해야 한다.
		System.out.println(L.size());
		
		//일반 for문
		for(int i=0; i<L.size(); i++) {
			System.out.print(L.get(i)+"\t");
		}
		System.out.println();
		
		//향상된 for문
		//for(변수:집합){집합운행시 1단위마다 수행할 문장;}
		for(String str:L) {
			System.out.print(str+"\t");
		}
	}
}
