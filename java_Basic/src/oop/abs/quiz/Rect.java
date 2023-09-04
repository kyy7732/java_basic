package oop.abs.quiz;

public class Rect extends Shape{

	private int x;
	private int width;
	private int height;
	
	public Rect(String name, int x) {
		super(name);
		this.x = x;
	}
	 public Rect(String name, int width, int height) {
		 super(name);
		 this.width = width;
		 this.height = height;
		 
	}
	
	
	@Override
	public double getArea() {
		if(x != 0) {
			return x * x;
		} else {
			return width * height;
		}
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
}
