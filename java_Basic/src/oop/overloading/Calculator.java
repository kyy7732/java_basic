package oop.overloading;

public class Calculator {

	/*
    # 오버로딩 (중복): 하나의 클래스 내부에서 같은 이름을 가진 메서드나
     생성자를 여러 개 중복해서 선언할 수 있게 해주는 문법.
     
    - 오버로딩 적용 조건:
    1. 매개 변수의 데이터 타입이 다를 것! or
    2. 매개 변수의 전달 순서가 다를 것! or
    3. 매개 변수의 개수가 다를 것.
    */
	// 리턴 타입이 다르다고 중복선언이 되는건 아님
	void inputData() {}
	
	void inputData(int s) {}
	
	void inputData(int s, String a) {}
	
//	void inputData(int s, String a) {} (x)
	
	void inputData(String a) {}
	
	void inputData(int a, double d) {}
	
	void inputData(double d, int a) {}
	
//	void inputData(int number) {} (x) 정수 매개값 1개를 받는 메서드가 이미 선언됨.
	
//	string inputData(String number) {
//		return "asdf";
//	} (x) 반환 유형(return type)은 오버로딩에 영향을 미치지 못합니다.
	
	int calcRectArea(int x) {
		int val = x * x;
		System.out.println("정사각형의 넓이는: " + val);
		return val;
	}
	
//	Math.pow(2, 8); // 제곱 메소드 2의 8승 
	
	int clacRectArea(int x, int y) {
		int val = (x * y);
		System.out.println("직사각형의 넓이는: " + val);
		return val;
	}
	
	double clacRectArea(int x, int y, int z) {
		double val = (x + y) * z/2.0;
		System.out.println("사다리꼴의 넓이는: " + val);
		return val;
	}
	
}















