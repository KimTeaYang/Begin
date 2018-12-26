package my.day18;
// 1) Handle하는 방법: try~catch절을 사용해 예외를 직접 처리한다.
public class ExceptionTest {

	public static void main(String[] args) {
		String fruits[] = {"사과", "배", "포도"};
		try {
			for(int i=0;i<4;i++) {
				System.out.println(fruits[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("배열 인덱스 범위가 초과됬어요!!");
		}
		System.out.println("반드시 실행되야 할 코드-----");
	}
}