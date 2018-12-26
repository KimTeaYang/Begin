package my.day11;

/* 1. �߻�ȭ(Abstraction)
 * 		���α׷��� �ʿ��� ��ü�� Ŭ������ �Űܳ��� ��.
 * 		ex) �ε���� 
 * 			1) ��ü�� ���� - ��, �ŵ���, �ż���, �߰��� ...
 * 				==> Ŭ������ �ű��.
 * 					�� - �Ӽ� ==> �������
 * 						���(����) ==> �޼ҵ�
 * 2. ĸ��ȭ(Encapsulation)
 * 3. ������(Polymorphism)
 * 4. ��Ӽ�(Inheritance)
 * */

public class MyApp {

	public static void main(String[] args) {
		/* Ŭ����(class) ==> ��ü�� ������ Ʋ
		    ��ü(Object) : Ŭ������ ���� ������� ������
		    			==> �޸𸮿� �ö� ��ü(object)
		*/
		House h1 = new House();
		House h2 = new House();
		House h3 = new House();
		
		h1.owner = "ȫ�浿";
		h1.addr = "���� ������";
		h1.room = 3;
		
		h2.owner = "��浿";
		h2.addr = "���� ��������";
		h2.room = 4;
		
		h3.owner = "ȫȫȫ";
		h3.addr = "������";
		h3.room = 1;
		h3.rent("����", 8000);
		h3.existAt(31);
		
	}
}