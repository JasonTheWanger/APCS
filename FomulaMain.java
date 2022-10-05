/*
 Jason Wang 
 September 29th
 Problem set 2_1
 */
public class FomulaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tuple ans= Formulas.Quadratic(1, 5, 6);
		double slope= Formulas.Slope(0, 0, 2, 3);
		Tuple midP= Formulas.Midpoint(0, 0, 2, 3);
		double aSum= Formulas.ASeries(1, 1, 5);
		double gSum= Formulas.GSeries(3, 2, 3);
		double igSum= Formulas.IGSeries(8, 0.5);
		
		System.out.println("QUADRATIC FORMULA");
		System.out.println("The answer for the quadratic is: " + ans);
		System.out.println("");
		System.out.println("Slope Formula");
		System.out.println("The slope of the line is: " + slope);
		System.out.println("");
		System.out.println("Midpoint Formula");
		System.out.println("The midpoint of the two points is: " + midP);
		System.out.println("");
		System.out.println("Sum of an arithmetic series");
		System.out.println("The sum of the arithmetic series is: " + aSum);
		System.out.println("");
		System.out.println("Sum of an finite geometric series");
		System.out.println("The sum of the finite geometric serie: " + gSum);
		System.out.println("");
		System.out.println("Sum of an infinite geometric series");
		System.out.println("The sum of the infinte geometric series: " + igSum);
	}

}
