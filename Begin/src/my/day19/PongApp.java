package my.day19;

import javax.swing.*;

public class PongApp {

	public static void main(String[] args) {	
		String name = JOptionPane.showInputDialog(
				"�̸��� �Է��ϼ���");
		try {
			login(name);
		}catch(NotSupportedNameException e) {
			e.printStackTrace();
			//���ܰ� �߻��� ������ ���ñ���� ����ؼ� �����ش�.
			
			String msg = e.getMessage();
			System.out.println(msg);
		}
	}
	
	public static void login(String name) 
		throws NotSupportedNameException {
		
		char ch = name.charAt(0);
		
		if(ch == '��') {
			System.out.println(name+"�� ȯ���մϴ�.");
		}else if(ch=='��') {
			throw new NotSupportedNameException
				("�ι�� ����� ���� �Ұ�!!");
		}else {
			throw new NotSupportedNameException
				("��Ÿ �����е�...�̿뿡 ������ �ֽ��ϴ�.");
		}
		
	}
	
}
