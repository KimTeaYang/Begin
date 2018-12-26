package my.day21;

import java.util.Vector;
/* Collection의 List계열
 *  - 입력 순서를 기억함
 *  - 데이터 중복을 허용함
 *  jdk1.4 == jdk5.0 이후 (Generic이용)
 * */

public class VectorTest {
	public static void main(String[] args) {
		//jdk1.4이전 버전
		//Vector v = new Vector();
		/*기본생성자: 기본 10개의 저장할 공간을 잡는다.
		 		    데이터가 가득차면 저장 영역을 2배로 늘린다. */
		Vector v = new Vector(5,3); // 초기용량:5, 증가치:3
		
		System.out.println("v의 현재 크기1: "+v.size());
		System.out.println("v의 현재 용량1: "+v.capacity());
		System.out.println("===========================");
		
		//데이터 저장: add(Object o)
		v.add("Hello");
		v.add(new Integer(100));
		v.add(new Double("35.12"));
				
		System.out.println("v의 현재 크기2: "+v.size());
		System.out.println("v의 현재 용량2: "+v.capacity());
		System.out.println("===========================");
		
		for(int i=1;i<5;i++) {
			v.add(new Integer(i));
		}
		
		System.out.println("v의 현재 크기3: "+v.size());
		System.out.println("v의 현재 용량3: "+v.capacity());
		System.out.println("===========================");
		
		/* 데이터 꺼내기 : Object get(int index)
		 *             Object elementAt(int index)
		 * */
		
		String obj = (String)v.get(0);
		System.out.println(obj.toUpperCase());
		
		Double dbl = (Double)v.get(2);
		System.out.println(dbl);
		System.out.println("===========================");
		
		//jdk5.0 이후 버전 ---Generic의 사용
		Vector<String> v2 = new Vector<String>();
		//String 유형만 저장하는 벡터 생성
		v2.add("Java");
		v2.add("HTML");
		v2.add("SQL");
		
		String str = v2.get(2);
		System.out.println(str.toLowerCase());
		System.out.println("===========================");
		String str1;
		for(int i=0;i<v2.size();i++) {
			str1 = v2.get(i);
			System.out.println(str1);
		}
		System.out.println("===========================");
		/* Generic이용하면 확장 for루프 사용이 가능하다.
		 * 
		 * for(변수선언:자료구조){}
		 */
		for(String a:v2) {
			System.out.println(a.toUpperCase());
		}
		
		System.out.println("===========================");
		Vector<Float> v3 = new Vector<>();
		v3.add(3.14f); // auto boxing되어 Float 유형으로 저장됨
		v3.add(2.15f);
		v3.add(6.66f);
		v3.add(new Float("3.3f"));
		
		Float f = 0.0f;
		for(float a:v3) {
			f += a;
		}
		System.out.println(f);
		System.out.println("===========================");
	}
}