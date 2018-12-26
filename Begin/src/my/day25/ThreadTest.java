package my.day25;
/* [2] Runnable �������̽��� ��ӹ޴� ���
 * */

class MyRunnable implements Runnable{
	String name;
	
	public MyRunnable(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for (int i=1;i<6;i++){
			System.out.println(name+"�����尡 ���ϴ�.");
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {
				
			}
		}
	}
}

public class ThreadTest {

	public static void main(String[] args) {
		MyRunnable r1 = new MyRunnable("������1");
		MyRunnable r2 = new MyRunnable("������2");
		MyRunnable r3 = new MyRunnable("������3");
		
		Thread tr1 = new Thread(r1);
		Thread tr2 = new Thread(r2);
		Thread tr3 = new Thread(r3);
		tr1.start();
		tr2.start();
		tr3.start();
		
	}
}