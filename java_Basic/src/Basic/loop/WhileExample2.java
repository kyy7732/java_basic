package Basic.loop;

public class WhileExample2 {

	public static void main(String[] args) {

		int i = 48; // begin
		
		while(i <= 150) { // end
			
			if(i % 8 == 0) {
				System.out.print(i + " ");
			}
			i++; // step
		}		
		System.out.println();  // 단순 줄 개행
		
		// 1 ~ 100까지의 정수 중 4의 배수이면서
		// 8의 배수는 아닌 수를 가로로 출력해 보세요.
		
		int j = 1;
		while(j <= 100) {
			if(j % 4 == 0 && j % 8 != 0) {
				System.out.print(j + " ");
			}
			j++;
		}
		
		System.out.println();
		
		// 1 ~ 30000까지의 정수 중 258의 배수의 개수를 출력.
		
		int k = 1;
		int num = 0;
		while(k <= 30000) {
			if(k % 258 == 0) {
				num++;
			}
			k++;
		}
		System.out.println("---------------------------------");
		System.out.println(num);
		
		
		// 1000의 약수의 개수를 구하세요.
		int l = 1;
		int count = 0;
		
		while(l <= 1000) {
			if(1000 % l == 0) {
				count++;
				}
			l++;
		}
		System.out.printf("1000의 약수의 개수: %d개\n", count);
		
		
	}
}
















