
public class RightTriangle extends Triangle{
	
	public RightTriangle(double base, double height) {
		super(base, height, calcHypotenuse(base, height));
	}
	
	private static double calcHypotenuse(double base, double height) {
		return Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
	}
	
	public double getBase() {
		return this.sideA;
	}
	
	public double getHeight() {
		return this.sideB;
	}
	
	public double getHypotenuse() {
		return this.sideC;
	}
	
	public String getType() {
		return "RightTriangle";
	}
	
	public double getArea() {
		return this.sideA * this.sideB / 2;
	}
}
