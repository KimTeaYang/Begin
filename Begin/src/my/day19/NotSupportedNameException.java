package my.day19;
/* 1. 사용자정의 예외 클래스 만들기
 *  [1] Exception을 상속받는다.
 *  [2] 생성자를 구성하여 생성자 안에서 super("예외메세지")를 호출한다.
 * 2. 사용자정의 예외 사용하기
 *  [1] throw new 사용자정의예외생성()
 *  [2] 메소드 헤더에 throws 사용자정의 예외 
 * */
public class NotSupportedNameException extends Exception{
	
	public NotSupportedNameException() {
		super("지원되지 않는 이름입니다.");
	}
	
	public NotSupportedNameException(String msg) {
		super(msg);
	}
}