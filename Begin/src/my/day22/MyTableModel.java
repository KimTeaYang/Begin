package my.day22;

import javax.swing.table.*;
import javax.swing.*;
/* ������ ���� ����� ���
 *  1) TableModel �������̽��� ��ӹ޾� ����
 *  2) AbstractTableModel �߻�Ŭ������ ��ӹ޾� ����
 *  3) DefaultTableModel Ŭ������ ��ӹ޾� ����
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
	} // ���� ���� ��ȯ

	@Override
	public int getColumnCount() {
		return colNames.length;  
	} // �÷����� ��ȯ
	
	@Override
	public Object getValueAt(int row, int col) {
		return data[row][col];
	}
	
	//�ɼ�: �÷� ������ ���̺� ����� ����Ϸ��� �������̵�
	@Override
	public String getColumnName(int col) {
		return colNames[col];
	}
	
	//�ɼ�: �� �÷��� Ŭ���� ��ü�� ��ȯ
	//�̰� �������̵��ؾ� �̹���, üũ�ڽ� ���� ǥ����
	@Override
	public Class getColumnClass(int col) {
		Object obj = this.getValueAt(0, col); 
		//ù��° ���� ������ �÷��� �ش��ϴ� ��ü ��ȯ
		Class cls = obj.getClass();
		return cls;
	}
	
	//�ɼ�: �� �÷��� ���� ���� �����ϵ��� ���ַ��� �������̵�
	@Override
	public boolean isCellEditable(int row, int col) {
		return (col==5)?false:true;
	}
	
	//�ɼ�: ������ ������ ���� �����Ű���� �������̵�
	@Override
	public void setValueAt(Object obj, int row, int col) {
		//obj: ������ ���� ���� ��ü
		String str = obj.toString();
		switch(col) {
			case 0: // ���
				data[row][col] = new Integer(str);
				break;
			case 1: // �̸�
				data[row][col] = str;
				break;
			case 2: // ������
				data[row][col] = new ImageIcon(str);
				break;
			case 3: // ������ ����
				data[row][col] = new Boolean(str);
				break;
		}
	}
}