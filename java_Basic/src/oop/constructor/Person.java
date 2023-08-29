package oop.constructor;

public class Person {
	
	String name;
	int age;
	double cm;
	
	Person(){} // 기본 생성자 1개정도는 깔아놓고 하는게 좋다
	
	Person(String pName, int pAge, double pCm){
		name = pName;
		age = pAge;
		cm = pCm;
	}
	
	
	
	void info() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("키: " + cm + "cm");
	}


}
