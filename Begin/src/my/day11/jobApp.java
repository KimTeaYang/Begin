package my.day11;
import java.util.*;

/** CRUD 기능을 갖는 구인구직 어플리케이션
 * 	- C : Create
 *  - R : Read
 *  - U : Update
 *  - D : Delete
 * */

public class jobApp {
	
	jobSeeker []jobSeekers = new jobSeeker[2];
	jobCompany []jobCompanys = new jobCompany[2];
	int count = 0; // 배열의 인덱스로도 활용함
	int countC = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		jobApp app = new jobApp();
	
		while(true) {
			app.showMenu();
			int no = sc.nextInt();
			if(no==9) {
				System.out.println("Bye Bye~~");
				System.exit(0); // 0 : 정상종료, 음수값 : 비정상 종료
			}
			switch(no) {
				case 1: // 구직 등록
					if(app.count>(app.jobSeekers.length-1)) {
						System.out.println("등록 인원 마감!");
						System.out.println("현재 인원: "+app.jobSeekers.length);
						break;
					}
					app.register();
					break;
				case 2: // 구인회사 등록
					if(app.countC>(app.jobCompanys.length-1)) {
						System.out.println("등록 회사 마감!");
						System.out.println("현재 회사: "+app.jobCompanys.length);
						break;
					}
					app.registerC();
					break;
				case 3: // 구직자 출력
					app.print();
					break;
				case 4: // 구인회사 출력
					app.printC();
					break;
				case 5: // 구직자 검색
					app.search();
					break;
				case 6: // 구인회사 검색
					app.searchC();
					break;
			}
		}
		
	}
	/**메뉴구성을 보여주는 메소드*/
	public void showMenu() {
		System.out.println("****Job App V1.1****");
		System.out.println("1. 구직자 등록");
		System.out.println("2. 구인회사 등록");
		System.out.println("3. 구직자 정보 출력");
		System.out.println("4. 구인회사 정보 출력");
		System.out.println("5. 구직자 검색");
		System.out.println("6. 회사 검색");
		System.out.println("9. 종료");
		System.out.println("*******************");
		System.out.println("메뉴 번호를 입력하세요=> ");
		System.out.println("*******************");
	}
	/**
	 *  구직자 정보를 입력받는 메소드
	 *  - 이름, 나이, 성별, 연락처를 입력받아 jobSeeker객체에 부여하는 메소드
	 */
	public void register() {
		Scanner sc = new Scanner(System.in);
		jobSeeker jb = new jobSeeker();
		
		System.out.println("이름 입력=> ");
		String n = sc.next();
		jb.name = n;
		
		System.out.println("나이 입력=> ");
		int a = sc.nextInt();
		jb.age = a;
		
		System.out.println("성별 입력(1. M,2. F)=> ");
		int c = sc.nextInt();
		jb.gender = (c==1)?'M':'F';
		
		System.out.println("연락처 입력=> ");
		String tell = sc.next();
		jb.tel = tell;
		
		jb.showProfile();
		System.out.println("위 정보를 저장하시겠습니까?[1.예 2.아니오]");
		int yn=sc.nextInt();
		if(yn==1) { // jobSeeker객체를 배열에 저장하는 메소드 호출
			savejobSeeker(jb);
		}
	}
	/**구인회사 등록*/
	public void registerC() {
		Scanner sc = new Scanner(System.in);
		jobCompany jc = new jobCompany();
		
		System.out.println("회사 입력=> ");
		String nc = sc.next();
		jc.nameC = nc;
		
		System.out.println("급여 입력=> ");
		int ac = sc.nextInt();
		jc.salaryC = ac;
		
		System.out.println("지역 입력=> ");
		String cc = sc.next();
		jc.regionC = cc;
		
		System.out.println("연락처 입력=> ");
		String tellC = sc.next();
		jc.telC = tellC;
		
		jc.showCompany();
		System.out.println("위 정보를 저장하시겠습니까?[1.예 2.아니오]");
		int ynC=sc.nextInt();
		if(ynC==1) { // jobSeeker객체를 배열에 저장하는 메소드 호출
			savejobCompany(jc);
		}
	}
	/** 구직자 정보를 배열에 저장하는 메소드*/
	public void savejobSeeker(jobSeeker j) {
		jobSeekers[count++] = j;
		System.out.println("등록한 인원: "+count);
	}
	
	/** 구인회사 정보를 배열에 저장하는 메소드*/
	public void savejobCompany(jobCompany jc) {
		jobCompanys[countC++] = jc;
		System.out.println("등록한 회사: "+countC);
	}
	
	/**등록된 구직자 정보를 출력하는 메소드*/
	public void print() {
		for(int i=0;i<count;i++) {
			if(!(count==0)){
				jobSeekers[i].showProfile();
				System.out.println("-------------");
			}else {
				System.out.println("등록된 인원이 없습니다.");
				break;
			}
		}
	}
	
	/**등록된 구인회사 정보를 출력하는 메소드*/
	public void printC() {
		for(int i=0;i<countC;i++) {
			if(!(countC==0)){
				jobCompanys[i].showCompany();
				System.out.println("-------------");
			}else {
				System.out.println("등록된 회사가 없습니다.");
				break;
			}
		}
	}
	/**구직자 검색*/
	public void search() {
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 이름=> ");
		String sch = sc.next();
		
		for(int i=0;i<count;i++) {
			if(jobSeekers[i].name.equals(sch)) {
				jobSeekers[i].showProfile();
				break;
			}
		}
	}
	/**구인회사 검색*/
	public void searchC() {
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 회사명=> ");
		String schC = sc.next();
		
		for(int i=0;i<countC;i++) {
			if(jobCompanys[i].nameC.equals(schC)) {
				jobCompanys[i].showCompany();
				break;
			}
		}
	}
}