// Jason Wang
// September 29th
// Problem 2_1
public class Tuple {
	private double x, y;
	public Tuple() {
		x=0;
		y=0;
	
	}
	public Tuple(double X, double Y) {
		x=X;
		y=Y;
	}
	public String toString() {
		String result="";
		result +=x +", "+y;
		return result;
	}
}
