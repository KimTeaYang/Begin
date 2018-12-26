package my.day24;
/* Thread�� �����ϴ� ���
 *  [1] java.lang.ThreadŬ������ ��ӹ޴´�.
 *  [2] java.lang.Runnable�������̽��� ��� �޴´�.
 *   
 *   run()�޼ҵ带 Override�Ͽ� �����尡 �� ���� �����Ѵ�.
 * */

class SnailThread extends Thread{
	
	public SnailThread(String name) {
		this.setName(name);
	}
	
	@Override
	public void run() {
		for(int i=1;i<6;i++) {
			System.out.println(this.getName()+"�����尡 ���ϴ�");
			int sec = (int)(Math.random()*1500+500);
			try {
				Thread.sleep(sec); //sec�и�������(1/1000s) ��ŭ ��� ������.
			}catch(InterruptedException e) {
				
			}
		}
	}
}

public class ThreadTest2 {

	public static void main(String[] args) {
		SnailThread tr1 = new SnailThread("Ȧ���� ������");
		SnailThread tr2 = new SnailThread("�׶��� ������");
		SnailThread tr3 = new SnailThread("�ʶ��� ������");
		tr1.start();
		tr2.start();
		tr3.start();
	}
}