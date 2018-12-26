package my.day20;

public class Local {

	String str="###"; // �������
	
	void sub() {
		String lstr="$$$"; // ��������(local����)
		System.out.println("str: "+str);
		System.out.println("lstr= "+lstr);
		
		class LocalInner { // �̸� �ִ� Local Inner class
			int no = 100;
			void print() {
				System.out.println("====print()====");
				System.out.println("str= "+str);
				System.out.println("lstr= "+lstr);
				System.out.println("no= "+no);
				System.out.println("===============");
				// �����̳�Ŭ���� �ȿ����� final�� �ƴ� ���������� ������ �� ����.
			}
		}
		LocalInner li = new LocalInner();
		li.print();
		/* �����̳�Ŭ������ ������ ���� �޼ҵ� �ȿ��� ��ü ������ �ؾ��Ѵ�.
		 * �ٸ� �޼ҵ忡���� �νĵ��� �ʴ´�. */
	}
	
	public static void main(String[] args) {
		Local lc = new Local();
		lc.sub();
	}
}