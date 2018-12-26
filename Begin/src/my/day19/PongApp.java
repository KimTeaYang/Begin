package my.day19;

import javax.swing.*;

public class PongApp {

	public static void main(String[] args) {	
		String name = JOptionPane.showInputDialog(
				"이름을 입력하세요");
		try {
			login(name);
		}catch(NotSupportedNameException e) {
			e.printStackTrace();
			//예외가 발생한 지점의 스택기록을 출력해서 보여준다.
			
			String msg = e.getMessage();
			System.out.println(msg);
		}
	}
	
	public static void login(String name) 
		throws NotSupportedNameException {
		
		char ch = name.charAt(0);
		
		if(ch == '퐁') {
			System.out.println(name+"님 환영합니다.");
		}else if(ch=='콩') {
			throw new NotSupportedNameException
				("콩씨는 절대로 입장 불가!!");
		}else {
			throw new NotSupportedNameException
				("기타 성씨분들...이용에 제한이 있습니다.");
		}
		
	}
	
}
