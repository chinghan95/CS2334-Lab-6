import java.util.ArrayList;
import java.util.Collections;

public class Test {
	public static void main(String[] args) {
		
		// Test Circle class
		Circle c = new Circle(10);
		System.out.println("Test Circle class");
		System.out.println("Area: " + c.getArea());
		System.out.println("Perimeter: " + c.getPerimeter());
		System.out.println("Type: " + c.getType());
		System.out.println("Radius: " + c.getRadius());
		System.out.println();
		
		// Test Rectangle class
		System.out.println("Test Rectangle class");
		Rectangle r = new Rectangle(4.056531728583989, 20);
		System.out.println("Width: " + r.getWidth());
		System.out.println("Height: " + r.getHeight());
		System.out.println("Area: " + r.getArea());
		System.out.println("Perimeter: " + r.getPerimeter());
		System.out.println("Type: " + r.getType());
		System.out.println();
		
		// Test Square class
		System.out.println("Test Square class");
		Square s = new Square(5.052065583918753);
		System.out.println("Side: " + s.getSide());
		System.out.println("Area: " + s.getArea());
		System.out.println("Perimeter: " + s.getPerimeter());
		System.out.println("Type: " + s.getType());
		System.out.println();
		
		/* Triangle class is abstract class, it can not instantiate.
		// Test Triangle class
		System.out.println("Test Triangle class");
		Triangle t = new Triangle(3.0, 4.0, 5.0);
		System.out.println("SideA: " + t.getSideA());
		System.out.println("SideB: " + t.getSideB());
		System.out.println("SideC: " + t.getSideC());
		System.out.println("Area: " + t.getArea());
		System.out.println("Perimeter: " + t.getPerimeter());
		System.out.println("Type: " + t.getType());
		System.out.println();
		*/	
		
		// Test RightTriangle class
		System.out.println("Test RightTriangle class");
		RightTriangle rt = new RightTriangle(6.856803851990856, 4.0);
		System.out.println("Base: " + rt.getBase());
		System.out.println("Height: " + rt.getHeight());
		System.out.println("Hypotenuse: " + rt.getHypotenuse());
		System.out.println("Perimeter: " + rt.getPerimeter());
		System.out.println("Type: " + rt.getType());
		System.out.println("Area: " + rt.getArea());
		System.out.println();
		
		// Test sort method
		Shape c1 = new Circle(10);
		Shape c2 = new Circle(100);
		Shape s1 = new Square(20);
		Shape s2 = new Square(10);
		Shape r1 = new Rectangle(100, 200);
		Shape r2 = new Rectangle(10, 20);
		Shape rt1 = new RightTriangle(30, 40);
		Shape rt2 = new RightTriangle(5, 6);
		
		ArrayList<Shape> list = new ArrayList<>();
		
		list.add(rt1);
//		list.add(rt2);
//		list.add(r1);
//		list.add(r2);
//		list.add(s1);
//		list.add(s2);
		list.add(c1);
		list.add(c2);
		
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}
