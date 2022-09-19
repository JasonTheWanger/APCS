import java.text.DecimalFormat;
import java.util.Scanner;
public class writing_Practice_1_1_1 {
	static DecimalFormat df = new DecimalFormat("0.0");
	static Scanner scan = new Scanner(System.in);
	public static void main (String[] args) {
		double fah;
		System.out.println("Please enter the temperature in celcius");
		double cel = scan.nextDouble();
		fah=cel*9/5+32;
		System.out.println("Temperature in fahrenheit: " + df.format(fah) + " F");
	}
}