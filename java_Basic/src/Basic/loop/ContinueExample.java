package Basic.loop;

public class ContinueExample {

	public static void main(String[] args) {

		for(int i = 1; i <= 10; i++) {
			if(i % 2 != 0) continue; // continue : 이하의 코드가 실행되지않는다
			// 그 조건을 실행시키지 않고 넘어가기
			System.out.println(i + " ");
		}
		System.out.println("\n반복문 종료!");
		
	}

}
