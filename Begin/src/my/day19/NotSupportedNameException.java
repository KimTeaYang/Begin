package my.day19;
/* 1. ��������� ���� Ŭ���� �����
 *  [1] Exception�� ��ӹ޴´�.
 *  [2] �����ڸ� �����Ͽ� ������ �ȿ��� super("���ܸ޼���")�� ȣ���Ѵ�.
 * 2. ��������� ���� ����ϱ�
 *  [1] throw new ��������ǿ��ܻ���()
 *  [2] �޼ҵ� ����� throws ��������� ���� 
 * */
public class NotSupportedNameException extends Exception{
	
	public NotSupportedNameException() {
		super("�������� �ʴ� �̸��Դϴ�.");
	}
	
	public NotSupportedNameException(String msg) {
		super(msg);
	}
}