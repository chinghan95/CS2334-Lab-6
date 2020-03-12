
public class Circle extends Shape{
	
	private double radius;
	
	// Non-default constructor
	public Circle(double radius) {
		if (radius <= 0) {
			//radius = Math.abs(radius);
			throw new IllegalArgumentException("Circle created with a negative radius.");
		}
		this.radius = radius;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	@Override
	public String getType() {
		return "Circle";
	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI * this.radius;
	}

	@Override
	public double getArea() {
		return Math.PI * Math.pow(this.radius, 2);
	}

}
