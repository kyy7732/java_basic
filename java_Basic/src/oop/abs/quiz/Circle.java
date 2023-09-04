package oop.abs.quiz;

public class Circle extends Shape{
	
	private int rn;
	
	
	public Circle(String name, int r) {
		super(name);
		this.rn = r;
	}

	@Override
	public double getArea() {
		return Math.PI * rn * rn;
	}

	public int getRn() {
		return rn;
	}

	public void setRn(int rn) {
		this.rn = rn;
	}

}
