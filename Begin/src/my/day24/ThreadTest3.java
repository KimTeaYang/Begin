package my.day24;

class MySnail extends Thread{
	
	public MySnail(String name) {
		this.setName(name);
	}
	
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(this.getName()+"스레드가 기어가요");
			/*try {
			   	sleep(1000); // 1초 동안 Block 됨.
				// Block되는 동안 다른 스레드에게 실행 기회를 준다.
			} catch (InterruptedException e) {
				System.out.println("예외 발생: "+e);
				break;
			}*/
		}
	}
	
}

public class ThreadTest3 {

	public static void main(String[] args) {
		MySnail tr1 = new MySnail("첫번째");
		MySnail tr2 = new MySnail("두번째");
		MySnail tr3 = new MySnail("세번째");
		
		/* 스레드에 우선순위를 부여하여 JVM 스케쥴링에 영향을 주어보자.
		 우선순위를 부여하여 적용하는 방식은 운영체제가 선점형일 때 동작한다.(ex Unix)
		 우선 순위: 0~10
		*/
		tr1.setPriority(Thread.MIN_PRIORITY);  // 1
		tr2.setPriority(Thread.NORM_PRIORITY); // 5
		tr3.setPriority(Thread.MAX_PRIORITY);  // 10
		tr1.start();
		tr2.start();
		tr3.start();
		
		//tr3.interrupt();
		//Block상태에 있는 스레드가 있을 때 InterruptedException을 발생시킨다.
		
		//tr2.yield();
		//tr2와 우선순위가 같거나 높으 스레드에게 양보함.
		
		/*try {
			tr1.join();
			 tr1스레드가 일을 다 마칠 때까지 이 메소드를 호출한 스레드(여기서는
			 * 메인 스레드)가 Block상태가 된다.
			 * 
		} catch (InterruptedException e) {
			
		}*/
		
		System.out.println("Hello World~~");
		
	}

}