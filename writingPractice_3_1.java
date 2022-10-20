import java.util.*;
public class writingPractice_3_1 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		mainMenu();

	}
	public static int randomInt(int n) {
		return ((int)(Math.random()*n+1));
	}
	public static void flipCoin(){
		String cpuStr="";
		System.out.println("Call heads or tails");
		String str=scan.next();
		int i = randomInt(2);
		if(i==1) {
			cpuStr="heads";
		}
		else if(i==2) {
			cpuStr="tails";
		}
		if(str.equals(cpuStr))
			System.out.println("Ok, I’m flipping the coin! I got: "+cpuStr+". You called it! ");
		else
			System.out.println("Ok, I’m flipping the coin! I got: "+cpuStr+". You did not call it!");
	}
	public static void rps(){
		int x=0;
		String cpuStr="";
		System.out.println("Human, let’s battle an epic game of rock, paper, scissors! Your choice: ");
		String str = scan.next();
		if(str.equals("rock"))
			x=1;
		else if(str.equals("paper"))
			x=2;
		else if(str.equals("scissors"))
			x=3;
		int i = randomInt(3);
		System.out.println(i);
		if(i==1) {
			cpuStr="rock";
		}
		else if(i==2) {
			cpuStr="paper";
		}
		else if(i==3) {
			cpuStr="scissors";
		}
		if(str.equals(cpuStr))
			System.out.println("Ok, I chose "+cpuStr+"! You are just as good as me, human!");
		else if(i==3&&x==2||i==2&&x==1||i==1&&x==3)
			System.out.println("Ok, I chose "+cpuStr+"! Haha, you are no match for me, human!");
		else if(x==3&&i==2||x==2&&i==1||x==1&&i==3)
			System.out.println("Ok, I chose "+cpuStr+"! How come you beat me, human!");
	}
	public static void magic8Ball() {
		System.out.println("Human, I can see into the FUTURE! Ask me a yes/no question:");
		scan.next();
		int i=randomInt(20);
		switch(i) {
			case 1:
				System.out.println("It is certain"); break;
			case 2:
				System.out.println("It is decidedly so"); break;
			case 3:
				System.out.println("Without a doubt"); break;
			case 4:
				System.out.println("Yes, definitely"); break;
			case 5:
				System.out.println("You may rely on it"); break;
			case 6:
				System.out.println("As I see it, yes"); break;
			case 7:
				System.out.println("Most likely"); break;
			case 8:
				System.out.println("Outlook good"); break;
			case 9:
				System.out.println("Yes"); break;
			case 10:
				System.out.println("Signs point to yes"); break;
			case 11:
				System.out.println("Reply hazy, try again"); break;
			case 12:
				System.out.println("Ask again later"); break;
			case 13:
				System.out.println("Better not tell you now"); break;
			case 14:
				System.out.println("Cannot predict now"); break;
			case 15:
				System.out.println("Concentrate and ask again"); break;
			case 16:
				System.out.println("Don’t count on it"); break;
			case 17:
				System.out.println("My reply is no"); break;
			case 18:
				System.out.println("My sources say no"); break;
			case 19:
				System.out.println("Outlook not so good"); break;
			case 20:
				System.out.println("Very doubtful"); break;
			default:
				System.out.println("I dont understand");
		}
			
	}
	public static void mainMenu() {
		System.out.println("Welcome to the console carnival!");
		System.out.println("--------------------------------");
		System.out.println("Shall we play a game?");
		System.out.println("\n1. Flip Coin");
		System.out.println("2. Rock, Paper, Scissors");
		System.out.println("3. Magic 8 Ball\n");
		System.out.println("What game do you want to play");
		int gameMode = scan.nextInt();
		if(gameMode==1) {
			flipCoin();
		}
		else if(gameMode==2) {
			rps();
		}
		else if(gameMode==3) {
			magic8Ball();
		}
	}
}
