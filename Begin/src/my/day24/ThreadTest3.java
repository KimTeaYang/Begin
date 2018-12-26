package my.day24;

class MySnail extends Thread{
	
	public MySnail(String name) {
		this.setName(name);
	}
	
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(this.getName()+"�����尡 ����");
			/*try {
			   	sleep(1000); // 1�� ���� Block ��.
				// Block�Ǵ� ���� �ٸ� �����忡�� ���� ��ȸ�� �ش�.
			} catch (InterruptedException e) {
				System.out.println("���� �߻�: "+e);
				break;
			}*/
		}
	}
	
}

public class ThreadTest3 {

	public static void main(String[] args) {
		MySnail tr1 = new MySnail("ù��°");
		MySnail tr2 = new MySnail("�ι�°");
		MySnail tr3 = new MySnail("����°");
		
		/* �����忡 �켱������ �ο��Ͽ� JVM �����층�� ������ �־��.
		 �켱������ �ο��Ͽ� �����ϴ� ����� �ü���� �������� �� �����Ѵ�.(ex Unix)
		 �켱 ����: 0~10
		*/
		tr1.setPriority(Thread.MIN_PRIORITY);  // 1
		tr2.setPriority(Thread.NORM_PRIORITY); // 5
		tr3.setPriority(Thread.MAX_PRIORITY);  // 10
		tr1.start();
		tr2.start();
		tr3.start();
		
		//tr3.interrupt();
		//Block���¿� �ִ� �����尡 ���� �� InterruptedException�� �߻���Ų��.
		
		//tr2.yield();
		//tr2�� �켱������ ���ų� ���� �����忡�� �纸��.
		
		/*try {
			tr1.join();
			 tr1�����尡 ���� �� ��ĥ ������ �� �޼ҵ带 ȣ���� ������(���⼭��
			 * ���� ������)�� Block���°� �ȴ�.
			 * 
		} catch (InterruptedException e) {
			
		}*/
		
		System.out.println("Hello World~~");
		
	}

}