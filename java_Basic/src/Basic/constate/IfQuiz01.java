package Basic.constate;

import java.util.Scanner;

public class IfQuiz01 {

	public static void main(String[] args) {
		
		 /*
        - 정수를 2개 입력받아서, 두 정수 중 어느 수가 큰 지
        혹은 같은지를 판별하시면 됩니다.
        ex)
        입력받은 수: 4, 7 -> 7이 큰 수 입니다.
        입력받은 수: 10, 3 -> 10이 큰 수 입니다.
        입력받은 수: 5, 5 -> 같은 수 입니다.
       */
		
		Scanner sc = new Scanner(System.in);

		
		System.out.print("첫번째 수를 입력하세요: ");
		int num1 = sc.nextInt();
		System.out.print("두번째 수를 입력하세요: ");
		int num2 = sc.nextInt();
		System.out.printf("입력받은 수: %d, %d\n", num1, num2);
		
		if(num1 < num2) {
			System.out.printf("%d이(가) 큰 수 입니다.", num2);
		} else if(num1 > num2) {
			System.out.printf("%d이(가) 큰 수 입니다.", num1);
		} else if(num1 == num2) {
			System.out.println("같은 수 입니다.");
		} else {
			System.out.println("잘 못 입력하셨습니다.");
		}
		
		sc.close();
	}


}




















































