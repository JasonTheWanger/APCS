import java.util.*;
public class writing_Practice_1_1_3 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int mins, hrs;
		final int seconds;
		System.out.println("Please enter the seconds:");
		int secs= scan.nextInt();
		seconds =secs;
		hrs=secs/3600;
		secs%=3600;
		mins=secs/60;
		secs%=60;
		System.out.println(seconds + " seconds=" + hrs + " hrs, " + mins + " mins, " + secs + " secs");
	}

}
