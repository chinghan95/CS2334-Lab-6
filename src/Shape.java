/**
 * This class is abstract class, containing three abstract methods(getType(), getPerimeter(), getArea()).
 * The class also implements Comparable, comparing the type of Shape first, and then perimeter, and then finally comparing area.
 * @author Ching Han Huang
 * @version 1.0
 */
// Questions: What is the difference between Comparable and Comparator
public abstract class Shape implements Comparable<Shape> {
	
	protected int id;
	protected static int nextID = 0;
	
	public Shape() {
		this.id = nextID;
		nextID++;
	}
	
	public int getID() {
		return this.id;
	}
	
	public abstract String getType();
	public abstract double getPerimeter();
	public abstract double getArea();
	
	@Override
	public int compareTo(Shape other) {
		String type = this.getType();                	// This type  
		String otherType = other.getType();       		// Comparison type
		double perimeter = this.getPerimeter();         // This perimeter  
		double otherPerimeter = other.getPerimeter();   // Comparison perimeter
		double area = this.getArea();              		// This area  
		double otherArea = other.getArea();         	// Comparison area
		int comparisonVal = 0;        					    // Outcome of comparison
		
		// Compare based on type of object
		// comparisonVal = 0 ==> Types are same.
		// comparisonVal = 1 ==> This type's Unicode value of strings is larger than other.
		// comparisonVal = -1 ==> This type's Unicode value of strings is smaller than other.

		comparisonVal = type.compareTo(otherType);		
		
		// Then compare based on perimeter of object
		if (comparisonVal == 0) {						// Types are same.
			if (perimeter < otherPerimeter) {
				comparisonVal = -1;
			}
			else if (perimeter > otherPerimeter) {
				comparisonVal = 1;
			}
		}
		
		// Then compare based on area of object
		if (comparisonVal == 0) {						// Perimeters are same.
			if (area < otherArea) {
				comparisonVal = -1;
			}
			else if (area > otherArea) {
				comparisonVal = 1;
			}
		}
		
		return comparisonVal;		
	}
	
	@Override
	public String toString() {
		return getType()
				+ ", ID: " + id
				+ ", PERIMETER: " + String.format("%.1f", getPerimeter())
				+ ", AREA: " + String.format("%.1f", getArea());
	}
}
