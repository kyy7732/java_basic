package oop.abs.quiz2;

public abstract class Shape {

	private String name;
	
	public Shape() {}
	
	public Shape(String name) {
		this.name = name;
	}
	
	public abstract double getArea();
	
	
	public String getname() {
		return this.name;
	}
	
}