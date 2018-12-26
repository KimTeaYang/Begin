package my.day10;

public class ArrayTest7 {

	public static void main(String[] args) {
		/* 배열 복사(copy)
		 System클래스의 메소드: arrayCop()메소드를 활용하면
		 배열을 카피할 수 있다.
		*/
		
		int[] oldArr = {1,2,3,4}; // 원본 배열
		int[] newArr = new int[5]; // 목적 배열
		
		for(int i=0;i<oldArr.length;i++) {
			newArr[i]=oldArr[i];
			System.out.print(newArr[i]+" ");
		}
		
		//public static arraycopy(Object src, int srcPos, 
		//                 Object dest, int destPos, int length)
		/* arraycopy(원본배열, 카피할 배열의 인덱스위치,
		 *           목적배열, 목적배열의 인덱스 위치, 길이)
		*/
		System.out.println();
		
		//원본배열
		String[] oldStr = {"java", "HTML", "JavaScript", "jQuery"};
		
		//목적배열
		String[] newStr = new String[3];
		
		System.arraycopy(oldStr, 1, newStr, 0, 3);
		
		for(int i=0;i<newStr.length;i++) {
			System.out.println(newStr[i]+" ");
		}
	}

}
