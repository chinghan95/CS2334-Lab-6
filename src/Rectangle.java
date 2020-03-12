
public class Rectangle extends Polygon{
	
	protected double width;
	protected double height;
	
	public Rectangle(double width, double height) {
		super(lengthArray(width, height));
		this.width = width;
		this.height = height;
	}
	
	private static double[] lengthArray(double width, double height) {
		double[] lenArr  = new double[] {width, height};
		return lenArr;
	}
	public double getWidth() {
		return this.width;
	}
	
	public double getHeight() {
		return this.height;
	}

	public String getType() {
		return "Rectangle";
	}
	
	public double getPerimeter() {
		return 2 * (this.width + this.height);
	}
	
	public double getArea() {
		return this.width * this.height;
	}

}
