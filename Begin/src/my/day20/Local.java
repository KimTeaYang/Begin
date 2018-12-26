package my.day20;

public class Local {

	String str="###"; // 멤버변수
	
	void sub() {
		String lstr="$$$"; // 지역변수(local변수)
		System.out.println("str: "+str);
		System.out.println("lstr= "+lstr);
		
		class LocalInner { // 이름 있는 Local Inner class
			int no = 100;
			void print() {
				System.out.println("====print()====");
				System.out.println("str= "+str);
				System.out.println("lstr= "+lstr);
				System.out.println("no= "+no);
				System.out.println("===============");
				// 로컬이너클래스 안에서는 final이 아닌 지역변수는 접근할 수 없다.
			}
		}
		LocalInner li = new LocalInner();
		li.print();
		/* 로컬이너클래스는 자지가 속한 메소드 안에서 객체 생성을 해야한다.
		 * 다른 메소드에서는 인식되지 않는다. */
	}
	
	public static void main(String[] args) {
		Local lc = new Local();
		lc.sub();
	}
}