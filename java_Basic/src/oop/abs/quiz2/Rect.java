package oop.abs.quiz2;

public class Rect extends Shape{

	int x;
	
	@Override
	public double getArea() {
		return x * x;
	}
	
	public Rect(String name, int x) {
		super(name);
		this.x = x;
	}
	
	
}
