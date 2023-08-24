package Basic.loop;

import java.util.Scanner;

public class BreakQuiz01 {

	public static void main(String[] args) {

		/*
        1. 2가지의 정수를 1~100사이의 난수를 발생시켜서 
         지속적으로 문제를 출제한 후 정답을 입력받으세요.
         사용자가 0을 입력하면 반복문을 탈출시키세요.
         
        2. 종료 이후에 정답 횟수와 오답 횟수를 각각 출력하세요.
       */
		
		Scanner sc = new Scanner(System.in);

		int o = 0;
		int x = 0;
		
		System.out.println("연산 퀴즈!");
		System.out.println("0번을 누르면 종료합니다.");
		while(true) {
			int rnd = (int) ((Math.random() * 100) + 1);
			int rnd1 = (int) ((Math.random() * 100) + 1);
			int num = (int)(Math.random()*2); // 0,1 랜덤 연산(0.0 ~ 2.0미만)
			
			int correct; // 정답
			
			if(num == 0) {
				System.out.println(rnd  + " + " + rnd1 + "=" + "???");
				correct = rnd + rnd1;
			} else {
				System.out.println(rnd  + " - " + rnd1 + "=" + "???");
				correct = rnd - rnd1;
			}
			
			System.out.print("> ");
			int answer = sc.nextInt();

			
			if(answer == correct) {
				System.out.println("정답입니다!");
				o++;
			} else if(answer == 0) {
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("틀렸습니다~");
				x++;
			}
		}
		
		System.out.println("----------------------");
		System.out.println("정답 횟수: " + o + "회");
		System.out.println("오답 횟수: " + x + "회");
		sc.close();
		

		
		
		
		
		
		
		
		
		
	}

}
