
public class Test {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(new Point(3,5), new Point(6,10));
		Rectangle rectangle2 = new Rectangle(new Point(3,5), new Point(6,10));
		
		if (rectangle.isOverlapping(rectangle2)) {
			System.out.println("collision exists");
		} else {
			System.out.println("no collision");
		}
	}

}
