package Basic.datatype;

public class IntegerExample {

	public static void main(String[] args) {
		
		/*
        # 리터럴: 변수에 저장되기 전의 상수값.
        자바의 정수 리터럴의 타입은 int 입니다.
        int보다 더 큰 범위의 수를 표현하기 위해서는 뒤에 L을 붙여서
        long타입으로 인식시켜야 합니다.
        */
		
		byte a = 127;
//		short b = 32768;
		int c = 2147483647;
		long d = 2147483648L; 
		// 기본값이 int이므로 int보다 큰 범위를 사용하려면 숫자 뒤에
		// L을 붙여야 한다.
		
		char c1 = 'A';
		System.out.println(c1);
		
		char c2 = 65; //(A) 
		System.out.println(c2);
		
	}

}
