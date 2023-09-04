package oop.abs.quiz2;

public class Circle extends Shape{

	int r;
	
	@Override
	public double getArea() {
		return Math.PI * r * r;
	}
	
	public  Circle(String name, int r) {
		super(name);
		this.r = r;
	}
}
