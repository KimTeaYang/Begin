package my.day18;
// 1) Handle�ϴ� ���: try~catch���� ����� ���ܸ� ���� ó���Ѵ�.
public class ExceptionTest {

	public static void main(String[] args) {
		String fruits[] = {"���", "��", "����"};
		try {
			for(int i=0;i<4;i++) {
				System.out.println(fruits[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("�迭 �ε��� ������ �ʰ�����!!");
		}
		System.out.println("�ݵ�� ����Ǿ� �� �ڵ�-----");
	}
}