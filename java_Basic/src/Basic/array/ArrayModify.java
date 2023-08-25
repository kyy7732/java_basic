package Basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModify {

	public static void main(String[] args) {
		String[] foods = {"삼겹살", "족발", "피자", "햄버거"};
		System.out.println(Arrays.toString(foods));
		
		foods[0] = "치킨"; // 첫번째 내용 수정
		foods[2] = "탕수육"; // 3번째 내용 수정
		System.out.println(Arrays.toString(foods));
		
		System.out.println("-------------------------------");
		
		// 배열의 인덱스 탐색
		Scanner sc = new Scanner(System.in);
		System.out.print("탐색할 음식을 입력하세요: ");
		String name = sc.next();
		
		// int = 0 2번째 방법 int i (int지우고)
		// boolean flag = false; 3번째 방법
		
		
		for(int i=0; i < foods.length; i++) {
			if(name.equals(foods[i])) {
				System.out.println("탐색 완료!");
				System.out.println("인덱스: " + i + "번");
				// flag = true; 3번째 방법
				break;
			} else if (i == foods.length-1) { // 첫번째 방법
				// foods길이가 4개인데 -1을 하므로 foods의 없는 내용은 전부 else if로 온다.
				System.out.println("그런 음식은 없습니다.");
				break;
		}
		}
		
		// 2번째 방법
		/*
		if(i == foods.length) {
			System.out.println("없는 음식입니다.");
		}
		*/
		// 3번째 방법
		/*
		if(!flag) { 
			System.out.println("없는 음식입니다.");
		}
		*/
		
		sc.close();
	}

}
