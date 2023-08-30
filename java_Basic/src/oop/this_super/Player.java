package oop.this_super;

public class Player {


	String name;
	int level;
	int atk;
	int hp;
	
	Player(){
		System.out.println("Player의 기본 생성자 호출!");
//		System.out.println("this의 주소값: " + this);
		this.level = 1;
		this.atk = 3;
		this.hp = 50;
	}
	
	Player(String name){
		this(); // 같은 클래스의 다른 생성자를 부르는 문법.(다른 생성자 호출은 반드시 최상단에 위치해야 한다.)
		System.out.println("Player의 2번 생성자 호출!");
//		System.out.println("this의 주소값: " + this);
//		level = 1;
//		atk = 3;
//		hp = 50;
		this.name = name; // 새롭게 생성된 그 객체 , 부른 객체
	}
	
	Player(String name, int hp){
		this(name);
		System.out.println("Player의 3번 생성자 호출");
//		this.name = name;
		this.hp = hp;
	}
	
	void attack(Player target) {
		
		if(this == target) {
			System.out.println("스스로는 때릴 수 없습니다.");
			return;
		}
			System.out.println(this.name + "(이)가 " + target.name + "(을)를 공격합니다.");
			
			target.hp -= 10;
			this.hp += 5;
			System.out.println(this.name + "의 체력: " + this.hp + "," +
								target.name + "의 체력: " + target.hp);
			
			
		
		// 출력 메세지: x가 y를 공격합니다.
		
		// 맞는 사람의 hp를 10 낮추고 나의 체력을 5 회복하고 싶다.
		// 결과를 출력하자. ( 나의 체력: xx, 상대의 체력: xx)
		
	}
		
	void characterInfo() {
		
		System.out.println("*** 캐릭터의 정보 ***");
		System.out.println("# 아이디: " + name );
		System.out.println("# 레벨: " + level);
		System.out.println("# 공격력: " + atk);
		System.out.println("# 체력: " + hp);
		System.out.println("이 메서드를 호출한 객체의 이름: " + this.name);
		
		
	}
	
	
	
}
