package oop.abs.quiz;

public class MainClass {

	public static void main(String[] args) {

		Shape c = new Circle("원", 4);
		Shape r = new Rect("정사각형", 5);
		
		System.out.printf("%s의 넓이는: %.2f\n", c.getName(), c.getArea());
		System.out.println(r.getName()+ "의 넓이는: " + r.getArea());
	}

}
