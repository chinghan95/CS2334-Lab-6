
public class Square extends Rectangle{
	
	public Square(double side) {
		super(side, side);
	}
	
	public double getSide() {
		return super.getHeight();
	}
	
	public String getType() {
		return "Square";
	}
}
