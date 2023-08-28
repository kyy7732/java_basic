package Basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeManager {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 사원의 정보: 사번, 이름, 나이, 부서명
		String[] userNums = new String[100];
		String[] names = new String[100];
		int[] ages = new int[100];
		String[] departments = new String[100];

		// 실제로 입력된 데이터(사원의 정보)의 개수를 체크하는 변수.
		int count = 0;




	menu: while(true) {
			System.out.println("\n========== 사원 관리 프로그램 ==========");
			System.out.println("# 1. 사원 정보 신규 등록");
			System.out.println("# 2. 모든 사원 정보 보기");
			System.out.println("# 3. 사원 정보 검색");
			System.out.println("# 4. 사원 정보 수정");
			System.out.println("# 5. 사원 정보 삭제");
			System.out.println("# 6. 프로그램 종료");            
			System.out.println("====================================");

			System.out.print("> ");
			int menu = sc.nextInt();


			if(menu == 1) { // Clear!
				//사원 정보 4가지를 입력받아 각 배열에 저장하는 코드를 작성.
				//사번은 중복되면 안됩니다.
				//(무한루프를 구현해서 사번 중복이 발생하면 다시 입력받기.)

				outer: for(int i = 0; i < userNums.length; i++) {
					System.out.println("사원 정보를 입력해 주세요.");
					System.out.print("사번: ");
					String num = sc.next();

					for(int j = 0; j < userNums.length; j++) {
						if(num.equals(userNums[j])) {
							System.out.println("중복된 값입니다.");
							continue outer;
						}
					}
					System.out.print("이름: ");
					names[count] = sc.next();
					System.out.print("나이: ");
					ages[count] = sc.nextInt();
					System.out.print("부서명: ");
					departments[count] = sc.next();

					userNums[count] = num;
					System.out.println(names[count] + "님의 정보가 정상 등록되었습니다.");
					count++;
					break;
				}

			}else if(menu == 2) {
				//각 배열을 반복문을 통해 저장된 데이터까지만 출력하도록 작성. (count)등록한 수 만큼 카운트가 올라간다
				//만약 사용자가 사원 등록을 한 명도 하지 않았다면
				//"등록된 사원 정보가 없습니다." 를 출력하시면 됩니다.
				if(count == 0) {
					System.out.println("등록된 사원 정보가 없습니다.");
				} else {
					for(int i = 0; i < userNums.length; i++) {
						if(userNums[i] == null) break;
						System.out.printf("사번: %s\t 이름: %s\t 나이: %d\t 부서명: %s\n", 
											userNums[i], names[i], ages[i], departments[i]);
					}
					System.out.println("총 사원수: " + count + "명 입니다.");
				}
			} else if(menu == 3) {
				//입력한 사번에 일치하는 사원의 4가지 정보를 모두 출력하세요.
				//입력한 사번이 존재하지 않는다면 "조회하신 사원의 정보가 없습니다." 를 출력.
				boolean flag3 = false; // 3. 사원 정보 검색(일치하는사원없을때 사용)
				System.out.println("찾으실 사원의 사번을 입력해주세요");
				System.out.print("> ");
				String search = sc.next();
				for(int i = 0; i < userNums.length; i++) {
					if(search.equals(userNums[i])) {
						System.out.printf("사번: %s\t 이름: %s\t 나이: %d\t 부서명: %s\n", 
										userNums[i], names[i], ages[i], departments[i]);
						flag3 = true;
						break;
					}
				}
				if(!flag3) {
					System.out.println("조회하신 사원의 정보가 없습니다.");
				}
			} else if(menu == 4) {
				//해당 사번과 일치하는 사원의 나이와 부서를 선택적으로 변경할 수 있도록
				//프로그램을 구성하시고, 나이와 부서를 수정하는 코드를 작성하세요.
				//사번 입력 -> 존재하는 사번이 맞다면 -> [1. 나이변경 | 2. 부서변경 | 3.취소]
				//사번이 존재하지 않는다면 없다고 얘기해 주세요.
				System.out.println("수정하실 사원의 사번을 입력해 주세요.");
				System.out.print("> ");
				String search = sc.next();// 수정할 사원의 사번 입력값
				boolean flag1 = false; // 4. 사원 정보 수정(사번 없을때)

				for(int i = 0; i < userNums.length; i++) {
					if(search.equals(userNums[i])) {
			menu4:	while(true) {
						System.out.println("[1. 나이변경 | 2. 부서변경 | 3.취소]");
						System.out.print("> ");
						int num = sc.nextInt(); // 선택지 입력
						switch(num) {
							case 1: 
								System.out.println("변경전 나이: " + ages[i]);
								System.out.println("나이를 수정해 주세요.");
								System.out.print("> ");
								ages[i] = sc.nextInt(); // 나이 변경값 받기
								System.out.println("변경 후 나이: " + ages[i]);
								break;
							case 2:
								System.out.println("변경전 부서: " + departments[i]);
								System.out.println("부서를 변경해 주세요.");
								System.out.print("> ");
								departments[i] = sc.next(); // 부서 변경값 받기
								System.out.println("변경된 부서: " + departments[i]);
								break;
							case 3:
								System.out.println("이전으로 돌아갑니다.");
								break menu4;
							default: 
								System.out.println("잘못 입력했습니다.");
						} // end switch
						} // end while
						flag1 = true;
						break;
					} // end if
				} // end for
				
				if(!flag1){ // 사번 존재x
					System.out.println("입력하신 사번은 없습니다.");
					flag1 = false;
				}
			} else if(menu == 5) {
				//사번을 입력받아서
				//해당 사번과 일치하는 사원의 4가지 정보를 각 배열에서 모두 삭제하고
				//삭제하기 전에 "정말 삭제하시겠습니까? [Y/N]" 를 입력받아서
				//y를 눌렀을 시에 삭제가 되도록 코드를 구성하세요.
				//배열의 크기는 줄이지 않겠습니다. 삭제할 인덱스를 기준으로 뒤에 있는 값들을
				//앞으로 한칸씩 땡기신 다음 count를 하나 내려주시면 됩니다.
				System.out.println("삭제하실 사원의 사번을 입력하세요.");
				System.out.print("> ");
				String number = sc.next();
				boolean flag12 = false; // 삭제 됨 표시
				boolean flagtr = false; // 입력값 없을때 표시
				
				int i;
			for(i = 0; i < userNums.length; i++) {
				if(number.equals(userNums[i])) {
						System.out.println("이 사원이 맞습니까?");
						System.out.printf("사번: %s     이름: %s     나이: %d     부서명: %s\n", 
											userNums[i], names[i], ages[i], departments[i]);
						System.out.println("[Y/N]");
						System.out.print("> ");
						String answer = sc.next().toUpperCase();
					for(int j = i; j < userNums.length - 1; j++) {
						if(answer.equals("Y") || answer.equals("ㅛ")) {
							/*
							if(i == userNums.length - 1) { 
								// 배열이 줄지 않고 그 크기대로 쓰는 상황에서는 
								// 맨 마지막배열은 안끌어와지므로 따로 처리해줘야한다.
								userNums[i] = null;
								names[i] = null;
								ages[i] = 0;
								departments[i] = null;
							}
							*/
							userNums[j] = userNums[j + 1];
							names[j] = names[j + 1];
							ages[j] = ages[j + 1];
							departments[j] = departments[j + 1];
							flag12 = true;
						} else if(answer.equals("N") || answer.equals("ㅜ")){
							System.out.println("삭제가 취소되었습니다.");
							continue menu;
						} else {
							System.out.println("다시 입력해 주세요.");
							break;
						}
					}
					flagtr = true;
					} // end if		
				} // end for
				if(!flagtr){
					System.out.println("입력하신 사번의 정보가 없습니다.");
					continue menu;
				}

				String[] temp1 = new String[userNums.length];
				String[] temp2 = new String[names.length];
				int[] temp3 = new int[ages.length];
				String[] temp4 = new String[departments.length];
				
				for(int j = 0; j < userNums.length; j++) {
					temp1[j] = userNums[j];
					temp2[j] = names[j];
					temp3[j] = ages[j];
					temp4[j] = departments[j];
					
				}
				
				userNums = temp1;
				names = temp2;
				ages = temp3;
				departments = temp4;
				
				temp1 = null;
				temp2 = null;
				temp3 = null;
				temp4 = null;
				if(flag12) {
					System.out.println("삭제되었습니다.");
					count--;
				}

				flagtr = false;
				continue menu;
			} else if(menu == 6) {
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				break; // while true break
			} else {
				System.out.println("메뉴를 잘못 입력하셨습니다.");
			}

		} // end while true


	} // end main
}
































