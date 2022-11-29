package prgs;

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lets play Rps");
		System.out.println("when i say 'Shoot',choose: Rock,paper,scissors");
		System.out.println("Are you ready? write yes if you are.");
		
		// task 1:if user want to play.
		
		String ready = scan.nextLine();
		if(ready.equals("yes")) {
			System.out.println("Great");
			System.out.println("rock-paper-scissors,shoot!");
			String choice = scan.nextLine();
			String computerChoice = computerChoice();
			System.out.println("you choose : " +choice);
			System.out.println("computer choice : "+computerChoice );
			String result = result(choice,computerChoice);
			System.out.println(result);
		}
		else {
			System.out.println("ok,some other time...!");
		}
		scan.close();
		
		}

	


/*set up the game*/





private static String computerChoice() {
	
		double randomNumber = Math.random()*3;
		int integer = (int)randomNumber;
		switch (integer) {
		case 0:return "rock";
		case 1:return "paper";
		case 2:return "scissors";	
		default:return null;
		}

}
 public static String result(String yourChoice,String computerChoice) {
	String result = "";
	
	if(yourChoice.equals("rock")&& computerChoice.equals("Scissors")) {
		result = "you win the game ";
	}
	else if(yourChoice.equals("Scissors")&& computerChoice.equals("rock")) {
		result = "you lose the game ";
	}
	else if(yourChoice.equals("paper")&& computerChoice.equals("rock")) {
		result = " you win the game ";
	}
	else if(yourChoice.equals("rock")&& computerChoice.equals("paper")) {
		result = " you lose the game ";
	}
	else if(yourChoice.equals("Scissors")&& computerChoice.equals("paper")) {
		result = " you win the game ";	
	}else if(yourChoice.equals("paper")&& computerChoice.equals("Scissors")) {
		result = " you lose the game ";	
	}else {
		result = "its tie";
	}
	
 return result;
 
 }
}
