package Basic.method;

import java.util.Scanner;

public class MethodQuiz01 {

	static int calcDivisor(int val) {
		int i = 1;
		int count = 0;
		System.out.println("약수: ");
		while(i <= val) {
			if(val % i == 0) {
				System.out.print(i + " ");
				count++;
			}
			i++;
		}
		System.out.println();
		return count;
	} 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		/*
        1. calcDivisor()라는 메서드를 선언하세요.
        2. 이 메서드는 정수 하나를 전달받아서 해당 정수의
         모든 약수를 가로로 출력하고 약수의 개수를 리턴하는
         메서드입니다. (가로로 출력은 메서드 내부에서 진행)
        3. 메서드 선언을 완료하시고, main에서
         72의 약수의 개수와 10의 약수의 개수를 출력해 보세요.
         호출 두번 하시는 거에요.
        */
		System.out.println("숫자를 입력하세요");
		System.out.println("> ");
		int val = sc.nextInt();
		System.out.println("약수의 개수는 " + calcDivisor(val) + "개 입니다.");
		
		System.out.println("숫자를 입력하세요");
		System.out.println("> ");
		int val1 = sc.nextInt();
		System.out.println("약수의 개수는 " + calcDivisor(val1) + "개 입니다.");
		
		
	}

}
