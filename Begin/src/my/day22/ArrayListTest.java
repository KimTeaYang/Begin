package my.day22;

import java.util.*;
/* ArrayList
 *  - java.util.List�迭
 *  - Vector�� ����� ����
 *  - �� ���ʹ� �޼ҵ���� ����ȭ�� ������ �ݸ�, 
 *    ArrayList�� ����ȭ�Ǿ� ���� �ʾ� ������. �� ���α׷��ֿ��� ���� �����
 * */

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<>();
		
		arrList.add("Java");
		arrList.add("HTML");
		arrList.add("CSS");
		// Object������ ����. ���� ������ �ڵ����� Ȯ����
		
		String str = arrList.get(0);
		System.out.println(str);
		
		Iterator<String> it = arrList.iterator();
		
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
		System.out.println("arrList.size: "+arrList.size());
	}
}