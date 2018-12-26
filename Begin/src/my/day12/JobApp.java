package my.day12;

import java.util.Scanner;

public class JobApp {
	
	JobSeeker []jsarray = new JobSeeker[10];
	int count = 0; // jsarrray �ε���

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
	
	/**�޴������� �����ִ� �޼ҵ�*/
	public void showMenu() {
		System.out.println("****Job App V1.1****");
		System.out.println("1. ������ ���");
		System.out.println("2. ������ ���� ���");
		System.out.println("3. ������ �˻�"); // �̸����� �˻�
		System.out.println("4. ������ ���� ����");
		System.out.println("9. ����");
		System.out.println("*******************");
		System.out.print("�޴� ��ȣ�� �Է��ϼ���=> ");
	}
	
	public void register() {
		JobSeeker js = new JobSeeker();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ���=> ");
		js.setName(sc.next());
		
		System.out.print("���̸� �Է��ϼ���=> ");
		js.setAge(sc.nextInt());
		
		System.out.print("����ó�� �Է��ϼ���=> ");
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
		System.out.print("�˻��� �̸�=> ");
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
		System.out.print("������ �̸�=> ");
		String name = sc.next();
		int i;
		
		for(i=0;i<count;i++) {
			if(jsarray[i].getName().equals(name)) {
				System.out.printf("%s���� �����Ǿ����ϴ�.\n", jsarray[i].getName());
				jsarray[i] = null; // ����
				count--;
				break;
			}
		}
		for(int j=0;j<count;j++) {
			if(i==count) {
				break;
			}
			jsarray[i] = jsarray[i+1];  // ������ �� ĭ�� ������ ä���ֱ�
			i++;
		}
	}
}
