package oop.abs.quiz2;

public class MainClass {

	public static void main(String[] args) {

		Circle c = new Circle("원", 4);
		Rect r = new Rect("정사각형", 5);
		
		System.out.printf("%s의 넓이: %.1f\n", c.getname(), c.getArea());
		System.out.printf("%s의 넓이: %.1f", r.getname(), r.getArea());
		
	}

}
