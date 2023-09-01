package oop.poly.player;

public class Warrior extends Player{

	int rage;
	
	Warrior(String name) { // 자바 기본생성자 모형
		super(name);
		this.rage = 60;
	}
	
	/*
    - 전사의 고유 기능인 rush 메서드를 작성합니다.
    
    - rush의 대상은 모든 직업들 입니다.
    
    - 만약 rush의 대상이 전사라면 10의 피해를 받고,
     마법사라면 20의 피해를 받고, 사냥꾼이라면 15의 피해를 받습니다.
     
    - 서로 다른 데미지를 instanceof를 사용하여 구분해서 적용해 주세요.
    
    - 남은 체력도 출력해 주세요.
    
    - main에서 객체를 생성한 후 호출하셔서 잘 적용됐는지 확인해 주세요.
    */
	
	public void rush(Player p) {
		System.out.printf("%s님이 %s님에게 돌진을 시전했습니다!\n"
				,this.name, p.name);
		
		
		if(p instanceof Warrior) {
			this.hp -= 10;
			System.out.println("같은 종족이므로 " + 10 + "의 피해를 받았습니다.");
			System.out.printf("%s님의 남은 체력: %d\n", p.name, this.hp);
		} else if(p instanceof Mage) {
			this.hp -= 20;
			System.out.println("마법사 종족이므로 " + 20 + "의 피해를 받았습니다.");
			System.out.printf("%s님의 남은 체력: %d\n", p.name, this.hp);
		} else if(p instanceof Hunter) {
			this.hp -= 15;
			System.out.println("사냥꾼 종족이므로 " + 15 + "의 피해를 받았습니다.");
			System.out.printf("%s님의 남은 체력: %d\n", p.name, this.hp);
		}
	}
	
	
	@Override
	void characterInfo() {
		super.characterInfo();
		System.out.println("# 분노: " + rage);
	}
	
}
