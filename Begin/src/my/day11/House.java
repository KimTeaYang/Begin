package my.day11;

public class House {
	
	// 1. �Ӽ� : �������(has a ���谡 �����ؾ� ��)
	String addr;
	String owner;
	int room;
	int year;
	
	// 2. ���(����): �޼ҵ�
	public void showInfo() {
		System.out.println("----House ����----");
		System.out.println("������: "+owner);
		System.out.println("��  ��: "+addr);
		System.out.println("��  ��: "+room);
	}
	
	public void existAt(int bunji) {
		System.out.println(owner+"�� ��: "+addr+" "+bunji
				+"������ ��ġ�մϴ�");
	}
	
	public void Money(int price) {
		System.out.println("��  ��: "+price+" ����");
	}
	
	public void rent(String type, int money) {
		showInfo();
		System.out.println("Ÿ  ��: "+type);
		System.out.println("��  ��: "+money);
	}
	
}