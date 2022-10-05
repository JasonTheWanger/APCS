/*
 Jason Wang 
 September 29th
 Problem set 2_1
 */
import java.util.*;
public class Formulas {
	public Formulas() {
		
		
	}
	public static Tuple Quadratic(double a, double b, double c) {
		String result="";
		double d=b*b-4*a*c;
		//if d=0
		if (d==0) {
			double x1= -b/2*a;
			Tuple t = new Tuple(x1, x1);
			return t;
		}
		//if d>0
		else if(d>0) {
			double x2= (-b+Math.sqrt(d))/2*a;
			double x3= (-b-Math.sqrt(d))/2*a;
			Tuple t = new Tuple(x2,x3);
			return t;
		}
		//if d<0
		else if(d<0) {
			return null;
		}
		return null;
		
	}
	public static double Slope(double x1, double y1, double x2, double y2) {
		return (y2-y1)/(x2-x1);
	}
	public static Tuple Midpoint(double x1, double y1, double x2, double y2) {
		return new Tuple((x2-x1)/2, (y2-y1)/2);
	}
	public static double ASeries(double a1, double d, int n) {
		// a1 is the first number in the series
		//d is the common difference
		// n is the number of terms
		double an = a1+d*(n-1);
		return ((a1+an)*n/2);
	}
	public static double GSeries(double g1, double r, int n) {
		// g1 is the first number in the series
		// r is the ratio
		// n is the number of terms 
		return (g1*((1-Math.pow(r, n))/(1-r)));
	}
	public static double IGSeries(double g1, double r) {
		// g1 is the first number in the series
		// r is the ratio  
		return (g1/(1-r));
	}
}
/* 

*/