package my.day25;

import java.util.Random;

public class Account {
	private int money = 10;
	private boolean flag=false;
	
	public void get(int val) {
		synchronized(this) { // ����ȭ �ʵ�
			while(flag==false) {
				try {
					wait();
				} catch (InterruptedException e) {
				}
			}
			flag=false;
			if(money-val<0) {
				System.out.println("���� ����: ���� �ܾ�="+money+
						", ��û�ݾ�="+val);
				notify();
				return;
			}
			money -= val;
			System.out.println("��ݾ�: "+val+", ����� �ܾ�: "+money);
			notify();
		}
	}
	
	//����ȭ �޼ҵ�
	synchronized public void save(int val) {
		while(flag==true) {
			try {
				wait();
			} catch (Exception e) {
			}
		}
		money +=val;
		System.out.println("�Աݾ�: "+val+", �Ա��� �ܾ�: "+money);
		flag=true;
		notify();
		/*  wait()�� ȣ��Ǹ� ������� ���� ������ �����ϰ� waiting pool�� ���� ����Ѵ�.
		 * �� �� ����� ������ �ݳ��ϰ� �����·� ����.
		 *  �ݸ� notify()�� ȣ��Ǹ� wating pool�� �ִ� ������ �ϳ��� ����
		 * Runnable�� ���·� ��ȯ��Ų��. ������ notify()�� Ư�� �����带 �����ؼ�
		 * ����� ���� �ƴ϶�, wating pool�� �ִ� ������ �ƹ��ų� �ϳ� ��� �����.
		 * ���� wating pool�� �ִ� ��� �����帣 ������� notifyAll()�� �̿��ϸ� �ȴ�.
		 * */
	}
	
}

class UserIn extends Thread {
	private Account ac;
	public UserIn(Account ac, String name) {
		this.ac = ac;
		setName(name);
	}
	@Override
	public void run() {
		for(int i=1;i<6;i++) {
			ac.save(1); // 1������ �Ա�
		}
	}
}

class UserOut extends Thread {
	private Account ac;
	public UserOut(Account ac, String name) {
		this.ac = ac;
		setName(name);
	}
	@Override
	public void run() {
		Random ran = new Random();
		for(int i=1;i<6;i++) {
			int val = ran.nextInt(5)+1;
			ac.get(val);
		}
	}
}