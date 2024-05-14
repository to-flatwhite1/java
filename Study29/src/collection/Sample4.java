package collection;

import java.util.*;

public class Sample4 {
	public static void main(String[] args) {
		List<String> L=new ArrayList<String>();
		L.add("IOT");
		L.add("JAVA");
		L.add("HTML");
		L.add("CSS");
		L.add("SQL");
		L.add("JSP");
		L.add(4, "JAVASCRIPT");
		System.out.println(L);
		//List.subList(start, end)	해당 index범위 내의 내용물을 별도의 리스트로 추출
		//마지막 index는 포함되지 않는다. (커서의 위치를 기준으로 하기 때문이다.)
		List<String> sub=new ArrayList<String>();
		sub=L.subList(2, 5);
		System.out.println(sub);
		
		//List.remove(index);	해당 위치의 자료를 제거 
		//List.remove(value);	해당 값을 가진 자료를 제거
		L.add(0,"CSS");
		System.out.println(L);
		
		L.remove(1);
		L.remove("CSS");
		System.out.println(L);

		//Collections.sort(L); //오름차순
		Collections.sort(L, Collections.reverseOrder()); //내림차순
		System.out.println(L);
	}
}
