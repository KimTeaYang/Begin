package my.day10;

public class ArrayTest7 {

	public static void main(String[] args) {
		/* �迭 ����(copy)
		 SystemŬ������ �޼ҵ�: arrayCop()�޼ҵ带 Ȱ���ϸ�
		 �迭�� ī���� �� �ִ�.
		*/
		
		int[] oldArr = {1,2,3,4}; // ���� �迭
		int[] newArr = new int[5]; // ���� �迭
		
		for(int i=0;i<oldArr.length;i++) {
			newArr[i]=oldArr[i];
			System.out.print(newArr[i]+" ");
		}
		
		//public static arraycopy(Object src, int srcPos, 
		//                 Object dest, int destPos, int length)
		/* arraycopy(�����迭, ī���� �迭�� �ε�����ġ,
		 *           �����迭, �����迭�� �ε��� ��ġ, ����)
		*/
		System.out.println();
		
		//�����迭
		String[] oldStr = {"java", "HTML", "JavaScript", "jQuery"};
		
		//�����迭
		String[] newStr = new String[3];
		
		System.arraycopy(oldStr, 1, newStr, 0, 3);
		
		for(int i=0;i<newStr.length;i++) {
			System.out.println(newStr[i]+" ");
		}
	}

}
