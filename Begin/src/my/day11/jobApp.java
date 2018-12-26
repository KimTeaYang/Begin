package my.day11;
import java.util.*;

/** CRUD ����� ���� ���α��� ���ø����̼�
 * 	- C : Create
 *  - R : Read
 *  - U : Update
 *  - D : Delete
 * */

public class jobApp {
	
	jobSeeker []jobSeekers = new jobSeeker[2];
	jobCompany []jobCompanys = new jobCompany[2];
	int count = 0; // �迭�� �ε����ε� Ȱ����
	int countC = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		jobApp app = new jobApp();
	
		while(true) {
			app.showMenu();
			int no = sc.nextInt();
			if(no==9) {
				System.out.println("Bye Bye~~");
				System.exit(0); // 0 : ��������, ������ : ������ ����
			}
			switch(no) {
				case 1: // ���� ���
					if(app.count>(app.jobSeekers.length-1)) {
						System.out.println("��� �ο� ����!");
						System.out.println("���� �ο�: "+app.jobSeekers.length);
						break;
					}
					app.register();
					break;
				case 2: // ����ȸ�� ���
					if(app.countC>(app.jobCompanys.length-1)) {
						System.out.println("��� ȸ�� ����!");
						System.out.println("���� ȸ��: "+app.jobCompanys.length);
						break;
					}
					app.registerC();
					break;
				case 3: // ������ ���
					app.print();
					break;
				case 4: // ����ȸ�� ���
					app.printC();
					break;
				case 5: // ������ �˻�
					app.search();
					break;
				case 6: // ����ȸ�� �˻�
					app.searchC();
					break;
			}
		}
		
	}
	/**�޴������� �����ִ� �޼ҵ�*/
	public void showMenu() {
		System.out.println("****Job App V1.1****");
		System.out.println("1. ������ ���");
		System.out.println("2. ����ȸ�� ���");
		System.out.println("3. ������ ���� ���");
		System.out.println("4. ����ȸ�� ���� ���");
		System.out.println("5. ������ �˻�");
		System.out.println("6. ȸ�� �˻�");
		System.out.println("9. ����");
		System.out.println("*******************");
		System.out.println("�޴� ��ȣ�� �Է��ϼ���=> ");
		System.out.println("*******************");
	}
	/**
	 *  ������ ������ �Է¹޴� �޼ҵ�
	 *  - �̸�, ����, ����, ����ó�� �Է¹޾� jobSeeker��ü�� �ο��ϴ� �޼ҵ�
	 */
	public void register() {
		Scanner sc = new Scanner(System.in);
		jobSeeker jb = new jobSeeker();
		
		System.out.println("�̸� �Է�=> ");
		String n = sc.next();
		jb.name = n;
		
		System.out.println("���� �Է�=> ");
		int a = sc.nextInt();
		jb.age = a;
		
		System.out.println("���� �Է�(1. M,2. F)=> ");
		int c = sc.nextInt();
		jb.gender = (c==1)?'M':'F';
		
		System.out.println("����ó �Է�=> ");
		String tell = sc.next();
		jb.tel = tell;
		
		jb.showProfile();
		System.out.println("�� ������ �����Ͻðڽ��ϱ�?[1.�� 2.�ƴϿ�]");
		int yn=sc.nextInt();
		if(yn==1) { // jobSeeker��ü�� �迭�� �����ϴ� �޼ҵ� ȣ��
			savejobSeeker(jb);
		}
	}
	/**����ȸ�� ���*/
	public void registerC() {
		Scanner sc = new Scanner(System.in);
		jobCompany jc = new jobCompany();
		
		System.out.println("ȸ�� �Է�=> ");
		String nc = sc.next();
		jc.nameC = nc;
		
		System.out.println("�޿� �Է�=> ");
		int ac = sc.nextInt();
		jc.salaryC = ac;
		
		System.out.println("���� �Է�=> ");
		String cc = sc.next();
		jc.regionC = cc;
		
		System.out.println("����ó �Է�=> ");
		String tellC = sc.next();
		jc.telC = tellC;
		
		jc.showCompany();
		System.out.println("�� ������ �����Ͻðڽ��ϱ�?[1.�� 2.�ƴϿ�]");
		int ynC=sc.nextInt();
		if(ynC==1) { // jobSeeker��ü�� �迭�� �����ϴ� �޼ҵ� ȣ��
			savejobCompany(jc);
		}
	}
	/** ������ ������ �迭�� �����ϴ� �޼ҵ�*/
	public void savejobSeeker(jobSeeker j) {
		jobSeekers[count++] = j;
		System.out.println("����� �ο�: "+count);
	}
	
	/** ����ȸ�� ������ �迭�� �����ϴ� �޼ҵ�*/
	public void savejobCompany(jobCompany jc) {
		jobCompanys[countC++] = jc;
		System.out.println("����� ȸ��: "+countC);
	}
	
	/**��ϵ� ������ ������ ����ϴ� �޼ҵ�*/
	public void print() {
		for(int i=0;i<count;i++) {
			if(!(count==0)){
				jobSeekers[i].showProfile();
				System.out.println("-------------");
			}else {
				System.out.println("��ϵ� �ο��� �����ϴ�.");
				break;
			}
		}
	}
	
	/**��ϵ� ����ȸ�� ������ ����ϴ� �޼ҵ�*/
	public void printC() {
		for(int i=0;i<countC;i++) {
			if(!(countC==0)){
				jobCompanys[i].showCompany();
				System.out.println("-------------");
			}else {
				System.out.println("��ϵ� ȸ�簡 �����ϴ�.");
				break;
			}
		}
	}
	/**������ �˻�*/
	public void search() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�˻��� �̸�=> ");
		String sch = sc.next();
		
		for(int i=0;i<count;i++) {
			if(jobSeekers[i].name.equals(sch)) {
				jobSeekers[i].showProfile();
				break;
			}
		}
	}
	/**����ȸ�� �˻�*/
	public void searchC() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�˻��� ȸ���=> ");
		String schC = sc.next();
		
		for(int i=0;i<countC;i++) {
			if(jobCompanys[i].nameC.equals(schC)) {
				jobCompanys[i].showCompany();
				break;
			}
		}
	}
}