package Final_Projects;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String answer;
		char correctA = 'a';
		char correctB = 'b';
		char correctC = 'c';
		int count = 0;
		char entryChar;
		int wrong = 0;
		
		String[] questions = {"1. What is my favorite hobby? \n\tA. Drawing \n\tB. Watching TV \n\tC. Java Coding", 
				"\n2. Where do I do this hobby? \n\tA. Home \n\tB. Work \n\tC. In Space", 
				"\n3. How much time do I spend on this hobby? \n\tA. 2 min \n\tB. A few hours \n\tC. All day",
				"\n4. When did I start this hobby? \n\tA. When I was 5 \n\tB. In August 2016 \n\tC. Just now", 
				"\n5. Who funds this hobby? \n\tA. I do \n\tB. My wife \n\tC. Jesus", 
				"\n6. Does my wife like this hobby? \n\tA. No \n\tB. Yes \n\tC. Does not care",
				"\n7. Why does it frustrate me? \n\tA. Not enough time to do it \n\tB. Not enough resources \n\tC. It is silly", 
				"\n8. How do I plan to make money off of this hobby? \n\tA. Yes \n\tB. No \n\tC. Maybe", 
				"\n9. How much does it cost? \n\tA. 2 pennies \n\tB. Nothing \n\tC. A million dollars",
				"\n10. When will I be finished? \n\tA. Never \n\tB. When Trump is president \n\tC. When I start hacking"};
		
		String[] answers = {"c", "a", "b", "b", "a", "c", "a", "a", "b", "c"};
		
		for(int x = 0; x < questions.length; ++x) {
			System.out.println(questions[x]);
		}
		
		System.out.println("\nWhat is the answer to #1?");
		answer = input.nextLine();
		entryChar = answer.charAt(0);
		
		while(Character.toLowerCase(entryChar) != correctA && Character.toLowerCase(entryChar) != correctB && Character.toLowerCase(entryChar) != correctC) {
			
			System.out.println("Enter correct input");
			answer = input.nextLine();
			entryChar = answer.charAt(0);
			
		}
		
		
		if(Character.toLowerCase(entryChar) == correctC) {
			System.out.println("correct!");
			count += 1;
		}else{
			System.out.println("Wrong! \nThe correct answer is " + correctC);
			wrong += 1;
		}
		
		System.out.println("\nWhat is the answer to #2?");
		answer = input.nextLine();
		entryChar = answer.charAt(0);
		
		while(Character.toLowerCase(entryChar) != correctA && Character.toLowerCase(entryChar) != correctB && Character.toLowerCase(entryChar) != correctC) {
			
			System.out.println("Enter correct input");
			answer = input.nextLine();
			entryChar = answer.charAt(0);
			
		}
		
		
		if(Character.toLowerCase(entryChar) == correctA) {
			System.out.println("correct!");
			count += 1;
		}else{
			System.out.println("Wrong! \nThe correct answer is " + correctA);
			wrong += 1;
		}
		
		
		System.out.println("\nWhat is the answer to #3?");
		answer = input.nextLine();
		entryChar = answer.charAt(0);
		
		while(Character.toLowerCase(entryChar) != correctA && Character.toLowerCase(entryChar) != correctB && Character.toLowerCase(entryChar) != correctC) {
			
			System.out.println("Enter correct input");
			answer = input.nextLine();
			entryChar = answer.charAt(0);
			
		}
		
		
		if(Character.toLowerCase(entryChar) == correctB) {
			System.out.println("correct!");
			count += 1;
		}else{
			System.out.println("Wrong! \nThe correct answer is " + correctB);
			wrong += 1;
		}
		
		System.out.println("\nWhat is the answer to #4?");
		answer = input.nextLine();
		entryChar = answer.charAt(0);
		
		while(Character.toLowerCase(entryChar) != correctA && Character.toLowerCase(entryChar) != correctB && Character.toLowerCase(entryChar) != correctC) {
			
			System.out.println("Enter correct input");
			answer = input.nextLine();
			entryChar = answer.charAt(0);
			
		}
		
		
		if(Character.toLowerCase(entryChar) == correctB) {
			System.out.println("correct!");
			count += 1;
		}else{
			System.out.println("Wrong! \nThe correct answer is " + correctB);
			wrong += 1;
		}
		
		System.out.println("\nWhat is the answer to #5?");
		answer = input.nextLine();
		entryChar = answer.charAt(0);
		
		while(Character.toLowerCase(entryChar) != correctA && Character.toLowerCase(entryChar) != correctB && Character.toLowerCase(entryChar) != correctC) {
			
			System.out.println("Enter correct input");
			answer = input.nextLine();
			entryChar = answer.charAt(0);
			
		}
		
		
		if(Character.toLowerCase(entryChar) == correctA) {
			System.out.println("correct!");
			count += 1;
		}else{
			System.out.println("Wrong! \nThe correct answer is " + correctA);
			wrong += 1;
		}
		
		System.out.println("\nWhat is the answer to #6?");
		answer = input.nextLine();
		entryChar = answer.charAt(0);
		
		while(Character.toLowerCase(entryChar) != correctA && Character.toLowerCase(entryChar) != correctB && Character.toLowerCase(entryChar) != correctC) {
			
			System.out.println("Enter correct input");
			answer = input.nextLine();
			entryChar = answer.charAt(0);
			
		}
		
		
		if(Character.toLowerCase(entryChar) == correctC) {
			System.out.println("correct!");
			count += 1;
		}else{
			System.out.println("Wrong! \nThe correct answer is " + correctC);
			wrong += 1;
		}
		
		System.out.println("\nWhat is the answer to #7?");
		answer = input.nextLine();
		entryChar = answer.charAt(0);
		
		while(Character.toLowerCase(entryChar) != correctA && Character.toLowerCase(entryChar) != correctB && Character.toLowerCase(entryChar) != correctC) {
			
			System.out.println("Enter correct input");
			answer = input.nextLine();
			entryChar = answer.charAt(0);
			
		}
		
		
		if(Character.toLowerCase(entryChar) == correctA) {
			System.out.println("correct!");
			count += 1;
		}else{
			System.out.println("Wrong! \nThe correct answer is " + correctA);
			wrong += 1;
		}
		
		System.out.println("\nWhat is the answer to #8?");
		answer = input.nextLine();
		entryChar = answer.charAt(0);
		
		while(Character.toLowerCase(entryChar) != correctA && Character.toLowerCase(entryChar) != correctB && Character.toLowerCase(entryChar) != correctC) {
			
			System.out.println("Enter correct input");
			answer = input.nextLine();
			entryChar = answer.charAt(0);
			
		}
		
		
		if(Character.toLowerCase(entryChar) == correctA) {
			System.out.println("correct!");
			count += 1;
		}else{
			System.out.println("Wrong! \nThe correct answer is " + correctA);
			wrong += 1;
		}
		
		System.out.println("\nWhat is the answer to #9?");
		answer = input.nextLine();
		entryChar = answer.charAt(0);
		
		while(Character.toLowerCase(entryChar) != correctA && Character.toLowerCase(entryChar) != correctB && Character.toLowerCase(entryChar) != correctC) {
			
			System.out.println("Enter correct input");
			answer = input.nextLine();
			entryChar = answer.charAt(0);
			
		}
		
		
		if(Character.toLowerCase(entryChar) == correctB) {
			System.out.println("correct!");
			count += 1;
		}else{
			System.out.println("Wrong! \nThe correct answer is " + correctB);
			wrong += 1;
		}
		
		System.out.println("\nWhat is the answer to #10?");
		answer = input.nextLine();
		entryChar = answer.charAt(0);
		
		while(Character.toLowerCase(entryChar) != correctA && Character.toLowerCase(entryChar) != correctB && Character.toLowerCase(entryChar) != correctC) {
			
			System.out.println("Enter correct input");
			answer = input.nextLine();
			entryChar = answer.charAt(0);
			
		}
		
		
		if(Character.toLowerCase(entryChar) == correctC) {
			System.out.println("correct!");
			count += 1;
		}else{
			System.out.println("Wrong! \nThe correct answer is " + correctC);
			wrong += 1;
		}
		
		System.out.println("You got " + count + " right and " + wrong + " wrong.");
	}
}
