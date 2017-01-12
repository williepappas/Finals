package Final_Projects;

import java.util.Scanner;

public class MadLib {

	public static void main(String[] args) {
		String place, anAdjective, aFemaleCelebrity, aBodyPart, aBodyPart2, aHumanOrgan, anAdjective2, aMaleCelebrity, anAdjective3,
		aBodyPart3, aBodyPart4, place2, aCelebrity, anAnimal, aVerb, aNumber, aBodyPart5, anAdjective4, anAdjective5, aVerbP;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("You are going to play Mad Libs today. To start, please enter the name of a place.");
		place = input.nextLine();
		
		System.out.println("Give an adjective");
		anAdjective = input.nextLine();
		
		System.out.println("Name a female celebrity");
		aFemaleCelebrity = input.nextLine();
		
		System.out.println("Name a body part");
		aBodyPart = input.nextLine();
		
		System.out.println("Name another body part");
		aBodyPart2 = input.nextLine();
		
		System.out.println("Name a human organ");
		aHumanOrgan = input.nextLine();
		
		System.out.println("Give another adjective");
		anAdjective2 = input.nextLine();
		
		System.out.println("Name a male celebrity");
		aMaleCelebrity = input.nextLine();
		 
		System.out.println("Give a third adjective");
		anAdjective3 = input.nextLine();
		
		System.out.println("Name a third body part");
		aBodyPart3 = input.nextLine();
		
		System.out.println("Name yet another body part");
		aBodyPart4 = input.nextLine();
		
		System.out.println("Name another place");
		place2 = input.nextLine();
		
		System.out.println("Name any celebrity");
		aCelebrity = input.nextLine();
		
		System.out.println("Name an animal");
		anAnimal = input.nextLine();
		
		System.out.println("Give a verb");
		aVerb = input.nextLine();
		
		System.out.println("Give a number");
		aNumber = input.nextLine();
		
		System.out.println("Name the last body part");
		aBodyPart5 = input.nextLine();
		
		System.out.println("Give yet another adjective");
		anAdjective4 = input.nextLine();
		
		System.out.println("Phew, almost done. Name one last adjective");
		anAdjective5 = input.nextLine();
		
		System.out.println("Lastly, at last! Give a verb in the past tense");
		aVerbP = input.nextLine();
		
		System.out.println("Once upon a time, in a place called " + place + ", there was a " + anAdjective + " princess named " + aFemaleCelebrity 
				+ ".\n Her kingdom was huge, but her " + aBodyPart + " was bigger.\n She was beautiful from her " + aBodyPart2 + " to her " + 
				aHumanOrgan + ".\n One day she saw a " + anAdjective2 + " prince named " + aMaleCelebrity + ".\n He had a " + anAdjective3 + 
				" face.\n As soon as his " + aBodyPart3 + " touched her " + aBodyPart4 + " they fell in love.\n They got married at " + 
				place2 + " the following day.\n Not long after they had a baby.\n They decided to name it " + aCelebrity + ".\n It looked like a "
				+ anAnimal + ".\n It used to " + aVerb + " " + aNumber + " times a day so that it's " + aBodyPart5 + " would be " + anAdjective4 + 
				" and " + anAdjective5 + ".\n And they " + aVerbP + " happily ever after!");
		
	}
	
}
