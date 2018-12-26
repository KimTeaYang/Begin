package my.day25;

import java.util.Random;

public class Account {
	private int money = 10;
	private boolean flag=false;
	
	public void get(int val) {
		synchronized(this) { // 동기화 필드
			while(flag==false) {
				try {
					wait();
				} catch (InterruptedException e) {
				}
			}
			flag=false;
			if(money-val<0) {
				System.out.println("현금 부족: 현재 잔액="+money+
						", 요청금액="+val);
				notify();
				return;
			}
			money -= val;
			System.out.println("출금액: "+val+", 출금후 잔액: "+money);
			notify();
		}
	}
	
	//동기화 메소드
	synchronized public void save(int val) {
		while(flag==true) {
			try {
				wait();
			} catch (Exception e) {
			}
		}
		money +=val;
		System.out.println("입금액: "+val+", 입금후 잔액: "+money);
		flag=true;
		notify();
		/*  wait()가 호출되면 스레드는 수행 권한을 포기하고 waiting pool에 가서 대기한다.
		 * 이 때 모니터 락으로 반납하고 대기상태로 들어간다.
		 *  반면 notify()가 호출되면 wating pool에 있는 스레드 하나를 깨워
		 * Runnable한 상태로 전환시킨다. 하지만 notify()는 특정 스레드를 지정해서
		 * 깨우는 것이 아니라, wating pool에 있는 스레드 아무거나 하나 골라서 깨운다.
		 * 따라서 wating pool에 있는 모든 스레드르 깨우려면 notifyAll()을 이용하면 된다.
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
			ac.save(1); // 1만원씩 입금
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