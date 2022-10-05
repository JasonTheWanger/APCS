/* Jason Wang 
	October 4th
	Problem Set 2_2
	
 */
public class writing_Practice_2_2 {
	public static void main(String[] args) {
//		System.out.println(lastLetter("Hello, World!"));
//		System.out.println(nonStart("Hello", "World!"));
//		System.out.println(middleThree("Solving"));
//		System.out.println(swapLastTwo("Candy"));
//		System.out.println(frontAgain("edited"));
		//ex 1 test case
		System.out.println("EXERCISE 1 TEST CASES:");
		System.out.print("lastLetter(\"Hello, World!\") returns "); 
		System.out.println(lastLetter("Hello, World!"));
		System.out.print("lastLetter(\"Hello\") returns "); 
		System.out.println(lastLetter("Hello"));
		System.out.print("lastLetter(\"H\") returns "); 
		System.out.println(lastLetter("H"));
		// ex 2 test case 
		System.out.println("");
		System.out.println("EXERCISE 2 TEST CASES:");
		System.out.print("nonStart(\"Hello\", \"World!\") returns "); 
		System.out.println(nonStart("Hello", "World!"));
		System.out.print("nonStart(\"Java\", \"Code\") returns "); 
		System.out.println(nonStart("Java", "Code"));
		System.out.print("nonStart(\"H\", \"I\") returns "); 
		System.out.println(nonStart("H", "I"));
		// ex 3 test case
		System.out.println("");
		System.out.println("EXERCISE 3 TEST CASES:");
		System.out.print("middleThree(\"Candy\") returns "); 
		System.out.println(middleThree("Candy"));
		System.out.print("middleThree(\"Solving\") returns "); 
		System.out.println(middleThree("Solving"));
		System.out.print("middleThree(\"ABC\") returns "); 
		System.out.println(middleThree("ABC"));
		// ex 4 test case
		System.out.println("");
		System.out.println("EXERCISE 4 TEST CASES:");
		System.out.print("swapLastTwo(\"Candy\") returns "); 
		System.out.println(swapLastTwo("Candy"));
		System.out.print("swapLastTwo(\"GTA\") returns "); 
		System.out.println(swapLastTwo("GTA"));
		System.out.print("swapLastTwo(\"OK\") returns "); 
		System.out.println(swapLastTwo("OK"));
		// ex 5 test case
		System.out.println("");
		System.out.println("EXERCISE 5 TEST CASES:");
		System.out.print("frontAgain(\"edited\") returns "); 
		System.out.println(frontAgain("edited"));
		System.out.print("frontAgain(\"edit\") returns "); 
		System.out.println(frontAgain("edit"));
		System.out.print("frontAgain(\"ed\") returns "); 
		System.out.println(frontAgain("ed"));
	}
	public static String lastLetter(String str) {
		return str.substring(str.length()-1);
	}
	public static String nonStart(String str1, String str2) {
		return str1.substring(1)+str2.substring(1);
	}
	public static String middleThree(String str) {
		return str.substring(str.length()/2-1, str.length()/2+2);
	}
	public static String swapLastTwo(String str) {
		//first part of the string
		String str1= str.substring(0,str.length()-2);
		//second last letter
		String str2= str.substring(str.length()-2, str.length()-1);
		//last letter
		String str3= str.substring(str.length()-1);
		// concat string
		return str1+str3+str2;
	}
	public static boolean frontAgain(String str) {
		if(str.substring(0,2).equals(str.substring(str.length()-2))) {
			return true;
		}
		else {
			return false;
		}
	}
}
