package collection;

import java.util.*;

public class Sample2 {
	public static void main(String[] args) {
		List<String> L=new ArrayList<String>(); 
		L.add("");
		L.add("나");
		L.add("다");
		L.add("라");
		System.out.println(L);
		List<String> M=new ArrayList<String>();
		M.add("A");
		M.add("B");
		M.add("C");
		M.add("D");
		System.out.println(M);
		//ArrayList.addAll(ArrayList);	: add()처럼 값을 넣는데 리스트가 하나 통짜로 들어간다.
		//ArrayList.addAll(index, ArrayList);	: 해당 위치에 리스트 하나를 통짜로 집어넣는다.
		L.addAll(M);
		System.out.println(L);
		//반복문을 이용할 경우 .size() 부분에 주의한다.
		/*
		for(int i=0; i<L.size(); i++) {
			System.out.print(L.get(i));
		}
		*/
	}
}

