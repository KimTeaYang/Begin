package my.day24;
/* Thread를 구현하는 방법
 *  [1] java.lang.Thread클래스를 상속받는다.
 *  [2] java.lang.Runnable인터페이스를 상속 받는다.
 *   
 *   run()메소드를 Override하여 스레드가 할 일을 구현한다.
 * */

class SnailThread extends Thread{
	
	public SnailThread(String name) {
		this.setName(name);
	}
	
	@Override
	public void run() {
		for(int i=1;i<6;i++) {
			System.out.println(this.getName()+"스레드가 기어갑니다");
			int sec = (int)(Math.random()*1500+500);
			try {
				Thread.sleep(sec); //sec밀리세컨드(1/1000s) 만큼 잠깐 중지함.
			}catch(InterruptedException e) {
				
			}
		}
	}
}

public class ThreadTest2 {

	public static void main(String[] args) {
		SnailThread tr1 = new SnailThread("홀쭉이 달팽이");
		SnailThread tr2 = new SnailThread("뚱뚱이 달팽이");
		SnailThread tr3 = new SnailThread("똘똘이 달팽이");
		tr1.start();
		tr2.start();
		tr3.start();
	}
}