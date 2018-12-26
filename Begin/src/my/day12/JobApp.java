package my.day12;

import java.util.Scanner;

public class JobApp {
	
	JobSeeker []jsarray = new JobSeeker[10];
	int count = 0; // jsarrray 인덱스

	public static void main(String[] args) {
		JobApp ja = new JobApp();
		Scanner sc = new Scanner(System.in);
		
		while(true){
			ja.showMenu();
			int menu = sc.nextInt();
			
			switch(menu) {
				case 1:
					ja.register();
					break;
				case 2:
					ja.print();
					break;
				case 3:
					ja.search();
					break;
				case 4:
					ja.delete();
					break;
				case 9:
					System.out.println("bye");
					return;
			}
		}
	}
	
	/**메뉴구성을 보여주는 메소드*/
	public void showMenu() {
		System.out.println("****Job App V1.1****");
		System.out.println("1. 구직자 등록");
		System.out.println("2. 구직자 정보 출력");
		System.out.println("3. 구직자 검색"); // 이름으로 검색
		System.out.println("4. 구직자 정보 삭제");
		System.out.println("9. 종료");
		System.out.println("*******************");
		System.out.print("메뉴 번호를 입력하세요=> ");
	}
	
	public void register() {
		JobSeeker js = new JobSeeker();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요=> ");
		js.setName(sc.next());
		
		System.out.print("나이를 입력하세요=> ");
		js.setAge(sc.nextInt());
		
		System.out.print("연락처를 입력하세요=> ");
		js.setTell(sc.next());
		
		jsarray[count++] = js;
	}
	
	public void print() {
		for(int i=0;i<count;i++) {
			jsarray[i].showProfile();
		}
	}
	
	public void search() {
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 이름=> ");
		String name = sc.next();
		
		for(int i=0;i<count;i++) {
			if(jsarray[i].getName().equals(name)) {
				jsarray[i].showProfile();
				break;
			}
		}
	}
	
	public void delete() {
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 이름=> ");
		String name = sc.next();
		int i;
		
		for(i=0;i<count;i++) {
			if(jsarray[i].getName().equals(name)) {
				System.out.printf("%s님이 삭제되었습니다.\n", jsarray[i].getName());
				jsarray[i] = null; // 삭제
				count--;
				break;
			}
		}
		for(int j=0;j<count;j++) {
			if(i==count) {
				break;
			}
			jsarray[i] = jsarray[i+1];  // 삭제한 빈 칸을 앞으로 채워넣기
			i++;
		}
	}
}
