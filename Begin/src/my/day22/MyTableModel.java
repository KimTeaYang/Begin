package my.day22;

import javax.swing.table.*;
import javax.swing.*;
/* 나만의 모델을 만드는 방법
 *  1) TableModel 인터페이스를 상속받아 구현
 *  2) AbstractTableModel 추상클래스를 상속받아 구현
 *  3) DefaultTableModel 클래스를 상속받아 구현
 * */

public class MyTableModel extends AbstractTableModel{
	
	Object[][] data;
	String[] colNames;

	public MyTableModel(Object[][] data,String[] colNames) {
		this.data = data;
		this.colNames = colNames;
	}

	@Override
	public int getRowCount() {
		return data.length;
	} // 행의 수를 반환

	@Override
	public int getColumnCount() {
		return colNames.length;  
	} // 컬럼수를 반환
	
	@Override
	public Object getValueAt(int row, int col) {
		return data[row][col];
	}
	
	//옵션: 컬럼 제목을 테이블 헤더에 출력하려면 오버라이드
	@Override
	public String getColumnName(int col) {
		return colNames[col];
	}
	
	//옵션: 각 컬럼의 클래스 객체를 반환
	//이걸 오버라이드해야 이미지, 체크박스 등이 표현됨
	@Override
	public Class getColumnClass(int col) {
		Object obj = this.getValueAt(0, col); 
		//첫번째 행의 각각의 컬럼에 해당하는 객체 반환
		Class cls = obj.getClass();
		return cls;
	}
	
	//옵션: 각 컬럼의 셀을 편집 가능하도록 해주려면 오버라이드
	@Override
	public boolean isCellEditable(int row, int col) {
		return (col==5)?false:true;
	}
	
	//옵션: 실제로 수정된 값을 적용시키려면 오버라이드
	@Override
	public void setValueAt(Object obj, int row, int col) {
		//obj: 수정할 값을 가진 객체
		String str = obj.toString();
		switch(col) {
			case 0: // 사번
				data[row][col] = new Integer(str);
				break;
			case 1: // 이름
				data[row][col] = str;
				break;
			case 2: // 아이콘
				data[row][col] = new ImageIcon(str);
				break;
			case 3: // 관리자 여부
				data[row][col] = new Boolean(str);
				break;
		}
	}
}