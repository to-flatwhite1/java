package collection;

import java.util.*;

public class Sample5 {
	public static void main(String [] args) {
		//List:순서엄격,중복허락
		//Set:순서 없음, 중복불가
		//Map:검색어(key)와 값(value)이 한 쌍으로 저장되는 방법
		//	데이터의 검색이 편해서 개발에 이용하기 좋음.	*X5,000,000
		//	순서는 존재하지 않고 Value는 중복이 가능하지만 key는 중복될 수 없다.
		// 	속도가 현저히 떨어짐
		// 	속도가 많이 떨어지지만 Hash를 붙여서 속도를 높여줌
		
 		Map<String,Student> m=new HashMap<String,Student>();
 		//제네릭 지정시 <key,vaule의 단위를 입력> 두개를 지정
 		//Map.put(key,value); key와 value를 한쌍으로 묶어 데이터 입력
 		//Map.get(key);			검색어를 기준으로 해당하는 value를 출력
 		
 		
 		//데이터를 넣을때 add가 아니라 map은 put!
 		m.put("A", new Student("김철수",105));//A라고 검색 했을 때 값이 50
 		m.put("E", new Student("안예지",100));
 		m.put("B", new Student("홍길동",90));//"VALUE"는 중복되어도 상관없다.
 		m.put("C", new Student("하이뮨",80));
 		m.put("C",new Student("더단백",100));//검색어" KEY"가 중복되면 나중에 들어온 값만 남는다 이전 값 소멸 된다.
 		m.put("D",new Student("일동후디스",50));
 		m.put("F", new Student("야놀자",50));
 		System.out.println(m);
 		//System.out.println(m.get("B"));
 		//Map을 for문으로 운행 하기 위해서는 key들이 들어가 있는 Set을 추출한 뒤에 사용하여야 한다.
	}
}

class Student {
	String name;
	int number;
	Student(String a, int b){
		name=a;
		number=b;
	}
	//toString 오버라이딩
	public String toString() {
		return "["+name+":"+number+"]";
	}
}
