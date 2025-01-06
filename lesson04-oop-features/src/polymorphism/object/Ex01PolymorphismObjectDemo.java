package polymorphism.object;

public class Ex01PolymorphismObjectDemo {

	public static void main(String[] args) {
		// 1. Khởi tạo đối tượng cho chính KDL của nó
		// ChinhNo new ChinhNo
		Shape shape = new Shape();
		shape.paint();
		shape.calcS();

		Square square = new Square();
		square.paint();
		square.calcS();

		Rectangle rectangle = new Rectangle();
		rectangle.paint();
		rectangle.calcS();

		System.out.println("==================");

		// int, long
		// int a = 5;
		// long b = a;
		// long c = 10; // cha c = con

		// int max 2 ty
		// long max 4 ty

		// long a = 10; // ok
		// a = Integer.MAX_VALUE + 2; // [-2147483648, 2147483647]
		// int b = (int)a;

		// System.out.println("b --> " + b);

		// 2. Khởi tạo đối tượng KDL con cho biến KDL cha
		// Cha new Con

		// Một biến shape lúc compile là kiểu Shape nhưng lúc runtime nó
		// có thể là/trỏ đến KDL Shape/Rectangle/Square

		// Một biến lúc compile là KDL x nhưng lúc runtime nó có thể là/trỏ đến
		// đối tượng chính nó hoặc các KDL con của X

		// Biến của x lúc compile nó sẽ gọi các hàm của KDL cha, lúc runtime
		// sẽ gọi hàm của KDL con

		Shape sh1 = new Square();
		sh1.paint();
		sh1.calcS();

		Shape sh2 = new Rectangle();
		sh2.paint();
		sh2.calcS();

	}

}
