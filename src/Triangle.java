
public abstract class Triangle extends Polygon{
	
	protected double sideA;
	protected double sideB;
	protected double sideC;
	
	public Triangle(double sideA, double sideB, double sideC) {
		super(checkLengths(sideA, sideB, sideC));
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}
	
	private static double[] checkLengths(double a, double b, double c) {
		double[] arr = {a, b, c};
		double maxLength = a;
		double sumXY;
		if(maxLength < b) {
			maxLength = b;
			if(maxLength < c) {
				maxLength = c;
				sumXY = a + b;
			}
			else {
				sumXY = a + c;
			}
		}
		else if(maxLength < c) {
			maxLength = c;
			sumXY = a + b;
		}
		else {
			sumXY = b + c;
		}
		
		if (maxLength > sumXY) {
			throw new IllegalArgumentException();
		}
		else {
			return arr;
		}
	}
	
	public double getSideA() {
		return this.sideA;
	}

	public double getSideB() {
		return this.sideB;
	}

	public double getSideC() {
		return this.sideC;
	}
	
	public double getPerimeter() {
		return this.sideA + this.sideB + this.sideC;
	}
}
