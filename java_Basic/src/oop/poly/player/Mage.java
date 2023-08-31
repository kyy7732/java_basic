package oop.poly.player;

public class Mage extends Player {

	int mana;
	
	Mage(String name){
		super(name);
		this.mana = 100;
	}
	
	public void blizzard(Player[] p) {
		System.out.println(this.name + "님이 눈보라 시전!!!");
		System.out.println("----------------------------");
		for(Player s : p) {
			attack(s);
		}
	}
	
	@Override
	void characterInfo() {
		super.characterInfo();
		System.out.println("# 정신력: " + mana);
	}
	
}
