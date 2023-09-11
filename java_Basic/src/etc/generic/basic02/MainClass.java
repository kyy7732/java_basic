package etc.generic.basic02;

public class MainClass {

	public static void main(String[] args) {

		Box<Integer, String> b = new Box<>(122, "홍길동");
		String name = b.get(135243423);
		System.out.println(name);
		b.put(10, "김메롱");
		System.out.println(b);
		
		}

}
