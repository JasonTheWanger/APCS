import java.util.*;
import java.text.DecimalFormat;
public class writing_Practice_1_1_2 {
	static DecimalFormat df = new DecimalFormat("0.00");
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int totalSecs, remSecs;
		double percentage;
		System.out.println("Enter your hours: ");
		int hrs = scan.nextInt();
		System.out.println("Enter your mins: ");
		int mins = scan.nextInt();
		System.out.println("Enter your secs: ");
		int secs = scan.nextInt();
		
		totalSecs=hrs*3600+mins*60+secs;
		System.out.println("Total seconds have passed: " + totalSecs);
		remSecs=24*3600-totalSecs;
		System.out.println("Total seconds remain: " + remSecs);
		percentage=totalSecs/(24.0*3600.0)*100;
		System.out.println("Percentage has passed in the day: " + df.format(percentage) + "%");
	}

}
