package Basic.constate;

import java.util.Scanner;

public class SwitchQuiz01 {

	public static void main(String[] args) {

		/*
		         - 정수를 하나 입력받고, 연산자를 하나 입력 받으세요.
		          다시 정수를 입력받아서, 사용자가 선택한 연산자를 기준으로
		          연산 결과를 출력해 주시면 됩니다. (switch문 사용)
		          연산자가 잘못 입력되었다면 연산자를 똑바로 입력하라고
		          결과를 말씀해 주세요.
		*/
		
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int value1 = sc1.nextInt();
		System.out.print("연산자를 입력하세요: ");
		String plus = sc2.next();
		System.out.print("숫자를 입력하세요: ");
		int value2 = sc3.nextInt();
		
		
		switch(plus) {
			case "+":
				System.out.printf("%d %s %d = %d", value1, plus, value2, (value1 + value2));
				break;
			case "-":
				System.out.printf("%d %s %d = %d", value1, plus, value2, (value1 - value2));
				break;
			case "*":
				System.out.printf("%d %s %d = %d", value1, plus, value2, (value1 * value2));
				break;
			case "/":
				System.out.printf("%d %s %d = %d", value1, plus, value2, (value1 / value2));
				break;
			case "%":
				System.out.printf("%d %s %d = %d", value1, plus, value2, (value1 % value2));
				break;
			default:
				System.out.println("연산자를 똑바로 입력해주세요");
			
		}
		
		
		sc1.close();
		sc2.close();
		sc3.close();
		
	}

}