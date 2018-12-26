package my.day21;

import java.util.Vector;
/* Collection�� List�迭
 *  - �Է� ������ �����
 *  - ������ �ߺ��� �����
 *  jdk1.4 == jdk5.0 ���� (Generic�̿�)
 * */

public class VectorTest {
	public static void main(String[] args) {
		//jdk1.4���� ����
		//Vector v = new Vector();
		/*�⺻������: �⺻ 10���� ������ ������ ��´�.
		 		    �����Ͱ� �������� ���� ������ 2��� �ø���. */
		Vector v = new Vector(5,3); // �ʱ�뷮:5, ����ġ:3
		
		System.out.println("v�� ���� ũ��1: "+v.size());
		System.out.println("v�� ���� �뷮1: "+v.capacity());
		System.out.println("===========================");
		
		//������ ����: add(Object o)
		v.add("Hello");
		v.add(new Integer(100));
		v.add(new Double("35.12"));
				
		System.out.println("v�� ���� ũ��2: "+v.size());
		System.out.println("v�� ���� �뷮2: "+v.capacity());
		System.out.println("===========================");
		
		for(int i=1;i<5;i++) {
			v.add(new Integer(i));
		}
		
		System.out.println("v�� ���� ũ��3: "+v.size());
		System.out.println("v�� ���� �뷮3: "+v.capacity());
		System.out.println("===========================");
		
		/* ������ ������ : Object get(int index)
		 *             Object elementAt(int index)
		 * */
		
		String obj = (String)v.get(0);
		System.out.println(obj.toUpperCase());
		
		Double dbl = (Double)v.get(2);
		System.out.println(dbl);
		System.out.println("===========================");
		
		//jdk5.0 ���� ���� ---Generic�� ���
		Vector<String> v2 = new Vector<String>();
		//String ������ �����ϴ� ���� ����
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
		/* Generic�̿��ϸ� Ȯ�� for���� ����� �����ϴ�.
		 * 
		 * for(��������:�ڷᱸ��){}
		 */
		for(String a:v2) {
			System.out.println(a.toUpperCase());
		}
		
		System.out.println("===========================");
		Vector<Float> v3 = new Vector<>();
		v3.add(3.14f); // auto boxing�Ǿ� Float �������� �����
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