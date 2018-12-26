package my.day24;

public class ThreadTest {

	public static void main(String[] args) {
		
		int count = Thread.activeCount();
		System.out.println("현재 실행 중인 스레드 갯수: "+count);
		
		Thread tr = Thread.currentThread();
		System.out.println("현재 실행 중인 스레드 이름: "+tr.getName());
		
		tr.setName("MyThread");
		System.out.println("이름 변경후---");
		System.out.println("현재 실행 중인 스레드 이름: "+tr.getName());
		
		System.out.println("Hello World~~~");
	}
	
}
/* 현재 프로그램에 사용되는 스레드는 1개 이상일 수 있다.
 * 이럴 때 프로그램의 끝나는 시점은 main()이 아닐 수도 있다.
 * |-----------------|끝
 * 프로세스 시작
 * 
 * |-----------------|
 * 메인 스레드 시작        끝
 * 
 * |   |-스레드 시작-->|  |
 * 메인 시작			    끝 
 * 
 * |------------------|------>|
 * 스레드 시작			메인끝	  스레드 끝
 * */