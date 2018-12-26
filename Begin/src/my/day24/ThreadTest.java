package my.day24;

public class ThreadTest {

	public static void main(String[] args) {
		
		int count = Thread.activeCount();
		System.out.println("���� ���� ���� ������ ����: "+count);
		
		Thread tr = Thread.currentThread();
		System.out.println("���� ���� ���� ������ �̸�: "+tr.getName());
		
		tr.setName("MyThread");
		System.out.println("�̸� ������---");
		System.out.println("���� ���� ���� ������ �̸�: "+tr.getName());
		
		System.out.println("Hello World~~~");
	}
	
}
/* ���� ���α׷��� ���Ǵ� ������� 1�� �̻��� �� �ִ�.
 * �̷� �� ���α׷��� ������ ������ main()�� �ƴ� ���� �ִ�.
 * |-----------------|��
 * ���μ��� ����
 * 
 * |-----------------|
 * ���� ������ ����        ��
 * 
 * |   |-������ ����-->|  |
 * ���� ����			    �� 
 * 
 * |------------------|------>|
 * ������ ����			���γ�	  ������ ��
 * */